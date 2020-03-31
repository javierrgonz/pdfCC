/**
 * The MainUtils
 */
package com.jrg.apps.pdfcc.utils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.jrg.apps.pdfcc.config.AppConfig;

/**
 * The MainUtils
 * 
 * @author Javier RG
 */
public class MainUtils {

	// The context
	private static AnnotationConfigApplicationContext ctx;

	/**
	 * Loads the application context
	 * 
	 * @return the application context
	 */
	public static AnnotationConfigApplicationContext loadAppContext() {

		// Loads app context
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		// Charge the context
		MainUtils.ctx = ctx;

		// Return ctx
		return ctx;
	}

	/**
	 * Returns the Application context
	 * 
	 * @return
	 */
	public static AnnotationConfigApplicationContext getAppContext() {
		return (MainUtils.ctx != null) ? MainUtils.ctx : MainUtils.loadAppContext();
	}

	/**
	 * Gets the environment
	 * 
	 * @return the Environment
	 */
	public static Environment getEnvironment() {
		if (MainUtils.ctx == null) {
			MainUtils.loadAppContext();
		}
		return MainUtils.ctx.getEnvironment();
	}

	/**
	 * Gets a property as String
	 * 
	 * @param property the property name
	 * @return the property
	 */
	public static String getProperty(String property) {
		return MainUtils.getEnvironment().getProperty(property);
	}
	
	/**
	 * Gets a bean using his reference
	 * 
	 * @param beanReference the bean reference
	 * @return the bean
	 */
	public static Object getBean(String beanReference) {
		return MainUtils.ctx.getBean(beanReference);
	}
}
