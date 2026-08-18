package training2;
class gp
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Pa extends gp
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class hirec extends gp{

	public static void main(String[] args) {
 		hirec bb= new hirec();
 		Pa x=new Pa();
 		bb.bp();
 		x.cancer();
	}
}
