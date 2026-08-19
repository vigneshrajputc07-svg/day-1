package training3;
public class prog7 implements Runnable {
	  public void run() {
		for (int i=0;i<5;i++)
		{
			System.out.println("method"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    prog7 a= new prog7();
	    
	    Thread b=new Thread(a);
		b.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
		}

	}

}
	

