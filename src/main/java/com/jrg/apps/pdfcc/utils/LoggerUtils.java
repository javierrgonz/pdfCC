/**
 * 
 */
package com.jrg.apps.pdfcc.utils;

import org.tinylog.Logger;

import com.jrg.apps.pdfcc.constants.ConfigConstants;

/**
 * The LoggerUtils
 * 
 * @author Javier RG
 *
 */
public class LoggerUtils {

	/**
	 * Logs the message in the config level
	 * 
	 * @param msg
	 */
	public static void log(String msg) {
		final String LOG_LEVEL = MainUtils.getProperty(ConfigConstants.LOGGER_LEVEL);
		switch (LOG_LEVEL) {
			case ("ERROR") :
				Logger.error(msg);
				break;
			case ("WARN") :
				Logger.warn(msg);
				break;
			case ("INFO") :
				Logger.info(msg);
				break;
			case ("DEBUG") :
				Logger.debug(msg);
				break;
			case ("TRACE") :
				Logger.trace(msg);
				break;
			default :
				Logger.error(msg);
				break;
		}
	}

}
