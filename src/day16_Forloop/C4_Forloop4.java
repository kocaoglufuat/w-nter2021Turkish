package day16_Forloop;

public class C4_Forloop4 {

	public static void main(String[] args) {
		
		// 50'den buyuk 150 den kucuk olan tamsay�lardan
		//7 �le tam boluneb�lenler� toplay�p
		//sonucu yazd�ran b�r kod yaz�n�z.
		int toplam =0;
		
		for (int i = 51; i < 150; i++) {
			if(i%7==0) {
				toplam=toplam+i;
			}
		}
		System.out.println(toplam);
		
		
		
		
		
		
		
		
	
	}

}
