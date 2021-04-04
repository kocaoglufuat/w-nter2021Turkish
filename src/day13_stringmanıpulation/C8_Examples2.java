package day13_stringman�pulation;

public class C8_Examples2 {

	public static void main(String[] args) {
		
		
		/*string sekl�nde ver�len asag�dak� f�yatlar�n toplam�n� bulunuz
		string str1 = "13.99""
		string str2 = "10.55"
		ipucu : double.parseDouble() methodunu kullanab�l�r�z.
		*/
		
		String str1="$13.99";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		String str2="$10.55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		// str1 ve str2 �cer�g� say� olan String'lerd�r
		//parseDouble() veya parseInteger() methodu kullanab�l�r�z.
		//ancak pr�m�t�ve data t�pler� method'a sah�p olmad�klar�ndan wrapper class kullanmam laz�m.
		
		double say�1=Double.parseDouble(str1);
		double say�2=Double.parseDouble(str2);
		
		double toplam=(say�1+say�2)/100;
		System.out.println("$" + toplam);
		

	}

}
