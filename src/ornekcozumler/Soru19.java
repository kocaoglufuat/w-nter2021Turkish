package ornekcozumler;

import java.util.Scanner;

public class Soru19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen amstrong say� olup olmad�g�n� ogrenmek �c�n b�r rakma g�r�n�z");
		int say�= scan.nextInt();		
		amstrog(say�);
		scan.close();

	}
public static void amstrog(int n) {
	int say�n�nKupler�Toplam�=0;
	int basamakDeger�=0;
	int a= n;

while (n>0) {
	basamakDeger� = n % 10;
	say�n�nKupler�Toplam�= say�n�nKupler�Toplam�+(basamakDeger�*basamakDeger�*basamakDeger�);
	n= n/10;
	
	}
  if (a== say�n�nKupler�Toplam�) {
	System.out.println(a+"say�s� amstrong say�d�r");
} else {
System.out.println(a+"say�s� amstrong say� deg�ld�r");
}
}
}
