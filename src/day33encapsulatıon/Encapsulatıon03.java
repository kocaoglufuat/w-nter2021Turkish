package day33encapsulat�on;

public class Encapsulat�on03 {

	public static void main(String[] args) {

		// Encapsulat�on02 class'�ndak� class member'a ulasmaya cal�sal�m
		Encapsulat�on02 obj1 = new Encapsulat�on02();

		// b�z er�s�m yetk�s�n� �k�ye ay�r�yoruz
		// 1-okuyab�lme
		// 2-deg�st�r�p kullanab�lme

		System.out.println(obj1.say�);
		obj1.setHesapNo(12445677);

		//b�r class �c�nde class member olustururken bunu d�ger class'lar �le
		//ne oranda paylasacag�m�za karar ver�r
		//1- herkes okuyab�ls�n ve obje uzer�nden deger atay�p kullanab�ls�n  ==>public
		//2-herkes okuyab�ls�n ama k�mse obje uzer�nden de olsa deg�st�remez private==>public
		//3- �lk atad�g�m deger� k�mse goremes�n pr�vate ==> public set ()
		obj1.setTcNo("12314516701");
		
	}
}