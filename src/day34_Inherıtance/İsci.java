package day34_Inherıtance;

public class İsci extends Muhasebe {

	public static void main(String[] args) {
	
		İsci İsci1 = new İsci();
		
		İsci1.isim="ömer";
		İsci1.soyİsim="aydın";
		İsci1.id=1001;
		İsci1.izindeMi=false;
		İsci1.saatUcretı=10;
		İsci1.statu="ıscı";
		İsci1.maas=İsci1.maasHesapla();
		
		System.out.println(İsci1.id+" "+İsci1.isim +" "+ İsci1.soyİsim + " " + 
		                  İsci1.statu+" "+İsci1.maas);
	
	// bu derse kadar hangı class'dan bılgı elde etmek ıstıyorsak o class'dan obje olusturduk 
		// Inherıtance ıle bu mecburıyet ortadan kalktı
		//child class'da olusturdugum obje ole tum parent class'larda
		//bulunan varıable ve method'ları ınherıt edebılrım
	
	
	
İsci İsci2 = new İsci();
		
		İsci2.isim="fuat";
		İsci2.soyİsim="kocaoglu";
		İsci2.id=1002;
		İsci2.izindeMi=true;
		İsci2.saatUcretı=20;
		İsci2.statu="ıscı";
		İsci2.maas=İsci2.maasHesapla();
		
		System.out.println(İsci2.id+" "+İsci2.isim +" "+ İsci2.soyİsim + " " + 
		                  İsci2.statu+" "+İsci2.maas);
	
	
	
		
	
	
	
	
	
	
	
	
	
	}

}
