package trainig;

public class fact {
	int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}

	public static void main(String[] args) {
		fact m1=new fact();
		System.out.println(m1.fact(5));
	     

	}

}
