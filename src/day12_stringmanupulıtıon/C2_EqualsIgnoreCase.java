package day12_stringmanupul�t�on;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		//equalsIgnorecase() method'u kars�last�rd�g� Str�ng lere case sens�t�ve
		//kucuk-buyuk harf duyarl�l�g� olmaks�z�n bakar.
		//String'ler ayn� �se "true" ayn� deg�lse "false" d�ner.
		
		String str1= "Ali Can";
		String str2="ali CAN";
		String str3="ali can";
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
