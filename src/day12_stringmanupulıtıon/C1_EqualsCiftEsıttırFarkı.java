package day12_stringmanupul�t�on;

public class C1_EqualsCiftEs�tt�rFark� {

	public static void main(String[] args) {
		//

		String str1 = "ali can";
		String str2 = str1 + "";
		System.out.println(str2);

		System.out.println(str1 == str2);// false
		// == Stringler�n hem degerler�ne hem de adresler�ne bakar
		// bu ornekte str1+"" yazd�g�m�zda concatenation yap�ld�g� �c�n java,
		// yen� b�r obje olusuturur ve �slem�n sonucunu yen� obje n�n �c�ne koyar.
		// str1 ile str2 y� == �le kars�last�r�sak degerler� ayn� fakat
		// adresler� farkl� olgugu �c�n false d�ner.

		System.out.println(str1.equals(str2));

		// equals methodu sadece stringler�n degerler�n� kars�last�r�r.
		// bu ornekte str1 �le str2 n�n degerler� ayn� oldugu �c�n true d�nd�r�r.

		String str3 = "fettah can";
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

	}

}
