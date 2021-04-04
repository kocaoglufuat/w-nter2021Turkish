package day13_stringmanýpulation;

public class C3_StarthWithIsEmpty {

	public static void main(String[] args) {
		
		
		String str = "Her gun Java olsa";
		System.out.println(str.startsWith("H"));//True
		
		System.out.println(str.startsWith("Her "));//True
		
		System.out.println(str.startsWith("g",4));//true
		
		System.out.println(str.startsWith("Java",7));//false
		
		System.out.println(str.isEmpty());
		
		String str3="";
				System.out.println(str3.isEmpty());
				
				
		
		
		
		
	}

}
