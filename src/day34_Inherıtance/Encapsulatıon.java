package day34_Inherýtance;

public class Encapsulatýon {

	private String okulIsmi = "yýldýz koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcýkMý = true;

	
	
	public String getokulIsmi() {
		return okulIsmi;
	
	}
	 public int getOkulHesapNo() {
		 return okulHesapNo;
		 
	 }
	public boolean getOkulAcýkMý() {
		return okulAcýkMý;
	}
	
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
	}
	public void setOkulHesapNo(int OkulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	public void setOkulAcýkMý(boolean OkulAcýkMý) {
		this.okulAcýkMý=okulAcýkMý;
	}
	
	
	
}
