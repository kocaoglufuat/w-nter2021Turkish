package day11StringMon�pu��let�ons;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
	
		//str.tolowerCase() ver�len String'in tamam�n� kucuk harfe cev�r�r. 
		//str.toupperCase() ver�len String'in tamam�n� buyuk harda cev�r�r.
		
		String str ="Techproeducation";
		System.out.println(str.toUpperCase());
		
		str=str.toUpperCase();// bu sat�rdan sonra str BUYUK harflerden olusan b�r str�ng
		System.out.println(str);
		
		System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
	}

}
