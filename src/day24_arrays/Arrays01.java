package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

		public static void main(String[] args) {
			int say�=10;
			int say�2=20;
			int say�3=30;
			String isim ="Ali";
			//javada b�r den fazla eleman� koyab�leceg�m�z (store) objeler vard�r
			// bugun bunlardan �lk�n� ogreneceg�z
			
			int arr[] = {10,20,30,}; //int[] arr sekl�nde kullan�lab�l�r
                                    // bu ornekte Arrya�n elemanlar�n� d�rek yazd�g�m 
			                        //�c�n uzunluk belirtmeye �ht�yac kalmad� 			
		                           // Bu kullan�mda max eleman say�s� (lenght) yazd�g�m�z eleman say�s�d�r.
		System.out.println(arr);    // Array b�r object d�r
		                           // eger d�rek olarak Array� yazd�rmak �stersen�z Java ref'i yazd�r�r.
		System.out.println(Arrays.toString(arr));
		
		String tak�m[]= new String[5]; // [null, null, null]
		System.out.println(Arrays.toString(tak�m));		
		
		tak�m[0]="Ali";
		System.out.println(Arrays.toString(tak�m));	
		tak�m[2]="hasan";
		tak�m[1]="fuat";
		System.out.println(Arrays.toString(tak�m));	
	//	tak�m[3]="mehmet"; // java Run t�me programd�r,dolay�s�yla array program� cal�st�r�l�nca
		                   // olusturulur. 31.sat�rda syntax olarak hata olmad�g�ndan CTE olmaz
                           // program cal�st�g�nda 3.index olmad�g� �c�n RTE ver�r
		// Array'dak� b�r elema�n� update etme
		// veli'n�n yer�ne kemal gelsin
		tak�m[1]="kemal";
		System.out.println(Arrays.toString(tak�m));	
		
		// b�r Array'�n uzunlugunu nas�l bulab�l�r�z.
		System.out.println(tak�m.length);// String'deki lenght() idi Array'da lenght
	
		//Array'deki son eleman� "mehmet" yap�n
		tak�m[tak�m.length-1]="mehmet";
		System.out.println(Arrays.toString(tak�m));
		
		// eger array'�n eleman say�s� tek �se ortadak� eleman� can yapal�m
		if (tak�m.length %2 ==1) {
			System.out.println("san");
		int ortaIndex= (tak�m.length-1)/2;
		tak�m[ortaIndex]="can";
		}
		System.out.println(Arrays.toString(tak�m));
		
		}
	

}
