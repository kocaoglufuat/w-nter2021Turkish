package day33encapsulat�on;

public class Encapsulat�on02 {
private String okulIsm�="y�ld�z koleji";
//okul �sm�n�n baska class'lardan okunmas�n� ama deger atanamamas�n� �st�yorsak
//getter() method'u olusturuyoruz
private String tcNo="12345678901";
private int hesapNo=5554321;
//obje olusturularak deger atan�p kullan�lmas�n� �sted�g�m�z ama
//ilk atad�g�m�z deger�n gorunmes�n� �st�yorsak setter() method'u kullan�r�z
	
public int say�=100;
public static void main(String[] args) {
		//eger ulasmak �sted�g�m class uyeler� (class member) public deg�lse baska 
		// package'lerden ulasmak �c�n ekstra �slem yapmam�z gerek�r

		// yapab�leceg�m�z �slemlerden 1.s� encapsulat�on (data saklama)
		// bu class'da k�mseyle paylasmak �stemed�g�m�z ver�able ve method'lar olustural�m
		
		// private yap�nca guvenl�k konusunu halletm�s olduk
		//ancak class uyeler�'n�n pr�vate olmas� OOP concept'e ayk�r�
		
		//Encapsulation class'�m�zde olusturdugumuz class uyeler�ne 
		//k�mler�n ne oranda ulasab�leceg�n� bel�rlemek �c�n yap�l�r
		
		
	}

	private void deneme() {
		System.out.println("deneme method'u cal�st�");
	}

	public String getOkulIsm�() {
		return okulIsm�;
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
