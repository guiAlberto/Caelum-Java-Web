package br.com.caelum.agenda.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

	public static Calendar calendarfy(String data) throws ParseException {
		if (isValidDate(data)) {
			Date date = new SimpleDateFormat(PATTERN).parse(data);
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			return dataNascimento;
		}
		throw new ParseException(data, 0);
	}

	private static boolean isValidDate(String data) {
		String[] split = data.split("/");
		if (split.length != 3) {
			return false;
		}

		int dia = Integer.parseInt(split[0]);
		int mes = Integer.parseInt(split[1]);

		if (dia < 0 || dia > 31) {
			return false;
		}

		if (mes < 0 || mes > 12) {
			return false;
		}

		return true;
	}

}
