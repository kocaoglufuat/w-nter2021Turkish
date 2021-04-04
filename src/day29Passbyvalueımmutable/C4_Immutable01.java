package day29Passbyvalueýmmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		String ýsým="Ali";
		ýsým.concat("can");
System.out.println(ýsým);// ALÝ
	
	System.out.println(ýsým.concat("can"));	//Alican
    System.out.println(ýsým); // Ali
	
    //Stringler'de method ýle yaptýgýmýz degýsýklýkler kalýcý olmaz
	
	List<String> ýsýmlist = new ArrayList<>();
	System.out.println(ýsýmlist);
	ýsýmlist.add("ali");
	ýsýmlist.add("can");
	System.out.println(ýsýmlist);//[ali, can]
	ýsýmlist.remove(1);
	System.out.println(ýsýmlist);//ALÝ
	// LÝST'LERDE METHOD'LA YAPTIGIMIZ DEGISIKLIKLER KALICI OLARAK LIST'E ISLENIR
	// cunku list mutable'dýr.
	}

}
