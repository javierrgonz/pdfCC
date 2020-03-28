/**
 * The LoggingAspect
 */
package com.jrg.pdfcc.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * The LoggingAspect
 * 
 * @author Javier RG
 *
 */
@Aspect
@Component
public class HandleExceptionAspect {

    /** The logger **/
    private static Logger logger = LogManager.getLogger();

    /**
     * Manejador de excepciones
     * 
     * @param ex
     */
    @AfterThrowing(pointcut = "execution(* com.jrg.archetype.spring.simple.*.*.*(..))", throwing = "ex")
    public void logError(Exception ex) {
	logger.error(ex);
    }
}
