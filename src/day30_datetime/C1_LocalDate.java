package day30_datetime;

import java.time.LocalDate;
import java.util.Locale;

public class C1_LocalDate {

	public static void main(String[] args) {
	

		LocalDate tarih = LocalDate.now();
		System.out.println(tarih);
		
		
		System.out.println(tarih.plusWeeks(20));
		System.out.println(tarih.plusDays(5));
	System.out.println(tarih.plusYears(5).plusMonths(5));
	System.out.println(tarih.minusYears(3).minusMonths(5).minusDays(15));
	System.out.println(tarih.getDayOfYear());//78
	System.out.println(tarih.getMonthValue());//3
	System.out.println(tarih.getDayOfWeek());//friday
	
	System.out.println(tarih.isLeapYear());
	//eger suanký tarýh ýle degýlde eský býr tarýh ýle ýslem yapacaksak
	//local date of() modunu kullanýyoruz
	
	LocalDate tarih1= LocalDate.of(1995, 12, 15);
	LocalDate tarih2= LocalDate.of(1995, 12, 10);
	System.out.println(tarih1.isAfter(tarih2));
	System.out.println(tarih1.isBefore(tarih2));
	System.out.println(tarih.getDayOfYear());
	}

}
