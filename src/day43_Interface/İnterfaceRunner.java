package day43_Interface;



public class �nterfaceRunner implements Interface02 {

	public static void main(String[] args) {
	
		//static olarak tan�mlanm�s b�r var�able veya method
		//baska class'dan classIsm�.methodIsm� sekl�nde cagr�lab�l�r
		
		Interface02.deneme2();//static keyword'lu method cal�st�

		//default keyword'u �le olusturdugumuz method �se 
		//obje uzer�nden cagr�lab�l�r
	    //implements yaparak baglant� yapt�k
		�nterfaceRunner obj1=new �nterfaceRunner();
		obj1.deneme();//default keyword'u method cal�st�

	
	}

}
