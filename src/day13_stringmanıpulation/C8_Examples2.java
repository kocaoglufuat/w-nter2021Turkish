package day13_stringmanýpulation;

public class C8_Examples2 {

	public static void main(String[] args) {
		
		
		/*string seklýnde verýlen asagýdaký fýyatlarýn toplamýný bulunuz
		string str1 = "13.99""
		string str2 = "10.55"
		ipucu : double.parseDouble() methodunu kullanabýlýrýz.
		*/
		
		String str1="$13.99";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		String str2="$10.55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		// str1 ve str2 ýcerýgý sayý olan String'lerdýr
		//parseDouble() veya parseInteger() methodu kullanabýlýrýz.
		//ancak prýmýtýve data týplerý method'a sahýp olmadýklarýndan wrapper class kullanmam lazým.
		
		double sayý1=Double.parseDouble(str1);
		double sayý2=Double.parseDouble(str2);
		
		double toplam=(sayý1+sayý2)/100;
		System.out.println("$" + toplam);
		

	}

}
