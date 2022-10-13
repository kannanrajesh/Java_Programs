package practise.methodoverriding;

public class Sbi_Bank extends Rbi_Bank{
	@Override
	public void rate_Of_Interest( float interest) {
		super.rate_Of_Interest();
        System.out.println("SBI ROI is "+interest +"%");	}
	
	public static void main(String[] args) {
		Sbi_Bank bank = new Sbi_Bank();
		bank.rate_Of_Interest(1.55f);       
}

}
