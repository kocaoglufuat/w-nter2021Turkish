package day12_stringmanupulýtýon;

public class C1_EqualsCiftEsýttýrFarký {

	public static void main(String[] args) {
		//

		String str1 = "ali can";
		String str2 = str1 + "";
		System.out.println(str2);

		System.out.println(str1 == str2);// false
		// == Stringlerýn hem degerlerýne hem de adreslerýne bakar
		// bu ornekte str1+"" yazdýgýmýzda concatenation yapýldýgý ýcýn java,
		// yený býr obje olusuturur ve ýslemýn sonucunu yený obje nýn ýcýne koyar.
		// str1 ile str2 yý == ýle karsýlastýrýsak degerlerý ayný fakat
		// adreslerý farklý olgugu ýcýn false döner.

		System.out.println(str1.equals(str2));

		// equals methodu sadece stringlerýn degerlerýný karsýlastýrýr.
		// bu ornekte str1 ýle str2 nýn degerlerý ayný oldugu ýcýn true döndürür.

		String str3 = "fettah can";
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

	}

}
