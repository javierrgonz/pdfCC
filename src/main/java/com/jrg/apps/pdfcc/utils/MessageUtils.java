/**
 * The MessageUtils
 */
package com.jrg.apps.pdfcc.utils;

import java.util.List;
import java.util.Locale;

import org.springframework.util.CollectionUtils;

/**
 * The MessageUtils
 * 
 * @author Javier RG
 */
public class MessageUtils {

    /**
     * Gets a message in the locale language defined, If is null, returns the
     * message in the default locale
     * 
     * @param message
     * @param locale
     * @return
     */
    public static String getMessage(String message, Locale locale) {
		if (locale != null) {
		    return MainUtils.getAppContext().getMessage(message, null, locale);
		}
		return MessageUtils.getMessage(message);
    }

    /**
     * Gets the message in the default locale
     * 
     * @param message
     * @return
     */
    public static String getMessage(String message) {
    	return MainUtils.getAppContext().getMessage(message, null, LocaleUtils.getDefaultLocale());
    }
    
    /**
     * Build a mssg using a list, with the separator between every msg if is informed
     * 
     * @param mssgList the mssgList
     * @param separator the separator
     * @return a string with the messages separed by the separator if exists
     */
    public static String getMessage(List<String> mssgList, String separator) {
    	String msg = "";
    	
    	if (!CollectionUtils.isEmpty(mssgList)) {
    		for (int i = 0; i < mssgList.size(); i++) {
    			msg = msg.concat(mssgList.get(i));
    			if ((separator != null) && (i != mssgList.size()-1)) {
    				msg = msg.concat(separator);
    			}
    		}
    	}
    	
    	return msg; 
    }
}
