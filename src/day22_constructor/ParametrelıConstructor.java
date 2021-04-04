package day22_constructor;

public class ParametrelıConstructor {
	String marka;
	String model;
	int yıl;
	boolean kazasıVarmı;
	
	public ParametrelıConstructor(int yıl) {
		this.yıl= yıl;
	}
	public ParametrelıConstructor() {
		
	}
	public ParametrelıConstructor(String Marka,String Model) {
		
	}
	public ParametrelıConstructor(String Marka,String Model,int yıl,boolean kazasıVarmı) {
		this.marka=Marka;
		this.model=Model;
		this.yıl=yıl;
		this.kazasıVarmı=kazasıVarmı;
	}
		
	public void yakıt(String yakıt) {
		System.out.println("araba yakıt olarak" + yakıt + "kullanır");
	}
	public void vites(String vites) {
		System.out.println("araba" + vites + "viteslidir");
	}
}
