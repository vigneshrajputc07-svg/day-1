package training2;
public class prog7{
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		prog7 vv = new prog7();
		vv.m1(4, 3);
		vv.m2();
	}
}


