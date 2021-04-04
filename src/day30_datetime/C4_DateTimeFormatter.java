package day30_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d");// 2021/Mar/19
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd");// 21/03/19
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy");// 19/03/21

		// M : month m : minute

		LocalDate tarih = LocalDate.now();

		System.out.println(dtf.format(tarih));// 2021/Mar/19
		System.out.println(dtf2.format(tarih));// 21/03/19
		System.out.println(dtf3.format(tarih));// 19/03/21

	}

}
