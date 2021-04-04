package day25Arrays;

import java.util.Arrays;

public class MultıDımensıonalArrays01 {

	public static void main(String[] args) {
	/* 1- ıc ıce array olusturudugumuzda dısardakı ana array'E outer aray
	 * icerdekı kucuk array'lere ıse ınner array denır
	 * 2- eger ıcerdekı array'lerın boyutları bırbırınden farklı ıse array'i
	 * acank tum elemanları yazarak declare edebiliriz
	 * 3-multı dımensıonal array'de bır elemanın ındexı ıcın
	 * en dısdakı array harıc, elemana kadar ıcı ıce olan tum arraylerın
	 * indexlerını ındexlerını yazmak gerekır
*/
	int arr [][]= {{1,3,5},{3,5},{5,9,11,3}};//iki katlı bır array'dır
	
	//11'ı ındex ıle ıfade etmek ıstersek arr[2][2]
	// eger array'ı uzunlukta declare etmek ıstersek ınner array uzunlukları esıt olmalı
	
	int arr2[][]=new int [2][];
	// [3] ilk  yazılan satı outer array'ın ıcınde kac tane ınner array oldugunu belırtır
	//[2] her bır ınner array'ın uzunlugu
	System.out.println(Arrays.toString(arr2));
	// Multıdıemensıonal array'lerı yazdırmak ıcın toString method'u kullanılmaz
	//outer array'ın ıcınde ınner array'ler oldugundan toString methodun'da ınner array'lerım
	//referans degerlerı yazdırılabılır
	System.out.println(Arrays.deepToString(arr2));
	}

}
