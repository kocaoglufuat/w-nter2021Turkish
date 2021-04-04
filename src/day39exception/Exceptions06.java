package day39exception;

public class Exceptions06 {

	public static void main(String[] args) {
//data turlerýný castýng yaparken uygun olmayan ýslem yaparsanýz
		//java ClassCastException verýr
		int sayý = 10;
		// String str=sayý;//CTE

		String str = "123456";

		System.out.println(str + 10);// 12345610==>yan yana

		int strSayý = Integer.parseInt(str);
		System.out.println(strSayý + 10);// 1234566==>toplama
		System.out.println(str + 20);// 12345620

		String str2 = "123a45";
	//	System.out.println(Integer.parseInt(str2)); // NumberFormatException

		Object sayý2=40;
		String sayýStr=(String) sayý2;  // excplit narrowing casting
		                               //ClassCastException
	}

}
