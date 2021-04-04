package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	private static Object arr;

	public static void main(String[] args) {
		// ver�len b�r array'�n list'e nas�l cev�reb�l�r�z
		String arr[] = { "ali,mehmet" };

		List<String> listArr = Arrays.asList(arr);
		System.out.println(listArr);

		Integer arr1[] = { 1, 2, 3 };
		List<Integer> list2 = Arrays.asList(arr1);
		System.out.println(list2);

		// bazen cok fazla eleman� olan b�r l�ste olusturmam�z gerek�r
		// bu durumda liste elemanlar�n� tek tek eklemek yer�ne
		// elemanlar� b�r Array'e ekler ,sonra da array'i list'e cevirebilirz
		// ornek b�r web s�tes�nde tum urunler� b�r l�steye eklemek �sted�g�m�zde

		// ancak bu method'la array'den cevirdigimiz list esnek olmaz
		/// array'�n ozell�kler�n� tas�r) add(), remove(), clear() g�b� uzunlugu
		// etk�leyen methodlar kullan�r
		// java bu deg�s�mdek� Array ve list i senkron�ze eder,birinde yapt�g�m�z
		// deg�s�kl�k
		// otomat�k olarak deger�n� de updete eder.
		arr1[1] = 5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2 : " + list2);

		list2.set(2, 13);
		System.out.println(list2);

	}

}
