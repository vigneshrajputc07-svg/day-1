package training2;
public class prog6 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		prog6  vv = new prog6();
		vv.m1(4,3);
		vv.m2();
	}
}
