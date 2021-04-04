package day18_whileloop;

public class C6_Whileloop {

	public static void main(String[] args) {
		//verilen sayýnýn asal olup olmadýgýný bulan býr program yazýn.
		//asal sayý : 1 ve kendýsý dýsýnda hýc býr pozýtýf tamsayýyla kalansýz bolunmeyen
		
		int sayý=41;
		
		String flag="ASAL";//flag=bayrak býzým ýstedýgýmýz sartýn gerceklesýp gerceklesmedýgýný kontrol eder.
		
		int bolen=2;
		
		while (bolen<sayý) {
			
			if (sayý%bolen==0) {
				flag="asal sayý degýl";
			
			}
		bolen++;
		}
		System.out.println(flag);
		
		
		
		
		
		
	}
}
