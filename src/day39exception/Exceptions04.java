package day39exception;

import java.io.FileNotFoundException;

public class Exceptions04 {

	public static void main(String[] args) {

		// null olarak tanýmlanmýs býr obje ýle uygun olmayan býr ýslem yapmaya calýstýgýnýzda
		//java nullPoýnterException verýr
		//Unchecked exception'dýr

		String str1 = " ";
		String str2 = "";
		String str3 = null;  // null býr deger degýldýr sadce str3'un hýcbýrseye esýt olmadýgýný
		                      //soyleyen býr ýsaretcýdýr(poýnter)
		
		System.out.println(str1.length());// 1
		System.out.println(str2.length());// 0
		//System.out.println(str3.length());//NullPointerException
	
		System.out.println(str3+ "bos");//nullbos
	}

}
