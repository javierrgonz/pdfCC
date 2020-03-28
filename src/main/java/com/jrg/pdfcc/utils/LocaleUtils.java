/**
 * The LocaleUtils
 */
package com.jrg.pdfcc.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jrg.pdfcc.constants.ConfigConstants;

/**
 * The LocaleUtils
 * 
 * @author Javier RG
 */
public class LocaleUtils {

    // The default locale
    private static Locale defaultLocale;

    private static Logger logger = LogManager.getLogger();

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
	String localeProp = MainUtils.getStringProperty(ConfigConstants.DEFAULT_LANGUAGE);
	List<Locale> locales = Arrays.asList(Locale.getAvailableLocales());
	for (Locale locale : locales) {
	    if (locale.toLanguageTag().equals(localeProp)) {
		LocaleUtils.defaultLocale = locale;
	    }
	}

	// Return locale
	return LocaleUtils.defaultLocale;
    }

}
