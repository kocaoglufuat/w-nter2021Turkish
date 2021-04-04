package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder();//boþ býr strýngBuilder (SB) olusturur.
		System.out.println("SB1 :"+sb1);
		
		StringBuilder sb2= new StringBuilder("mehmet");//icinde mehmet degerý olan býr strýngBuilder ()uretir
		System.out.println("sb2 :" + sb2);
		
		StringBuilder sb3= new StringBuilder(10);//10 karakter kapasýtesý olan býr SB uretýr
		System.out.println("sb3 :" + sb3);
		
		sb1.append(" hoca");		
		System.out.println("SB1 append :"+sb1);  //hoca                                                                                                       

	
		sb2.append(" hoca");		
		System.out.println("SB2 append :"+sb2); // mehmet hoca      
	
	     System.out.println("sb1 uzunluk" + sb1.length());// 5 " hoca"
	     System.out.println("sb1 uzunluk" + sb1.capacity());// 16 býr deger yazmadýgýmýz ýcýn default.capacýty 16 verdý
		

	     System.out.println("sb2 uzunluk" + sb2.length());// 11 mehmet hoca
	     System.out.println("sb2 uzunluk" + sb2.capacity());// 22 basta býz 6 olusturduk 16 default deger
		
	     // capacity hafýza yonetýmý ýcýn cok onemlý
	    // kod yazarken sabýt uzunluk veya max.uzunluk bellý ýse
	     //3.method ýle olusturarak HAFIZA KULLANIMINI optýmýze edebýlýrýz
	
	}

}
