package day42abstractclasses;

public class �dariPersonel extends Personel {
    //extends personel yazarak abstract personele concrete b�r ch�ld olusturdum
	//ve java CTE verd�
	//cozum olarak urett�g� �k� �ht�mal var 
	//1-Un�mplemented (uyarlanmam�s) methodlar� uyarla
	//2- ya da personel class'�ndan abstract kel�mes�n� kald�r
	//bu class'�n cal�sab�lmes� �c�n 2 �slemden b�r�n� yapmak zorunday�z
	public static void main(String[] args) {
	

	}
 // concrete b�r class'Da abstract b�r method olab�l�r m�?
//	public abstract void surekl�Cal�sma();
	//the abstract method surekl�Cal�sma �n type �dar�Personel
	//canonly be def�ned by an abstract class
	@Override
	public  void maasHesapla() {
	System.out.println("maas 4000tl");
		
	}

	@Override
	public void mesaiBlgisi() {
		// TODO Auto-generated method stub
		
	}

}
