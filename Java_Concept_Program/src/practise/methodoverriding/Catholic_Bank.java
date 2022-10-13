
package practise.methodoverriding;

public class Catholic_Bank extends Baroda_Bank {
	@Override
	public void rate_Of_Interest() {
		super.rate_Of_Interest();
		System.out.println("CATHOLIC ROI is 1.00%");
	}
	public static void main(String[] args) {
		Catholic_Bank bank2 = new Catholic_Bank();
		bank2.rate_Of_Interest();
	}

}
