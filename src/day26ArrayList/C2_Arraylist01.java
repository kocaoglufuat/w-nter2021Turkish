package day26ArrayList;


import java.util.ArrayList;
import java.util.List;

public class C2_Arraylist01 {

	public static void main(String[] args) {
         //BIR ARRAYLÝST NASIL OLUSTURULUR.
		//Arraylist býr objedýr,dolayýsýyla yený býr tane olusturmak ýcýn new
		//keyword kullanmalýyýz
		
		//1.yol
         ArrayList<String> 	list= new ArrayList<String>();
	
	   //2.yol
    	ArrayList<String> list2 = new ArrayList<>();
       
    	//3.yol  
    	List<String> list3=new ArrayList<>();
	
    	// NOT: eger constructor olarak list<>() kullanýlýrsa
	   
    	// list<> constructor olarak kullanýlmaz
	
    	//list'e eleman ekleme
	   // list olustururken otomatýk olarak eleman ekleme ozellýgý yoktur,
    	//elemanlarýn tek tek eklenmesý gerekýr
	
	list3.add("ali");
	list3.add("veli");
	list3.add("ayse");
	System.out.println(list3); // [alý veli ayse]
	list3.add(1, "can");
	System.out.println(list3);
	list3.add(1, "fatma");
	System.out.println(list3);
	
	
	/*SORU 6)
    verýlen býr array dan ýsten degere esýt olan elemanlarý kaldýrýp 
    kalanlarý yený býr array olarak yazdýran býr method yazýnýz		
	
	*/
	
	int arr[]= {2,3,5,3,6,4,3,6,7};
	int sayý=6	;
	List<Integer> istenenList = new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] !=sayý) {
			istenenList.add(arr[i]);
		}
	}
	System.out.println(istenenList);
	}
	

}
