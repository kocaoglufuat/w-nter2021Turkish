package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
	
		//b�r methodu cal�st�rmak �c�n ma�n methodun'un �c�nden cag�rmam�z gerek�r
		//b�r methodu cag�rmak �c�n �se method ad�n� ve parametrelere uygun argumentler�
		//yazmal�y�z
		ortalama(85.2,90.3);//method call
		
		// b�r method olusturmak �sted�g�m�zde Class'�n �c�nde ama ma�n method'un
		//d�s�nda b�r alanda olusturmal�y�z genel kullan�m method'lar ma�n method'dan
		//sonra olur.
		
	}//method sonu
		public static void ortalama (double say�1,double say�2) {
			System.out.println("g�rd�g�n�z �k� say�n�n ortalamas� :" +(say�1+say�2)/2);
		// b�r methodu olusturmak o methodu cal�st�rmak �c�n yeterl� deg�ld�r
		//olusturulan method ma�n method �c�nden cagr�l�nca cal�s�r.
		
		}
		
}//class sonu
