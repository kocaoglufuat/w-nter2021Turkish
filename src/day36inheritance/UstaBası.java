package day36inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasý extends Ýsci {

	public String bolum = "takýmHane";
	public int sorOIdIscýsay = 20;

	public static void main(String[] args) {

		UstaBasý ub1 = new UstaBasý();
// objeyý torun clasýnda olusturunca 3 class'A  ulasabýlýyoruz
		System.out.println(ub1.bolum);// takýmhane
		System.out.println(ub1.sorOIdIscýsay);// 20
		System.out.println(ub1.saatUcreti);// 10
		System.out.println(ub1.isim);// mehmet

		// List<String> list = new ArrayList<>();
		// Object str = new String("hasan");
		Ýsci ub2 = new UstaBasý();
		// extends ýle býrbýrýne baglý olan classlarda ýs-A relatýon olan
		// Data turlerý ýstege baglý olarak kulllanýlabýlýr
		// Daha genýs Data turu yazmanýn avantajý :
		// Kapsamýn daha genýs olmasý
		// Daha genýs data turu yazmanýn dezAvanatajý :
		// Data turu olarak sectýgýmýz class ve parent(larýna) aýt datalara ulasabýlýr
		System.out.println(ub2.depertman);// isci classýndan aldýk
		System.out.println(ub2.izindeMi);// personel clasýndan aldýk

		Personel ub3 = new UstaBasý();
		System.out.println(ub3.id);

	}

}
