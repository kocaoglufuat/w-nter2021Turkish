package day15_methodcreation;

public class C4_Forloop1 {

	public static void main(String[] args) {
		// 5 defa hello world yazd�ral�m
		/*
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 * System.out.println("Hello world");
		 */
		// bunun yer�ne loop kullan�yoruz
		// ne yapacag�m�z� java ya soyluyoruz,kac kere yapmas� gerekteg�n� de soyluyoruz

		// tum loop'larda 3 sey� yazmak zorunday�z
		// 1-)baslang�c degeri
		// 2-)bitis degeri
		// 3-)art�s degeri

		for (int i=1; i>1; i+=1) {
			System.out.println(i+ "hello world");

		}
		// not : eger sart k�sm� b�z�m art�s�m�za gore hep true ver�rse loop sonsuz
		// donguye g�rer
		// not : loop da art�s deger� poz�t�f oldugu g�b� negat�fde olab�l�r
		// not : Art�s deger� 1 olmak zorunda deg�l,farkl� da olab�l�r.
		// not : eger loop'un sart� h�c true olmazsa loop body h�c devreye g�rmez
	}

}
