package day18_whileloop;

public class C6_Whileloop {

	public static void main(String[] args) {
		//verilen say�n�n asal olup olmad�g�n� bulan b�r program yaz�n.
		//asal say� : 1 ve kend�s� d�s�nda h�c b�r poz�t�f tamsay�yla kalans�z bolunmeyen
		
		int say�=41;
		
		String flag="ASAL";//flag=bayrak b�z�m �sted�g�m�z sart�n gercekles�p gerceklesmed�g�n� kontrol eder.
		
		int bolen=2;
		
		while (bolen<say�) {
			
			if (say�%bolen==0) {
				flag="asal say� deg�l";
			
			}
		bolen++;
		}
		System.out.println(flag);
		
		
		
		
		
		
	}
}
