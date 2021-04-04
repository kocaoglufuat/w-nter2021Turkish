package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("rumeysa");
		System.out.println(sb1);// rumeysa

		sb1.append(" ").append("cetinturk"); // append methodu ver�len SB'NIN sonuna �sted�g�m�z Str�ng degerler�n�
												// ekler
		System.out.println(sb1); // rumeysa cetinturk

		String cumle = "javay� cok sever";
		sb1.append(cumle, 6, 10);// baska b�r str�ng den �sted�g�m�z bolumu SB'n�n sonuna ekler
									// baslang�c �ndex� �nclus�ve, b�t�s �ndex� exclusive'd�r
		System.out.println(sb1);// rumeysa cetinturk cok

		System.out.println(sb1.length()); // 21 SB'n�n uzunluk b�lg�s�n� ver�r
		System.out.println(sb1.capacity()); // 23 (7+16) SB'n�n kapas�te b�lg�s�n� ver�r

		System.out.println(sb1.charAt(2)); // m

		sb1.delete(17, 21); // SB n�n �sted�g�m�z �ndex'ler� aras�ndak� k�sm�n� s�ler
		System.out.println(sb1.delete(17, 21));// rumeysa cetinturk

		String isim = "rumeysa cetinturk";
		System.out.println(sb1.equals(isim));// false data turler� farkl� oldugu �c�n
												// �cer�g�n k�yaslanmas� mumkun deg�ld�r

		StringBuilder sb2 = new StringBuilder("rumeysa cetinturk");
		System.out.println(sb1.equals(sb2)); // false SB'DA EQUALS method'u string den farkl� cal�s�r
												// ancak ayn� obje �le k�yasland�g�nda true ver�r
												// string'dek� == g�b� cal�s�r
		System.out.println(sb1.indexOf("cetin"));// 8 SB de arama yapar
		System.out.println(sb1.indexOf("e", 6)); // 9 �sted�g�m�z �ndexten sonra arama yapar

		System.out.println(sb1.indexOf("kaz�m"));// -1 arad�g�m�z String'i SB'da bulamazsa -1 dondurur

		System.out.println(sb1.insert(7, " "));// �sted�g�m�z �ndexten �t�baren �stenen str�ng� ekler

		cumle = "merhaba dunya";
		System.out.println(sb1.insert(0, cumle, 0, 8)); // sb1.insert( index,str,offset,len)
														// 0 : sb da �ndex'den �t�baren eklenecek
														// cumle : hang� str�ng'den eklenecek
														// 0 : cumlen�n hang� �ndex�nden baslanacak
														// 8 : biti� �ndex�
	sb1.insert(26, cumle, 8, 13);	//	merhaba rumeysa  cetinturkdunya
	System.out.println(sb1);
	

	System.out.println(sb1.lastIndexOf("t"));//22 �stenen str�ng'�n kullan�ld�g� son �ndex� ver�r
	System.out.println(sb1.lastIndexOf("a", 22));//14 �stenen �ndexten oncek�ne bakar
	
	
	
	
	sb1.replace(8, 15, "seher"); // SB'n�n baslang�c ve b�t�s �ndexler� aras�ndak� k�sm�
	                             // ver�len str�ng �le deg�st�r�r
	System.out.println(sb1);// merhaba seher  cetinturkdunya
	
	sb1.reverse();// tersten yazd�r�r
	System.out.println(sb1);//aynudkrutnitec  rehes abahrem
	sb1.reverse();
	sb1.setCharAt(10, 'k');
	System.out.println(sb1);//merhaba seker  cetinturkdunya
	
	System.out.println(sb1.subSequence(8, 13));//seker SB'NIN �sted�g�m�z �ndex'ler
	                                           //aras�ndak� bolumunu ver�r  
	System.out.println(sb1.substring(8));  //seker cet�nturkdunya                               // seker cet�nturdunya
                                          	//baslang�c �ndex'�nden sona kadar
	StringBuilder sb3 = new StringBuilder("java cok guzel");
	StringBuilder sb4 = new StringBuilder("java cok guzel");
	System.out.println(sb3.equals(sb4));//false
	//�cer�kler�n�n es�t olup olmad�g�na bakma �c�n Str�ng'dek� equals method'unu kullanal�m
	
	System.out.println(sb3.toString().equals(sb4.toString()));
	
	sb3.toString().concat("insan�n sevd�kce seves� gel�yor");
	System.out.println(sb3);
	System.out.println(sb3.toString().concat("�nsan�n sevd�kce seves� gel�yor"));
	//java cok guzel �nsan�n sevd�kce seves� gel�yor
	
	System.out.println(sb1.length());//29
	System.out.println(sb1.capacity());//48
	sb1.trimToSize();//SB �c�n haz�rlanan kapas�tedek� fazlal�klar� s�ler
	                  // length �le kapas�tey� es�t duruma get�r�r.

	}         
}
