package day42abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {
		System.out.println(C1_Final.say�);

		// stat�c b�r ver�able okul �sm�

		C2_Final2 obj1 = new C2_Final2();
		obj1.deneme();
	}

	public void deneme() {
		System.out.println("child class�n'dak� overriding method");
	}

//public void deneme2() {
	// cannot over�de the f�nal method from C1_FINAL
// }

}
