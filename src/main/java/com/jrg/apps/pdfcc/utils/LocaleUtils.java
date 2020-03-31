/**
 * The LocaleUtils
 */
package com.jrg.apps.pdfcc.utils;

import java.util.Arrays;
import java.util.Locale;

import com.jrg.apps.pdfcc.constants.ConfigConstants;

/**
 * The LocaleUtils
 * 
 * @author Javier RG
 */
public class LocaleUtils {

    /** The default locale **/
    private static Locale defaultLocale;

    /**
     * Obtains the default locale as set on settings
     * 
     * @return
     */
    public static Locale getDefaultLocale() {

	// If default locale is not null
	if (LocaleUtils.defaultLocale != null) {
	    return LocaleUtils.defaultLocale;
	}

	// Else get locale from properties
	String localeProp = MainUtils.getProperty(ConfigConstants.DEFAULT_LANGUAGE);
	for (Locale locale : Arrays.asList(Locale.getAvailableLocales())) {
	    if (locale.toLanguageTag().equals(localeProp)) {
		LocaleUtils.defaultLocale = locale;
	    }
	}

	// Return locale
	return LocaleUtils.defaultLocale;
    }

}
