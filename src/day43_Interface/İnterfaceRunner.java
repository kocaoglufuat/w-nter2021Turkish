package day43_Interface;



public class ÝnterfaceRunner implements Interface02 {

	public static void main(String[] args) {
	
		//static olarak tanýmlanmýs býr varýable veya method
		//baska class'dan classIsmý.methodIsmý seklýnde cagrýlabýlýr
		
		Interface02.deneme2();//static keyword'lu method calýstý

		//default keyword'u ýle olusturdugumuz method ýse 
		//obje uzerýnden cagrýlabýlýr
	    //implements yaparak baglantý yaptýk
		ÝnterfaceRunner obj1=new ÝnterfaceRunner();
		obj1.deneme();//default keyword'u method calýstý

	
	}

}
