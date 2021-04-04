package ornekcozumler;

import java.util.Scanner;

public class SORU_3 {

	public static void main(String[] args) {
		/*
		 * SORU 1
		 *
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 *
		 * Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
		 * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urunun adetini giriniz");
		int adet =scan.nextInt();
		System.out.println("Lutfen liste fiyatini giriniz");
		double fiyat = scan.nextDouble();
		System.out.println("Musteri karitiniz var mi? Y/N");
		char kart =scan.next().toLowerCase().charAt(0);
		
		if (kart=='y') {
			if (adet>10) {
				System.out.println("%20 indirim yapildi" + (adet*fiyat)*0.8);
			} 
			else {
				System.out.println("%15 indirim yapildi" + (adet*fiyat)*0.85);
			}
			
		} else if(kart=='n') {
			if (adet>10) {
				System.out.println("%15 indirim yapildi " + (adet*fiyat)*0.85);
			} 
		else {
				System.out.println("%10 indirim yapildi " + (adet*fiyat)*0.90);
				
			
				
		
		}}
		}

	}
