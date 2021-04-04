package day42abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {
		System.out.println(C1_Final.sayý);

		// statýc býr verýable okul ýsmý

		C2_Final2 obj1 = new C2_Final2();
		obj1.deneme();
	}

	public void deneme() {
		System.out.println("child classýn'daký overriding method");
	}

//public void deneme2() {
	// cannot overýde the fýnal method from C1_FINAL
// }

}
