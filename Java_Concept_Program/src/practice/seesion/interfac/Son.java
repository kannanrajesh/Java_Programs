package practice.seesion.interfac;

public class Son implements Mom {

	@Override
	public void bank() {
		System.out.println("Savings Money");
	}

	@Override
	public void land(){
		System.out.println("Future Property");
	}

	@Override
	public void house() {
		System.out.println("NonMovable Assert");
	}
public static void main(String[] args) {
	Son prop = new Son();
	prop.bank();
	prop.house();
	prop.land();
}
}
