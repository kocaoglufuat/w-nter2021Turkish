package day42abstractclasses;

public class C1_Final {
	final static int say� = 10;

	// �nstance b�r var�able'� f�nal ve stat�c yaparsan�z java onu bold yapar
	// b�zde �sm� BUYUK HARFLE yazar�z

	String isim;// null
	 // �nstance ver�able'lara �lk deger atamas� yapmak zorunda deg�l�z
    //deger atamad�g�m�zda java data turune gore default b�r deger atar

	//final string soy�s�m;
	//final var�able'lar�n deger� sonradan deg�st�relemeyeceg� �c�n
	//ilk atama yap�lmadan olusturulmas�na java �z�n vermez
	
	public static void main(String[] args) {
		System.out.println(say�);
	
System.out.println(Integer.MAX_VALUE);
	}

	public void deneme() {
System.out.println("deneme yap�yoruz");
	}
public final void deneme2() {
	System.out.println();
}
}
