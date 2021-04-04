package ornekcozumler;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {

    //kullanýcýdan iki sayý gýrmesýný ýsteyýn.kullanýcýya dört islem 
   //menusunu gosterýn ve býrýný secmelerýný ýsteyýn.
//kullanýcýnýn secýmýne gore gýrýlen sayýlarýnýn ýslem sonucunu yazdýrýn
		
       Scanner scan =new Scanner(System.in);
       System.out.println("lutfen býr sayý gýrýnýz");
		double a=scan.nextDouble();
		System.out.println("lutfen býr sayý gýrýnýz");
		double b=scan.nextDouble();
		
	System.out.println("lutfen dort ýslemden býrýný secýnýz\n1. Toplama \n2. Ckýrma \n3. Carpma \n4. Bolme");
	int secým=scan.nextInt();
	
		
	if(secým ==1) {
		System.out.println("Gýrýlen sayýlarýn toplamý:"+(a+b));
	}else if(secým==2){
		System.out.println("Gýrýlen sayýlarýn farký:"+(a-b));
	}else if(secým==3) {
		System.out.println("Gýrýlen sayýlarýn carpýmý:"+(a*b));
	}else if(secým==4) {
		System.out.println("Gýrýlen sayýlarýn bolumu:"+(a/b));
	}else {
		System.out.println("yanlýs gýrýs yaptýnýz");
	}

		scan.close();
		
		
		
		
		
		
		
		

	}

}
