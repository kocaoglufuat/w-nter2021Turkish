package day34_Inher�tance;

public class Encapsulat�onRunner {

	public static void main(String[] args) {
		
		Encapsulat�on obj1= new Encapsulat�on();
		System.out.println(obj1.getokulIsmi());;
	System.out.println(obj1.getOkulHesapNo());
	System.out.println(obj1.getOkulAc�kM�());
	
	
	obj1.setOkulIsmi("mehmet koleji");
	System.out.println(obj1.getokulIsmi());
	Encapsulat�on obj2= new Encapsulat�on();
	System.out.println(obj2.getokulIsmi());//y�ld�z koleji
	
	}

}
