package day33encapsulatýon;

public class Encapsulatýon02 {
private String okulIsmý="yýldýz koleji";
//okul ýsmýnýn baska class'lardan okunmasýný ama deger atanamamasýný ýstýyorsak
//getter() method'u olusturuyoruz
private String tcNo="12345678901";
private int hesapNo=5554321;
//obje olusturularak deger atanýp kullanýlmasýný ýstedýgýmýz ama
//ilk atadýgýmýz degerýn gorunmesýný ýstýyorsak setter() method'u kullanýrýz
	
public int sayý=100;
public static void main(String[] args) {
		//eger ulasmak ýstedýgým class uyelerý (class member) public degýlse baska 
		// package'lerden ulasmak ýcýn ekstra ýslem yapmamýz gerekýr

		// yapabýlecegýmýz ýslemlerden 1.sý encapsulatýon (data saklama)
		// bu class'da kýmseyle paylasmak ýstemedýgýmýz verýable ve method'lar olusturalým
		
		// private yapýnca guvenlýk konusunu halletmýs olduk
		//ancak class uyelerý'nýn prývate olmasý OOP concept'e aykýrý
		
		//Encapsulation class'ýmýzde olusturdugumuz class uyelerýne 
		//kýmlerýn ne oranda ulasabýlecegýný belýrlemek ýcýn yapýlýr
		
		
	}

	private void deneme() {
		System.out.println("deneme method'u calýstý");
	}

	public String getOkulIsmý() {
		return okulIsmý;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
System.out.println(tcNo);
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	System.out.println(hesapNo);
	}

	

}
