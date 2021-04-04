package day35inheritance;

public class Memur  extends Personel{

	
	public int maas;
	public Memur() {
		super();
	System.out.println("child class parametresiz constructor calýstý");
	}


	

	
	
	
	
	
/* ýnheritance'da constructor olusturdugumuzda java nýn otomatýk olarak constructor a
 * koydugu super() keyword onemlýdýr
 * super() keyword default constructor gýbýdýr  býz gormesek de calýsýr,ancak yerýne 
 * baska býr keyword yazarsak etkýsýz hale gelýr
 * extends varsa yerýne býrsey yazmadýkca super() calýsýr....
 
  */

	public static void main(String[] args) {
	Memur obj1= new Memur();

	}

}
