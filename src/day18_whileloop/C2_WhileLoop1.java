package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		//while : ýken,oldugu surece
        //10 dan  30 a kadar olan sayýlardan 4 ýle bolunebýlenlerý
	    //aralarýnda býr bosluk olacak sekýlde yan yana yazdýrýn
		
		for (int i = 10; i <=30; i++) {
		
			if(i%4==0) {
				System.out.print(i+ " ");
			}
		//aynýsýný whýle loop ýle yapalým
			int sayý=10; // 1. sartý gerceklestýrdým (baslangýc degerý)
			while (sayý<30) { // 2.sartý gerceklestýrdým (býtýs kosulu)
				if(sayý%4==0) {
					System.out.print(sayý+ " ");
				}
	
			sayý++; //3.sartý gerceklestýrdým (degisim degeri)
			}	
		
		}
		
}
	}


