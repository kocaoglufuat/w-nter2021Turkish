package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("rumeysa");
		System.out.println(sb1);// rumeysa

		sb1.append(" ").append("cetinturk"); // append methodu verýlen SB'NIN sonuna ýstedýgýmýz Strýng degerlerýný
												// ekler
		System.out.println(sb1); // rumeysa cetinturk

		String cumle = "javayý cok sever";
		sb1.append(cumle, 6, 10);// baska býr strýng den ýstedýgýmýz bolumu SB'nýn sonuna ekler
									// baslangýc ýndexý ýnclusýve, býtýs ýndexý exclusive'dýr
		System.out.println(sb1);// rumeysa cetinturk cok

		System.out.println(sb1.length()); // 21 SB'nýn uzunluk býlgýsýný verýr
		System.out.println(sb1.capacity()); // 23 (7+16) SB'nýn kapasýte býlgýsýný verýr

		System.out.println(sb1.charAt(2)); // m

		sb1.delete(17, 21); // SB nýn ýstedýgýmýz ýndex'lerý arasýndaký kýsmýný sýler
		System.out.println(sb1.delete(17, 21));// rumeysa cetinturk

		String isim = "rumeysa cetinturk";
		System.out.println(sb1.equals(isim));// false data turlerý farklý oldugu ýcýn
												// ýcerýgýn kýyaslanmasý mumkun degýldýr

		StringBuilder sb2 = new StringBuilder("rumeysa cetinturk");
		System.out.println(sb1.equals(sb2)); // false SB'DA EQUALS method'u string den farklý calýsýr
												// ancak ayný obje ýle kýyaslandýgýnda true verýr
												// string'deký == gýbý calýsýr
		System.out.println(sb1.indexOf("cetin"));// 8 SB de arama yapar
		System.out.println(sb1.indexOf("e", 6)); // 9 ýstedýgýmýz ýndexten sonra arama yapar

		System.out.println(sb1.indexOf("kazým"));// -1 aradýgýmýz String'i SB'da bulamazsa -1 dondurur

		System.out.println(sb1.insert(7, " "));// ýstedýgýmýz ýndexten ýtýbaren ýstenen strýngý ekler

		cumle = "merhaba dunya";
		System.out.println(sb1.insert(0, cumle, 0, 8)); // sb1.insert( index,str,offset,len)
														// 0 : sb da ýndex'den ýtýbaren eklenecek
														// cumle : hangý strýng'den eklenecek
														// 0 : cumlenýn hangý ýndexýnden baslanacak
														// 8 : bitiþ ýndexý
	sb1.insert(26, cumle, 8, 13);	//	merhaba rumeysa  cetinturkdunya
	System.out.println(sb1);
	

	System.out.println(sb1.lastIndexOf("t"));//22 ýstenen strýng'ýn kullanýldýgý son ýndexý verýr
	System.out.println(sb1.lastIndexOf("a", 22));//14 ýstenen ýndexten oncekýne bakar
	
	
	
	
	sb1.replace(8, 15, "seher"); // SB'nýn baslangýc ve býtýs ýndexlerý arasýndaký kýsmý
	                             // verýlen strýng ýle degýstýrýr
	System.out.println(sb1);// merhaba seher  cetinturkdunya
	
	sb1.reverse();// tersten yazdýrýr
	System.out.println(sb1);//aynudkrutnitec  rehes abahrem
	sb1.reverse();
	sb1.setCharAt(10, 'k');
	System.out.println(sb1);//merhaba seker  cetinturkdunya
	
	System.out.println(sb1.subSequence(8, 13));//seker SB'NIN ýstedýgýmýz ýndex'ler
	                                           //arasýndaký bolumunu verýr  
	System.out.println(sb1.substring(8));  //seker cetýnturkdunya                               // seker cetýnturdunya
                                          	//baslangýc ýndex'ýnden sona kadar
	StringBuilder sb3 = new StringBuilder("java cok guzel");
	StringBuilder sb4 = new StringBuilder("java cok guzel");
	System.out.println(sb3.equals(sb4));//false
	//ýcerýklerýnýn esýt olup olmadýgýna bakma ýcýn Strýng'deký equals method'unu kullanalým
	
	System.out.println(sb3.toString().equals(sb4.toString()));
	
	sb3.toString().concat("insanýn sevdýkce sevesý gelýyor");
	System.out.println(sb3);
	System.out.println(sb3.toString().concat("ýnsanýn sevdýkce sevesý gelýyor"));
	//java cok guzel ýnsanýn sevdýkce sevesý gelýyor
	
	System.out.println(sb1.length());//29
	System.out.println(sb1.capacity());//48
	sb1.trimToSize();//SB ýcýn hazýrlanan kapasýtedeký fazlalýklarý sýler
	                  // length ýle kapasýteyý esýt duruma getýrýr.

	}         
}
