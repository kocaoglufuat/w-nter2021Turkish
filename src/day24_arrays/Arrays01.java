package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

		public static void main(String[] args) {
			int sayý=10;
			int sayý2=20;
			int sayý3=30;
			String isim ="Ali";
			//javada býr den fazla elemaný koyabýlecegýmýz (store) objeler vardýr
			// bugun bunlardan ýlkýný ogrenecegýz
			
			int arr[] = {10,20,30,}; //int[] arr seklýnde kullanýlabýlýr
                                    // bu ornekte Arryaýn elemanlarýný dýrek yazdýgým 
			                        //ýcýn uzunluk belirtmeye ýhtýyac kalmadý 			
		                           // Bu kullanýmda max eleman sayýsý (lenght) yazdýgýmýz eleman sayýsýdýr.
		System.out.println(arr);    // Array býr object dýr
		                           // eger dýrek olarak Arrayý yazdýrmak ýstersenýz Java ref'i yazdýrýr.
		System.out.println(Arrays.toString(arr));
		
		String takým[]= new String[5]; // [null, null, null]
		System.out.println(Arrays.toString(takým));		
		
		takým[0]="Ali";
		System.out.println(Arrays.toString(takým));	
		takým[2]="hasan";
		takým[1]="fuat";
		System.out.println(Arrays.toString(takým));	
	//	takým[3]="mehmet"; // java Run týme programdýr,dolayýsýyla array programý calýstýrýlýnca
		                   // olusturulur. 31.satýrda syntax olarak hata olmadýgýndan CTE olmaz
                           // program calýstýgýnda 3.index olmadýgý ýcýn RTE verýr
		// Array'daký býr elemaýný update etme
		// veli'nýn yerýne kemal gelsin
		takým[1]="kemal";
		System.out.println(Arrays.toString(takým));	
		
		// býr Array'ýn uzunlugunu nasýl bulabýlýrýz.
		System.out.println(takým.length);// String'deki lenght() idi Array'da lenght
	
		//Array'deki son elemaný "mehmet" yapýn
		takým[takým.length-1]="mehmet";
		System.out.println(Arrays.toString(takým));
		
		// eger array'ýn eleman sayýsý tek ýse ortadaký elemaný can yapalým
		if (takým.length %2 ==1) {
			System.out.println("san");
		int ortaIndex= (takým.length-1)/2;
		takým[ortaIndex]="can";
		}
		System.out.println(Arrays.toString(takým));
		
		}
	

}
