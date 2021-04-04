package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
	
	//soru2: verýlen býr arrayýn tum elemanlarýný toplayan býr program yazalým
		int arr[]= {10,15,2,45,78};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println(toplam);
		
		// verýlen array'ýn elemanlarýný toString methodu olmadan yan yana ve aralarýnda býr boslukla yazdýrýn.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		

	}

}
