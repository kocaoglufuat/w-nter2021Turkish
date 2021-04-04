package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		int sayý1 = 10;
		int sayý2 = 20;
		int sayý3 = 30;

		toplama(sayý1, sayý2);// method call
		//verýlen uc sayýyý toplayan ve sonucu yazdýran býr method yazýnýz
		
		toplama(sayý1, sayý2, sayý3);//method call
	
	//oyle býr method yazalým ký ýcýne kac sayý yazarsak yazalým toplasýn
	toplama(2,3);//ýký sayýnýn toplamý methodu
	toplama(2,5,8);//uc sayýnýn toplamý methodu calýsýr
	//istediðiniz kadar sayýyý yazabýlecegýmýz methodu olusturabýlmemýz ýcýn
	//java varargs olusturmus
	}
	

	private static void toplama(int sayý1, int sayý2, int sayý3) {
		System.out.println("uc sayýnýn toplamý :" + (sayý1 + sayý2 + sayý3));

	}

	public static void toplama(int sayý1, int sayý2) {
		System.out.println("iki sayýnýn toplamý :" + (sayý1 + sayý2));

	}

}
