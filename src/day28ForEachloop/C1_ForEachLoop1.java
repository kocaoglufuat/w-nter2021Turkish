package day28ForEachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		
		// b�r arry �n tum elemanlar�n� for loop �le yazd�ral�m
		
		int arr[]= {2,4,6,8,10,12};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// for loop yazmam�z�n amac� array'�n TUM ELEMANLARI uzer�nde �slem yapmak �se
		// foreach loop daha kolay kod yazmam�z� saglar
		
		//for each loop �sted�g�m b�r topluluktak� tum elemanlar� b�rer b�rer bana get�r�r
		// for each loop'da baslang�c deger� YOKTUR, bitis degeri YOKTUR, index YOKTUR.
		System.out.println();
		for (int i : arr) {
		System.out.print(i + " ");
		}
		
		
		

	}

}
