package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
	
	//soru2: ver�len b�r array�n tum elemanlar�n� toplayan b�r program yazal�m
		int arr[]= {10,15,2,45,78};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println(toplam);
		
		// ver�len array'�n elemanlar�n� toString methodu olmadan yan yana ve aralar�nda b�r boslukla yazd�r�n.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		

	}

}
