package day11StringMon�pu��let�ons;

public class CL1_Concatenat�on {

	public static void main(String[] args) {


		//concatenat�on: javada + �slem� yap�l�rken eger toplanan �fadelerden 
		//b�r� veya her �k�s� str�ng �se java toplama deg�l b�rlest�rme yapar.
		
		System.out.println(15+20 + "merhaba");//35merhaba
		System.out.println("merhaba"+15+20);//merhaba1520
		System.out.println("merhaba"+(15+20));//merhaba35
		System.out.println("merhaba"+15*20);//merhaba300
		
		
		String str1 = "Hello";
		String str2 ="World";
		System.out.println(str1+" "+str2);
		//str1.concat(Str2) methodu str1 sonuna str2'yi ekler. 
		System.out.println(str1.concat(" "+str2));
		
		
		
		
		
	}

}
