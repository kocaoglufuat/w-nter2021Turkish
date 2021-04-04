package day13_stringman�pulation;

public class C6_Substring {

	public static void main(String[] args) {
		
		String str="Her ders Java g�b� olsa";
		
		// str' ilk 10 harf�n� * �le g�zley�n ger�ye kalanlar normal yaz�ls�n
		
		System.out.println(str.substring(10));//10. �ndex(inclusive) dah�l sonuna kadar tum String
		System.out.println(str.substring(str.length()-10));//son 10 harf� yazdr��n.
		
		//�lk 10 karakter� almak
		System.out.println(str.substring(0, 10));//substring(0,10)yaz�ld�g�nda
		                                         //0 �nclus�ve,10 exclus�ve
		
		//11.c� karakterden sonuna kadar olan stringi yazd�ral�m.
		System.out.println(str.substring(10));
		
		// str' ilk 10 harf�n� * �le g�zley�n ger�ye kalanlar normal yaz�ls�n
		
		System.out.println("**********"+ str.substring(10));
		
		
		System.out.println(str.substring(10, 10));// baslang�c indexi olsun der,ama bitis index i
		                                          //olmas�n der, java son soylenen� yapar

		//System.out.println(str.substring(8, 9));//RTE
		
		System.out.println(str.substring(22));//length()-1 ->son karakter ver�r
		System.out.println(str.substring(23));//length()    ->  bos
		//System.out.println(str.substring(24));//length()'den buyuk say� yazarsak RTE
		
		
		String str3=str.substring(0, 10);//str'n�n 10 karakter�n� ald�k.
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3);
		
		
	}

}
