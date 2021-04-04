package day23_mYcONSTURCTOR;

public class Static1 {

	static String isim ="mehmet";
	int yas =49;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Static verýable lar olusturulan tum objeler ýcýn gecerlidir(okul adý gýbý)
		// mesela býr class da 1 instance 1 de static veriable olsun

		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
        Static1 st3 = new Static1();
	
        st1.isim="hasan";
        st1.yas=25;
     System.out.println(st1.isim+" "+st1.yas);   
        st2.isim="ayse";
        st2.yas =30;
        System.out.println(st2.isim+" "+st2.yas); 
        System.out.println(st1.isim+" "+st1.yas); 
        st3.isim="alican";
        st3.yas=40;	
        System.out.println(st3.isim+" "+st3.yas); 
        System.out.println(st2.isim+" "+st2.yas); 
        System.out.println(st1.isim+" "+st1.yas); 
	}


}