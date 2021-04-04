package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalT�me {

	public static void main(String[] args) {
		
		//java'da saat �le �slem yapmak �c�n
		//LocalT�me class'�ndan obje kullan�r�z
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		for (int i = 0; i < 100000000; i++) {
			i+=1;
		}

		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);

		
	System.out.println(saat.plusHours(15));
	System.out.println(saat.getSecond());
	System.out.println(saat.minusSeconds(545785425));
	
	
	System.out.println(saat.now(ZoneId.of("America/Chicago")));//ulkeler aras� saaat d�l�m�
	
	}

}
