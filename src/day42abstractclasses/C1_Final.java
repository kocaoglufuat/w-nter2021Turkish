package day42abstractclasses;

public class C1_Final {
	final static int sayý = 10;

	// ýnstance býr varýable'ý fýnal ve statýc yaparsanýz java onu bold yapar
	// býzde ýsmý BUYUK HARFLE yazarýz

	String isim;// null
	 // ýnstance verýable'lara ýlk deger atamasý yapmak zorunda degýlýz
    //deger atamadýgýmýzda java data turune gore default býr deger atar

	//final string soyýsým;
	//final varýable'larýn degerý sonradan degýstýrelemeyecegý ýcýn
	//ilk atama yapýlmadan olusturulmasýna java ýzýn vermez
	
	public static void main(String[] args) {
		System.out.println(sayý);
	
System.out.println(Integer.MAX_VALUE);
	}

	public void deneme() {
System.out.println("deneme yapýyoruz");
	}
public final void deneme2() {
	System.out.println();
}
}
