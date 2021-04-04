package day21_Scope;

public class Scope4 {

	public static void main(String[] args) {
		
	int sayý=10;	
	// 1-bir method ýcýnde olusturulan verýable,sadece o method ýcýnde kullanýlabýlýr
	// 1-system.out.println(isim);
	
	int sayý2;//bir local verýable deger  atanmadan da olusturulabýlýr
	// 2-System.out.println(sayý2);//2-ancak ýlk deger atamasý yapýlmayan verýable'lar kullanýlmaz
	// 2-sayý2++; // 2- ilk deger atanmadýgý ýcýn artýrma yada azaltma da yapamayýz
	// 2-java deger atamasý olmadan local varýable olusturulmasýna ýzýn verýr,ilerde deger atanacak dýye beklemez
	
	sayý2=15; //2-olusturma ayrý satýrda(11.satýr) , deger atamasý ayrý satýrda (16satýr) yapýlabýlýr
	
	// 3- býrden fazla method'un oldugu class'larda her method'da kullanmamýz gereken
	// 3- ortak verýable'lar varsa class level'da verýable olusturmalýyým
	// 3- ortak verýable class'ýn yapýsýna baglý olarak ýnstance ve static olabýlýr
	
	}
	

	public static void staticMethod() {
		String isim="fuat";
	    //1- system.out.println(sayý); bu kurala maýn method ýcerýsýnde olusturulan verýable'ler da dahýldýr
	
	}
	
	public void method() {
		boolean isTrue=true;
	}
}
