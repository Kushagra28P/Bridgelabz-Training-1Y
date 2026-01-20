import java.util.Scanner;
class Simple{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
			double base  = sc.nextDouble();
			double exp = sc.nextDouble();
 double P = Math.pow(base,exp);
		System.out.println(+P);
		
	}
}