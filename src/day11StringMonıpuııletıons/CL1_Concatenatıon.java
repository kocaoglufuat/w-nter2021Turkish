package day11StringMonýpuýýletýons;

public class CL1_Concatenatýon {

	public static void main(String[] args) {


		//concatenatýon: javada + ýslemý yapýlýrken eger toplanan ýfadelerden 
		//býrý veya her ýkýsý strýng ýse java toplama degýl býrlestýrme yapar.
		
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
