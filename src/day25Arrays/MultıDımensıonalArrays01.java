package day25Arrays;

import java.util.Arrays;

public class Mult�D�mens�onalArrays01 {

	public static void main(String[] args) {
	/* 1- �c �ce array olusturudugumuzda d�sardak� ana array'E outer aray
	 * icerdek� kucuk array'lere �se �nner array den�r
	 * 2- eger �cerdek� array'ler�n boyutlar� b�rb�r�nden farkl� �se array'i
	 * acank tum elemanlar� yazarak declare edebiliriz
	 * 3-mult� d�mens�onal array'de b�r eleman�n �ndex� �c�n
	 * en d�sdak� array har�c, elemana kadar �c� �ce olan tum arrayler�n
	 * indexler�n� �ndexler�n� yazmak gerek�r
*/
	int arr [][]= {{1,3,5},{3,5},{5,9,11,3}};//iki katl� b�r array'd�r
	
	//11'� �ndex �le �fade etmek �stersek arr[2][2]
	// eger array'� uzunlukta declare etmek �stersek �nner array uzunluklar� es�t olmal�
	
	int arr2[][]=new int [2][];
	// [3] ilk  yaz�lan sat� outer array'�n �c�nde kac tane �nner array oldugunu bel�rt�r
	//[2] her b�r �nner array'�n uzunlugu
	System.out.println(Arrays.toString(arr2));
	// Mult�d�emens�onal array'ler� yazd�rmak �c�n toString method'u kullan�lmaz
	//outer array'�n �c�nde �nner array'ler oldugundan toString methodun'da �nner array'ler�m
	//referans degerler� yazd�r�lab�l�r
	System.out.println(Arrays.deepToString(arr2));
	}

}
