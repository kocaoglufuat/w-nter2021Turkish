package day11StringMonýpuýýletýons;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
	
		//str.tolowerCase() verýlen String'in tamamýný kucuk harfe cevýrýr. 
		//str.toupperCase() verýlen String'in tamamýný buyuk harda cevýrýr.
		
		String str ="Techproeducation";
		System.out.println(str.toUpperCase());
		
		str=str.toUpperCase();// bu satýrdan sonra str BUYUK harflerden olusan býr strýng
		System.out.println(str);
		
		System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
		
		
		
		
		
		
	}

}
