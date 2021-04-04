package ornekcozumler;

import java.util.Scanner;

public class Soru19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen amstrong sayı olup olmadıgını ogrenmek ıcın bır rakma gırınız");
		int sayı= scan.nextInt();		
		amstrog(sayı);
		scan.close();

	}
public static void amstrog(int n) {
	int sayınınKuplerıToplamı=0;
	int basamakDegerı=0;
	int a= n;

while (n>0) {
	basamakDegerı = n % 10;
	sayınınKuplerıToplamı= sayınınKuplerıToplamı+(basamakDegerı*basamakDegerı*basamakDegerı);
	n= n/10;
	
	}
  if (a== sayınınKuplerıToplamı) {
	System.out.println(a+"sayısı amstrong sayıdır");
} else {
System.out.println(a+"sayısı amstrong sayı degıldır");
}
}
}
