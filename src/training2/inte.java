package training2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class inte extends Abc{

	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	inte v = new inte();
	v.depo();
	v.with();
}
}


