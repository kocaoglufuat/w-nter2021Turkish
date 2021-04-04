package day25Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		//verýlen 2 katlý býr array'ýn tum elemanlarýnýn toplamýný bulalým
		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
int toplam=0;
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		
		toplam+=arr[i][j];
	}
}
System.out.println("array'deký tum elemanlarýn toplamý : " +toplam);
	
	}
	
}
