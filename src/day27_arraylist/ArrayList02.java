package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

	

	public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	list.add("fettah");
	list.add("kemal");
	list.add("mehmet");
	list.add("fuat");
		System.out.println(list);
	//istenen �ndexdek� eleman� kald�r�p,yer�ne b�z�m �sted�g�m�z eleman� koyar(replace)
	list.set(2, "cemallettin");
	System.out.println(list);
	list.set(0, "can");
	System.out.println(list);
	
	list.add("fatih");
	System.out.println(list);
	
	list.contains("fatih");
	System.out.println(list.contains("serdar"));//boolean sonuc false ver�r
	
	//list elemanlar�n� s�ralay�n�z
	Collections.sort(list);
	System.out.println(list);

	
	
	}

}
