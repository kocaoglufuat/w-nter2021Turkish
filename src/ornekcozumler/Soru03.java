package ornekcozumler;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {

    //kullan�c�dan iki say� g�rmes�n� �stey�n.kullan�c�ya d�rt islem 
   //menusunu goster�n ve b�r�n� secmeler�n� �stey�n.
//kullan�c�n�n sec�m�ne gore g�r�len say�lar�n�n �slem sonucunu yazd�r�n
		
       Scanner scan =new Scanner(System.in);
       System.out.println("lutfen b�r say� g�r�n�z");
		double a=scan.nextDouble();
		System.out.println("lutfen b�r say� g�r�n�z");
		double b=scan.nextDouble();
		
	System.out.println("lutfen dort �slemden b�r�n� sec�n�z\n1. Toplama \n2. Ck�rma \n3. Carpma \n4. Bolme");
	int sec�m=scan.nextInt();
	
		
	if(sec�m ==1) {
		System.out.println("G�r�len say�lar�n toplam�:"+(a+b));
	}else if(sec�m==2){
		System.out.println("G�r�len say�lar�n fark�:"+(a-b));
	}else if(sec�m==3) {
		System.out.println("G�r�len say�lar�n carp�m�:"+(a*b));
	}else if(sec�m==4) {
		System.out.println("G�r�len say�lar�n bolumu:"+(a/b));
	}else {
		System.out.println("yanl�s g�r�s yapt�n�z");
	}

		scan.close();
		
		
		
		
		
		
		
		

	}

}
