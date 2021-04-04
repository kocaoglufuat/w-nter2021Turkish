package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
	
		int kalan = 15 % 4 ;
		System.out.println(kalan);
        
		
		int sayý =856;
		
		int birlerbasamagý =856 % 10 ;
		System.out.println("birlerbasamagý : " + birlerbasamagý);
		
		sayý/=10;
		System.out.println("on'a boldukten sonra sayýnýn degerý : " + sayý);
		
		int onlarbasamagý= sayý % 10;
		System.out.println("onlar basamagý : " + onlarbasamagý);
		
		sayý /= 10;
		
		System.out.println("2defa 10'a bolundukten sonra " + sayý);
		
		
		
	}

}
