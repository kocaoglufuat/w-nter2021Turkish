package day29Passbyvalue�mmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		String �s�m="Ali";
		�s�m.concat("can");
System.out.println(�s�m);// AL�
	
	System.out.println(�s�m.concat("can"));	//Alican
    System.out.println(�s�m); // Ali
	
    //Stringler'de method �le yapt�g�m�z deg�s�kl�kler kal�c� olmaz
	
	List<String> �s�mlist = new ArrayList<>();
	System.out.println(�s�mlist);
	�s�mlist.add("ali");
	�s�mlist.add("can");
	System.out.println(�s�mlist);//[ali, can]
	�s�mlist.remove(1);
	System.out.println(�s�mlist);//AL�
	// L�ST'LERDE METHOD'LA YAPTIGIMIZ DEGISIKLIKLER KALICI OLARAK LIST'E ISLENIR
	// cunku list mutable'd�r.
	}

}
