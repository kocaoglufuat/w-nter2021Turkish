package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		
		 Parametrel�Constructor oto1= new Parametrel�Constructor();
		 System.out.println(oto1.marka + " " + oto1.model + " " + oto1.y�l + " " + oto1.kazas�Varm�);
	//default degerler�n� yazd�r�r
	
	Parametrel�Constructor oto2 = new Parametrel�Constructor(2015);
	 System.out.println(oto2.marka + " " + oto2.model + " " + oto2.y�l + " " + oto2.kazas�Varm�);
	
	Parametrel�Constructor oto3 = new Parametrel�Constructor("toyota", "corolla", 2010 , true);
	 System.out.println(oto3.marka + " " + oto3.model + " " + oto3.y�l + " " + oto3.kazas�Varm�);
	}

}
