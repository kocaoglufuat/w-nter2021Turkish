package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
	
		//toplama(list); varargs esnek oldugu ýcýn list'e benzese de list degýldýr
		
		int arr[]= {15,20,25};
		toplama(arr);//varargs array olarak calýsýr ve argument olarak array yollanabýlýr
		
		// kullanýcýdan deger alarak varargs calýstýrmak ýstýyorsak
		//girilen degerlerý býr array'a kaydetmelýyýz
		// bunun ýcýn kullanýcýdan aldýgýmýz degerlerý esnek oldugu ýcýn býr lýst'e koyarýz
		//sonra list'ý array'e cevýrýrýz
		
		}

	

	public static void toplama( int...var ) { // data turunden sonra yazdýgýmýz ... varargs kullanacagýmýz anlamýna gelýr
		
        int toplam=0;
		for (int each : var) {
			toplam+=each;
		}
		
	System.out.println(toplam);
	
	
	
		}
	
	
}
