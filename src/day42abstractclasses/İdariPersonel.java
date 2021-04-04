package day42abstractclasses;

public class İdariPersonel extends Personel {
    //extends personel yazarak abstract personele concrete bır chıld olusturdum
	//ve java CTE verdı
	//cozum olarak urettıgı ıkı ıhtımal var 
	//1-Unımplemented (uyarlanmamıs) methodları uyarla
	//2- ya da personel class'ından abstract kelımesını kaldır
	//bu class'ın calısabılmesı ıcın 2 ıslemden bırını yapmak zorundayız
	public static void main(String[] args) {
	

	}
 // concrete bır class'Da abstract bır method olabılır mı?
//	public abstract void sureklıCalısma();
	//the abstract method sureklıCalısma ın type ıdarıPersonel
	//canonly be defıned by an abstract class
	@Override
	public  void maasHesapla() {
	System.out.println("maas 4000tl");
		
	}

	@Override
	public void mesaiBlgisi() {
		// TODO Auto-generated method stub
		
	}

}
