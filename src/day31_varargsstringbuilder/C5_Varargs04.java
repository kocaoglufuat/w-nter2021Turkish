package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
	
		//toplama(list); varargs esnek oldugu �c�n list'e benzese de list deg�ld�r
		
		int arr[]= {15,20,25};
		toplama(arr);//varargs array olarak cal�s�r ve argument olarak array yollanab�l�r
		
		// kullan�c�dan deger alarak varargs cal�st�rmak �st�yorsak
		//girilen degerler� b�r array'a kaydetmel�y�z
		// bunun �c�n kullan�c�dan ald�g�m�z degerler� esnek oldugu �c�n b�r l�st'e koyar�z
		//sonra list'� array'e cev�r�r�z
		
		}

	

	public static void toplama( int...var ) { // data turunden sonra yazd�g�m�z ... varargs kullanacag�m�z anlam�na gel�r
		
        int toplam=0;
		for (int each : var) {
			toplam+=each;
		}
		
	System.out.println(toplam);
	
	
	
		}
	
	
}
