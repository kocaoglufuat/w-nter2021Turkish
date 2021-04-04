package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder();//bo� b�r str�ngBuilder (SB) olusturur.
		System.out.println("SB1 :"+sb1);
		
		StringBuilder sb2= new StringBuilder("mehmet");//icinde mehmet deger� olan b�r str�ngBuilder ()uretir
		System.out.println("sb2 :" + sb2);
		
		StringBuilder sb3= new StringBuilder(10);//10 karakter kapas�tes� olan b�r SB uret�r
		System.out.println("sb3 :" + sb3);
		
		sb1.append(" hoca");		
		System.out.println("SB1 append :"+sb1);  //hoca                                                                                                       

	
		sb2.append(" hoca");		
		System.out.println("SB2 append :"+sb2); // mehmet hoca      
	
	     System.out.println("sb1 uzunluk" + sb1.length());// 5 " hoca"
	     System.out.println("sb1 uzunluk" + sb1.capacity());// 16 b�r deger yazmad�g�m�z �c�n default.capac�ty 16 verd�
		

	     System.out.println("sb2 uzunluk" + sb2.length());// 11 mehmet hoca
	     System.out.println("sb2 uzunluk" + sb2.capacity());// 22 basta b�z 6 olusturduk 16 default deger
		
	     // capacity haf�za yonet�m� �c�n cok oneml�
	    // kod yazarken sab�t uzunluk veya max.uzunluk bell� �se
	     //3.method �le olusturarak HAFIZA KULLANIMINI opt�m�ze edeb�l�r�z
	
	}

}
