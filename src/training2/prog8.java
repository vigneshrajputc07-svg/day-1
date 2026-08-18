package training2;

class Par {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class prog8 extends Par {

	public static void main(String[] args) {
		prog8 test = new prog8();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}