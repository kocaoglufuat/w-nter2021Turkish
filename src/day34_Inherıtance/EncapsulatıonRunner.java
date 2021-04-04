package day34_Inherýtance;

public class EncapsulatýonRunner {

	public static void main(String[] args) {
		
		Encapsulatýon obj1= new Encapsulatýon();
		System.out.println(obj1.getokulIsmi());;
	System.out.println(obj1.getOkulHesapNo());
	System.out.println(obj1.getOkulAcýkMý());
	
	
	obj1.setOkulIsmi("mehmet koleji");
	System.out.println(obj1.getokulIsmi());
	Encapsulatýon obj2= new Encapsulatýon();
	System.out.println(obj2.getokulIsmi());//yýldýz koleji
	
	}

}
