package project.Task3;

public class Class_Calc {
		public int sum(int x,int y) {
		return  x + y;
		}
		public int sum(int x, int y, int z) {
			return x + y + z;
		}
		public double sum(double x,double y) {
			return x + y;
		}
		public double sum(double x,double y,double z) {
			return x + y + z;
		}
		
	
	public static void main(String[] args) {
		Class_Calc cc = new Class_Calc();
		System.out.println(cc.sum(100, 200));
		System.out.println(cc.sum(100, 200, 300));
		System.out.println(cc.sum(40.5, 50.5));
		System.out.println(cc.sum(60.5, 70.5, 80.5));
	}
}
