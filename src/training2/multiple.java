package training2;
interface Atmm{
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class multiple implements Atmm, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		multiple v = new multiple();
		v.min();
		v.depo();
	}
}


