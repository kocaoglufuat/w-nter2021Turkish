package day12_stringmanupulýtýon;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		//equalsIgnorecase() method'u karsýlastýrdýgý Strýng lere case sensýtýve
		//kucuk-buyuk harf duyarlýlýgý olmaksýzýn bakar.
		//String'ler ayný ýse "true" ayný degýlse "false" döner.
		
		String str1= "Ali Can";
		String str2="ali CAN";
		String str3="ali can";
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
