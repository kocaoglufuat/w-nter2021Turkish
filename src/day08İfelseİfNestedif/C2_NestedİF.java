package day08›felse›fNestedif;

public class C2_Nested›F {

	public static void main(String[] args) {


		//NESTED ›C ›CE

        String cinsiyet="kadin";
        int yas = 59;
        
        if (yas<0) {
            System.out.println("yas negatif olamaz");
        } else if(cinsiyet.equalsIgnoreCase("erkek")&& yas>=58) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<45) {
            System.out.println("emekli olamazsin");
        } else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>=68) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("kadin")&& yas<57) {
            System.out.println("emekli olamazsin");
        } else {
            System.out.println("Cinsiyet veya yas tanimsiz");
        }
        
        
        System.out.println("Nested if ile sonuc");
        
        
        if (cinsiyet.equalsIgnoreCase("erkek")) {
            
            if (yas<0) {
                System.out.println("erkek yas negatif olamaz");
            } else if (yas<65){
                System.out.println("Bu yastaki erkek Emekli olamaz"); 
            } else {
                System.out.println("bu yastaki erkek emekli olabilir");
            }
            
            
      
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
}
