package day35inheritance;

public class Memur  extends Personel{

	
	public int maas;
	public Memur() {
		super();
	System.out.println("child class parametresiz constructor cal�st�");
	}


	

	
	
	
	
	
/* �nheritance'da constructor olusturdugumuzda java n�n otomat�k olarak constructor a
 * koydugu super() keyword oneml�d�r
 * super() keyword default constructor g�b�d�r  b�z gormesek de cal�s�r,ancak yer�ne 
 * baska b�r keyword yazarsak etk�s�z hale gel�r
 * extends varsa yer�ne b�rsey yazmad�kca super() cal�s�r....
 
  */

	public static void main(String[] args) {
	Memur obj1= new Memur();

	}

}
