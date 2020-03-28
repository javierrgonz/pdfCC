package com.jrg.pdfcc.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jrg.pdfcc.components.ComponentWithValueCharge;
import com.jrg.pdfcc.constants.MessageConstants;
import com.jrg.pdfcc.utils.MainUtils;
import com.jrg.pdfcc.utils.MessageUtils;

/**
 * The Main
 * 
 * @author Javier RG
 */
public class Main {

    // Gets the logger
    private static Logger logger = LogManager.getLogger();

    /**
     * The main method
     * 
     * @param args
     */
    public static void main(String[] args) {

	// Loads application context
	MainUtils.loadAppContext();

	// Log start
	logger.debug(MessageUtils.getMessage(MessageConstants.APP_START_MSG));

	// Loads component with value charge
	ComponentWithValueCharge componentWithValueCharge = (ComponentWithValueCharge) MainUtils.getAppContext()
		.getBean("componentWithValueCharge");

    }
}
