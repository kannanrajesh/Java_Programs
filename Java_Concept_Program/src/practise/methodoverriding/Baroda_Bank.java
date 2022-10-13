package practise.methodoverriding;

public class Baroda_Bank extends Sbi_Bank {
	@Override
	public void rate_Of_Interest() {
		super.rate_Of_Interest();
		System.out.println("BARODA ROI is 0.99%");
	}
	public static void main(String[] args) {
		Baroda_Bank bank3 = new Baroda_Bank();
		bank3.rate_Of_Interest();
	}

}
