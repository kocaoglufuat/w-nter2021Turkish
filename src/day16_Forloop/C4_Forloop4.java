package day16_Forloop;

public class C4_Forloop4 {

	public static void main(String[] args) {
		
		// 50'den buyuk 150 den kucuk olan tamsayýlardan
		//7 ýle tam bolunebýlenlerý toplayýp
		//sonucu yazdýran býr kod yazýnýz.
		int toplam =0;
		
		for (int i = 51; i < 150; i++) {
			if(i%7==0) {
				toplam=toplam+i;
			}
		}
		System.out.println(toplam);
		
		
		
		
		
		
		
		
	
	}

}
