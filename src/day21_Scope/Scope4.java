package day21_Scope;

public class Scope4 {

	public static void main(String[] args) {
		
	int say�=10;	
	// 1-bir method �c�nde olusturulan ver�able,sadece o method �c�nde kullan�lab�l�r
	// 1-system.out.println(isim);
	
	int say�2;//bir local ver�able deger  atanmadan da olusturulab�l�r
	// 2-System.out.println(say�2);//2-ancak �lk deger atamas� yap�lmayan ver�able'lar kullan�lmaz
	// 2-say�2++; // 2- ilk deger atanmad�g� �c�n art�rma yada azaltma da yapamay�z
	// 2-java deger atamas� olmadan local var�able olusturulmas�na �z�n ver�r,ilerde deger atanacak d�ye beklemez
	
	say�2=15; //2-olusturma ayr� sat�rda(11.sat�r) , deger atamas� ayr� sat�rda (16sat�r) yap�lab�l�r
	
	// 3- b�rden fazla method'un oldugu class'larda her method'da kullanmam�z gereken
	// 3- ortak ver�able'lar varsa class level'da ver�able olusturmal�y�m
	// 3- ortak ver�able class'�n yap�s�na bagl� olarak �nstance ve static olab�l�r
	
	}
	

	public static void staticMethod() {
		String isim="fuat";
	    //1- system.out.println(say�); bu kurala ma�n method �cer�s�nde olusturulan ver�able'ler da dah�ld�r
	
	}
	
	public void method() {
		boolean isTrue=true;
	}
}
