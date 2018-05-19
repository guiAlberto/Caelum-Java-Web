package br.com.caelum.agenda.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

	private static final String PATTERN = "dd/MM/yyyy";
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat(PATTERN);

	private static DateUtil instance;

	private DateUtil() {
	}

	public static DateUtil getInstance() {
		if (null == instance) {
			instance = new DateUtil();
		}
		return instance;
	}

	public static String stringify(Calendar data) {
		return DATE_FORMAT.format(data.getTime());
	}

}
