package training2;
public class prog3 {
	int a = 20;

	void m1(int b) {
		System.out.println("first "+b);
		System.out.println("second"+a);
	}

	public static void main(String[] args) {
		prog3   vv = new prog3();
		vv.m1(4);
	}
}

