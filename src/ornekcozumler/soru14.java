package ornekcozumler;

import java.util.Scanner;

public class soru14 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Lutfen Kelime Giriniz");
		String str=sc.nextLine();
		kelime(str);
	}
	private static void kelime(String str) {
     String ilk=str.substring(0, 2).toLowerCase();
    if(ilk.contains("h")&&ilk.contains("g")) {
    	System.out.println(str);
    }else if(ilk.contains("h")) {
    	System.out.println("h"+str.substring(2));
    }else if(ilk.contains("g")) {
    	System.out.println("g"+str.substring(2));
    }else {
    	System.out.println(str.substring(2));
    }
	
	
	
	
	
	}
	
	
}
