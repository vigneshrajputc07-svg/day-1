package training3;
public class prog6
extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}

	public static void main(String[] args) {
		prog6 test=new prog6();
		test.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("main method"+i);
		}
		

	}

}



