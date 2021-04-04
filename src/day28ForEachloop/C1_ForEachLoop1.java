package day28ForEachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		
		// býr arry ýn tum elemanlarýný for loop ýle yazdýralým
		
		int arr[]= {2,4,6,8,10,12};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// for loop yazmamýzýn amacý array'ýn TUM ELEMANLARI uzerýnde ýslem yapmak ýse
		// foreach loop daha kolay kod yazmamýzý saglar
		
		//for each loop ýstedýgým býr topluluktaký tum elemanlarý býrer býrer bana getýrýr
		// for each loop'da baslangýc degerý YOKTUR, bitis degeri YOKTUR, index YOKTUR.
		System.out.println();
		for (int i : arr) {
		System.out.print(i + " ");
		}
		
		
		

	}

}
