package day26ArrayList;


import java.util.ArrayList;
import java.util.List;

public class C2_Arraylist01 {

	public static void main(String[] args) {
         //BIR ARRAYL�ST NASIL OLUSTURULUR.
		//Arraylist b�r objed�r,dolay�s�yla yen� b�r tane olusturmak �c�n new
		//keyword kullanmal�y�z
		
		//1.yol
         ArrayList<String> 	list= new ArrayList<String>();
	
	   //2.yol
    	ArrayList<String> list2 = new ArrayList<>();
       
    	//3.yol  
    	List<String> list3=new ArrayList<>();
	
    	// NOT: eger constructor olarak list<>() kullan�l�rsa
	   
    	// list<> constructor olarak kullan�lmaz
	
    	//list'e eleman ekleme
	   // list olustururken otomat�k olarak eleman ekleme ozell�g� yoktur,
    	//elemanlar�n tek tek eklenmes� gerek�r
	
	list3.add("ali");
	list3.add("veli");
	list3.add("ayse");
	System.out.println(list3); // [al� veli ayse]
	list3.add(1, "can");
	System.out.println(list3);
	list3.add(1, "fatma");
	System.out.println(list3);
	
	
	/*SORU 6)
    ver�len b�r array dan �sten degere es�t olan elemanlar� kald�r�p 
    kalanlar� yen� b�r array olarak yazd�ran b�r method yaz�n�z		
	
	*/
	
	int arr[]= {2,3,5,3,6,4,3,6,7};
	int say�=6	;
	List<Integer> istenenList = new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] !=say�) {
			istenenList.add(arr[i]);
		}
	}
	System.out.println(istenenList);
	}
	

}
