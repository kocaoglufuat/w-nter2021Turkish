package day22_constructor;

public class Parametrel�Constructor {
	String marka;
	String model;
	int y�l;
	boolean kazas�Varm�;
	
	public Parametrel�Constructor(int y�l) {
		this.y�l= y�l;
	}
	public Parametrel�Constructor() {
		
	}
	public Parametrel�Constructor(String Marka,String Model) {
		
	}
	public Parametrel�Constructor(String Marka,String Model,int y�l,boolean kazas�Varm�) {
		this.marka=Marka;
		this.model=Model;
		this.y�l=y�l;
		this.kazas�Varm�=kazas�Varm�;
	}
		
	public void yak�t(String yak�t) {
		System.out.println("araba yak�t olarak" + yak�t + "kullan�r");
	}
	public void vites(String vites) {
		System.out.println("araba" + vites + "viteslidir");
	}
}
