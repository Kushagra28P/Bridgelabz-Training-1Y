import java.util.Scanner;
class Perimeter{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
			double l = sc.nextDouble();
			double b= sc.nextDouble();
		double perimetre= 2*(l+b);
		System.out.println(+perimetre);
		
	}
}