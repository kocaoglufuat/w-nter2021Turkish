package day36inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBas� extends �sci {

	public String bolum = "tak�mHane";
	public int sorOIdIsc�say = 20;

	public static void main(String[] args) {

		UstaBas� ub1 = new UstaBas�();
// objey� torun clas�nda olusturunca 3 class'A  ulasab�l�yoruz
		System.out.println(ub1.bolum);// tak�mhane
		System.out.println(ub1.sorOIdIsc�say);// 20
		System.out.println(ub1.saatUcreti);// 10
		System.out.println(ub1.isim);// mehmet

		// List<String> list = new ArrayList<>();
		// Object str = new String("hasan");
		�sci ub2 = new UstaBas�();
		// extends �le b�rb�r�ne bagl� olan classlarda �s-A relat�on olan
		// Data turler� �stege bagl� olarak kulllan�lab�l�r
		// Daha gen�s Data turu yazman�n avantaj� :
		// Kapsam�n daha gen�s olmas�
		// Daha gen�s data turu yazman�n dezAvanataj� :
		// Data turu olarak sect�g�m�z class ve parent(lar�na) a�t datalara ulasab�l�r
		System.out.println(ub2.depertman);// isci class�ndan ald�k
		System.out.println(ub2.izindeMi);// personel clas�ndan ald�k

		Personel ub3 = new UstaBas�();
		System.out.println(ub3.id);

	}

}
