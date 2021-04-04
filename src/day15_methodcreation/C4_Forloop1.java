package day15_methodcreation;

public class C4_Forloop1 {

	public static void main(String[] args) {
		// 5 defa hello world yazdýralým
		/*
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 * System.out.println("Hello world");
		 */
		// bunun yerýne loop kullanýyoruz
		// ne yapacagýmýzý java ya soyluyoruz,kac kere yapmasý gerektegýný de soyluyoruz

		// tum loop'larda 3 seyý yazmak zorundayýz
		// 1-)baslangýc degeri
		// 2-)bitis degeri
		// 3-)artýs degeri

		for (int i=1; i>1; i+=1) {
			System.out.println(i+ "hello world");

		}
		// not : eger sart kýsmý býzým artýsýmýza gore hep true verýrse loop sonsuz
		// donguye gýrer
		// not : loop da artýs degerý pozýtýf oldugu gýbý negatýfde olabýlýr
		// not : Artýs degerý 1 olmak zorunda degýl,farklý da olabýlýr.
		// not : eger loop'un sartý hýc true olmazsa loop body hýc devreye gýrmez
	}

}
