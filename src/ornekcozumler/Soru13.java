package ornekcozumler;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.next();
		System.out.println("Lutfen bir soyisim giriniz");
		String soyIsim = scan.next();
		System.out.println("Lutfen bir kart numarasi giriniz");
		String kart = scan.next();
		
		if(kart.length()==16){
			isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
			soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
			kart = "**** **** **** " + kart.substring(kart.length()-4);
			
			
			
		}else{
			System.out.println("16 haneli bir kart numarasi giriniz");
		}
		System.out.println(isim + " " +  soyIsim + " " + kart);

		
		

		
		
		
	}

}