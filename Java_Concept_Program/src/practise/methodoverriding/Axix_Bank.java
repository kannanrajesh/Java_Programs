package practise.methodoverriding;

public class Axix_Bank extends Rbi_Bank {
	@Override
		public void rate_Of_Interest(float intrest) {
			// TODO Auto-generated method stub
			super.rate_Of_Interest(intrest);
			System.out.println("Intrest Rate upto "+intrest);
		}
	
//	public void rate_Of_Interest(float interest) {
//		super.rate_Of_Interest();
//		System.out.println("Intrest Rate upto "+interest);
//	}

	public void rate_Of_Interest() {
	System.out.println("FOLLOW AXIS ROI ,NOT MORE THAN RBI");	
	}

}
