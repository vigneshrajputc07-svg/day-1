package training2;

public class over {
	
		void m1() {
			System.out.println("me");
		}
		void m1(int a) {
			System.out.println("you");
		}
		public static void main(String[] args) {
			over test = new over();// object
			test.m1();
			test.m1(3);
		}
	}


