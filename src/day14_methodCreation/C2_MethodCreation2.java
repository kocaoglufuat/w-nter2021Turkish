package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
	
		//býr methodu calýstýrmak ýcýn maýn methodun'un ýcýnden cagýrmamýz gerekýr
		//býr methodu cagýrmak ýcýn ýse method adýný ve parametrelere uygun argumentlerý
		//yazmalýyýz
		ortalama(85.2,90.3);//method call
		
		// býr method olusturmak ýstedýgýmýzde Class'ýn ýcýnde ama maýn method'un
		//dýsýnda býr alanda olusturmalýyýz genel kullaným method'lar maýn method'dan
		//sonra olur.
		
	}//method sonu
		public static void ortalama (double sayý1,double sayý2) {
			System.out.println("gýrdýgýnýz ýký sayýnýn ortalamasý :" +(sayý1+sayý2)/2);
		// býr methodu olusturmak o methodu calýstýrmak ýcýn yeterlý degýldýr
		//olusturulan method maýn method ýcýnden cagrýlýnca calýsýr.
		
		}
		
}//class sonu
