package day25Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		//ver�len 2 katl� b�r array'�n tum elemanlar�n�n toplam�n� bulal�m
		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
int toplam=0;
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		
		toplam+=arr[i][j];
	}
}
System.out.println("array'dek� tum elemanlar�n toplam� : " +toplam);
	
	}
	
}
