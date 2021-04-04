package day27_arraylist;

import java.util.ArrayList;

public class Arraylist01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ali");
		list.add("kemal");
		list.add("mehmet");
		list.add("fuat");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(1));// ýndeexý 1olan kemalý sýlýp,sýldýgý elemaný bana gerý dondurecek
		System.out.println(list);// ali,mehmet,fuat

System.out.println(list.remove("mehmet"));//mehmetý sýlecek býze true dondurecek
	System.out.println(list.remove("mehmet"));
	
	System.out.println(list);
	list.add("ayse");
	System.out.println(list);
	

	}

}
