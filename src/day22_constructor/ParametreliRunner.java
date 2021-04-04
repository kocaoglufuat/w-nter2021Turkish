package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		
		 ParametrelıConstructor oto1= new ParametrelıConstructor();
		 System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yıl + " " + oto1.kazasıVarmı);
	//default degerlerını yazdırır
	
	ParametrelıConstructor oto2 = new ParametrelıConstructor(2015);
	 System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yıl + " " + oto2.kazasıVarmı);
	
	ParametrelıConstructor oto3 = new ParametrelıConstructor("toyota", "corolla", 2010 , true);
	 System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yıl + " " + oto3.kazasıVarmı);
	}

}
