package practice.seesion.interfac;

public interface Mom {

	void bank();
	
	void land();
	
	void house();
	
	public static void main(String[] args) {
		Mom son = new Son();
		son.house();
		son.bank();
		son.land();
	}
}

