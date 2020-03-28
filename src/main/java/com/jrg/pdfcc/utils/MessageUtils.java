/**
 * The MessageUtils
 */
package com.jrg.pdfcc.utils;

import java.util.Locale;

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
}
