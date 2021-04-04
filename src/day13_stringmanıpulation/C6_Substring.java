package day13_stringmanýpulation;

public class C6_Substring {

	public static void main(String[] args) {
		
		String str="Her ders Java gýbý olsa";
		
		// str' ilk 10 harfýný * ýle gýzleyýn gerýye kalanlar normal yazýlsýn
		
		System.out.println(str.substring(10));//10. ýndex(inclusive) dahýl sonuna kadar tum String
		System.out.println(str.substring(str.length()-10));//son 10 harfý yazdrýýn.
		
		//ýlk 10 karakterý almak
		System.out.println(str.substring(0, 10));//substring(0,10)yazýldýgýnda
		                                         //0 ýnclusýve,10 exclusýve
		
		//11.cý karakterden sonuna kadar olan stringi yazdýralým.
		System.out.println(str.substring(10));
		
		// str' ilk 10 harfýný * ýle gýzleyýn gerýye kalanlar normal yazýlsýn
		
		System.out.println("**********"+ str.substring(10));
		
		
		System.out.println(str.substring(10, 10));// baslangýc indexi olsun der,ama bitis index i
		                                          //olmasýn der, java son soylenený yapar

		//System.out.println(str.substring(8, 9));//RTE
		
		System.out.println(str.substring(22));//length()-1 ->son karakter verýr
		System.out.println(str.substring(23));//length()    ->  bos
		//System.out.println(str.substring(24));//length()'den buyuk sayý yazarsak RTE
		
		
		String str3=str.substring(0, 10);//str'nýn 10 karakterýný aldýk.
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3);
		
		
	}

}
