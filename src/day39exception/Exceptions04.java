package day39exception;

import java.io.FileNotFoundException;

public class Exceptions04 {

	public static void main(String[] args) {

		// null olarak tan�mlanm�s b�r obje �le uygun olmayan b�r �slem yapmaya cal�st�g�n�zda
		//java nullPo�nterException ver�r
		//Unchecked exception'd�r

		String str1 = " ";
		String str2 = "";
		String str3 = null;  // null b�r deger deg�ld�r sadce str3'un h�cb�rseye es�t olmad�g�n�
		                      //soyleyen b�r �saretc�d�r(po�nter)
		
		System.out.println(str1.length());// 1
		System.out.println(str2.length());// 0
		//System.out.println(str3.length());//NullPointerException
	
		System.out.println(str3+ "bos");//nullbos
	}

}
