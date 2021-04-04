package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		int say�1 = 10;
		int say�2 = 20;
		int say�3 = 30;

		toplama(say�1, say�2);// method call
		//ver�len uc say�y� toplayan ve sonucu yazd�ran b�r method yaz�n�z
		
		toplama(say�1, say�2, say�3);//method call
	
	//oyle b�r method yazal�m k� �c�ne kac say� yazarsak yazal�m toplas�n
	toplama(2,3);//�k� say�n�n toplam� methodu
	toplama(2,5,8);//uc say�n�n toplam� methodu cal�s�r
	//istedi�iniz kadar say�y� yazab�leceg�m�z methodu olusturab�lmem�z �c�n
	//java varargs olusturmus
	}
	

	private static void toplama(int say�1, int say�2, int say�3) {
		System.out.println("uc say�n�n toplam� :" + (say�1 + say�2 + say�3));

	}

	public static void toplama(int say�1, int say�2) {
		System.out.println("iki say�n�n toplam� :" + (say�1 + say�2));

	}

}
