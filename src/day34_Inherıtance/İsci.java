package day34_Inher�tance;

public class �sci extends Muhasebe {

	public static void main(String[] args) {
	
		�sci �sci1 = new �sci();
		
		�sci1.isim="�mer";
		�sci1.soy�sim="ayd�n";
		�sci1.id=1001;
		�sci1.izindeMi=false;
		�sci1.saatUcret�=10;
		�sci1.statu="�sc�";
		�sci1.maas=�sci1.maasHesapla();
		
		System.out.println(�sci1.id+" "+�sci1.isim +" "+ �sci1.soy�sim + " " + 
		                  �sci1.statu+" "+�sci1.maas);
	
	// bu derse kadar hang� class'dan b�lg� elde etmek �st�yorsak o class'dan obje olusturduk 
		// Inher�tance �le bu mecbur�yet ortadan kalkt�
		//child class'da olusturdugum obje ole tum parent class'larda
		//bulunan var�able ve method'lar� �nher�t edeb�lr�m
	
	
	
�sci �sci2 = new �sci();
		
		�sci2.isim="fuat";
		�sci2.soy�sim="kocaoglu";
		�sci2.id=1002;
		�sci2.izindeMi=true;
		�sci2.saatUcret�=20;
		�sci2.statu="�sc�";
		�sci2.maas=�sci2.maasHesapla();
		
		System.out.println(�sci2.id+" "+�sci2.isim +" "+ �sci2.soy�sim + " " + 
		                  �sci2.statu+" "+�sci2.maas);
	
	
	
		
	
	
	
	
	
	
	
	
	
	}

}
