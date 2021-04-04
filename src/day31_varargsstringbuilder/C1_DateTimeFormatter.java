package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMM/dd hh:mm");
		System.out.println(dtf.format(ldt));// 21/Mar/21 08:47

		/*
		 * yy : yýlýn son ýký rakamýný yyyy: yýlýn tamamýný M : ay sýrasýný verýr mart
		 * ýcýn : 3 MM : ay sýrasýný verýr mart ýcýn :03 MMM : Ay ýsmýnýn ýlk uc harfýný
		 * verýr MMMM : Ay ýsmýnýn tamamýný verýr
		 */

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd ");
		System.out.println(dtf2.format(ldt));// 21/Mar/21

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf3.format(ldt));// 20:50 24 saatlýk sýsteme gore

		LocalDate dogumTarýhý = LocalDate.of(1993, 05, 04);
		LocalDate bugun = LocalDate.now();

		Period benýmYasým = Period.between(bugun, dogumTarýhý);
		System.out.println(benýmYasým);//P-26Y-2M-9D
	
	int yas=Period.between(dogumTarýhý, bugun).getYears();
	System.out.println(yas);//26
	
	
	}

}
