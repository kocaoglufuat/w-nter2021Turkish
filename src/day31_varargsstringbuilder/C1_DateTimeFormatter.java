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
		 * yy : y�l�n son �k� rakam�n� yyyy: y�l�n tamam�n� M : ay s�ras�n� ver�r mart
		 * �c�n : 3 MM : ay s�ras�n� ver�r mart �c�n :03 MMM : Ay �sm�n�n �lk uc harf�n�
		 * ver�r MMMM : Ay �sm�n�n tamam�n� ver�r
		 */

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd ");
		System.out.println(dtf2.format(ldt));// 21/Mar/21

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf3.format(ldt));// 20:50 24 saatl�k s�steme gore

		LocalDate dogumTar�h� = LocalDate.of(1993, 05, 04);
		LocalDate bugun = LocalDate.now();

		Period ben�mYas�m = Period.between(bugun, dogumTar�h�);
		System.out.println(ben�mYas�m);//P-26Y-2M-9D
	
	int yas=Period.between(dogumTar�h�, bugun).getYears();
	System.out.println(yas);//26
	
	
	}

}
