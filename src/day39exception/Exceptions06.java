package day39exception;

public class Exceptions06 {

	public static void main(String[] args) {
//data turler�n� cast�ng yaparken uygun olmayan �slem yaparsan�z
		//java ClassCastException ver�r
		int say� = 10;
		// String str=say�;//CTE

		String str = "123456";

		System.out.println(str + 10);// 12345610==>yan yana

		int strSay� = Integer.parseInt(str);
		System.out.println(strSay� + 10);// 1234566==>toplama
		System.out.println(str + 20);// 12345620

		String str2 = "123a45";
	//	System.out.println(Integer.parseInt(str2)); // NumberFormatException

		Object say�2=40;
		String say�Str=(String) say�2;  // excplit narrowing casting
		                               //ClassCastException
	}

}
