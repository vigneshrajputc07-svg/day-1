package training2;
class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class secondprog extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		secondprog test = new secondprog();// object
		test.marry();
		test.property();
	
	}
}


