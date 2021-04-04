package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	private static Object arr;

	public static void main(String[] args) {
		// verýlen býr array'ýn list'e nasýl cevýrebýlýrýz
		String arr[] = { "ali,mehmet" };

		List<String> listArr = Arrays.asList(arr);
		System.out.println(listArr);

		Integer arr1[] = { 1, 2, 3 };
		List<Integer> list2 = Arrays.asList(arr1);
		System.out.println(list2);

		// bazen cok fazla elemaný olan býr lýste olusturmamýz gerekýr
		// bu durumda liste elemanlarýný tek tek eklemek yerýne
		// elemanlarý býr Array'e ekler ,sonra da array'i list'e cevirebilirz
		// ornek býr web sýtesýnde tum urunlerý býr lýsteye eklemek ýstedýgýmýzde

		// ancak bu method'la array'den cevirdigimiz list esnek olmaz
		/// array'ýn ozellýklerýný tasýr) add(), remove(), clear() gýbý uzunlugu
		// etkýleyen methodlar kullanýr
		// java bu degýsýmdeký Array ve list i senkronýze eder,birinde yaptýgýmýz
		// degýsýklýk
		// otomatýk olarak degerýný de updete eder.
		arr1[1] = 5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2 : " + list2);

		list2.set(2, 13);
		System.out.println(list2);

	}

}
