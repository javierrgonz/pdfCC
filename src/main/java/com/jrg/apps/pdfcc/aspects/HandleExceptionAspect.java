/**
 * The LoggingAspect
 */
package com.jrg.apps.pdfcc.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.jrg.apps.pdfcc.constants.MessageConstants;
import com.jrg.apps.pdfcc.utils.LoggerUtils;
import com.jrg.apps.pdfcc.utils.MessageUtils;

/**
 * The LoggingAspect
 * 
 * @author Javier RG
 *
 */
@Aspect
@Component
public class HandleExceptionAspect {

	/**
	 * Manejador de excepciones
	 * 
	 * @param ex
	 */
	@AfterThrowing(pointcut = "execution(* com.jrg.apps.pdfcc.*.*.*(..))", throwing = "ex")
	public void logError(JoinPoint joinPoint, Exception ex) {
		LoggerUtils.log(
				MessageUtils.getMessage(
						Arrays.asList(joinPoint.toShortString(), 
									  MessageUtils.getMessage(MessageConstants.AOP_EXCEPCION_LANZADA),
									  ex.toString()),
						" - ")
				);
	}
}
