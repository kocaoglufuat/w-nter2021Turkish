package day22_constructor;

public class CarUretRunner {

	public static void main(String[] args) {

	CarUret car1 =new CarUret();
	car1.model="corolla";
	car1.marka="toyota";
	car1.yýl=2010;
	car1.kazasýVarmý=true;
	 System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasýVarmý);
			car1.yakýt("benzýn");
			car1.vites("duz");
	
	}	

}
