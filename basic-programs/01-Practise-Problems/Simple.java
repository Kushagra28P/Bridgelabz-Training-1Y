import java.util.Scanner;
class Simple{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		double principle = sc.nextDouble();
			double rate = sc.nextDouble();
			double time = sc.nextDouble();
		double SI= (principle*rate*time)/100;
		System.out.println(+SI);
		
	}
}