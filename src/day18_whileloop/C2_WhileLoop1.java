package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		//while : �ken,oldugu surece
        //10 dan  30 a kadar olan say�lardan 4 �le boluneb�lenler�
	    //aralar�nda b�r bosluk olacak sek�lde yan yana yazd�r�n
		
		for (int i = 10; i <=30; i++) {
		
			if(i%4==0) {
				System.out.print(i+ " ");
			}
		//ayn�s�n� wh�le loop �le yapal�m
			int say�=10; // 1. sart� gerceklest�rd�m (baslang�c deger�)
			while (say�<30) { // 2.sart� gerceklest�rd�m (b�t�s kosulu)
				if(say�%4==0) {
					System.out.print(say�+ " ");
				}
	
			say�++; //3.sart� gerceklest�rd�m (degisim degeri)
			}	
		
		}
		
}
	}


