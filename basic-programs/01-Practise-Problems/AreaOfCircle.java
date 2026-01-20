import java.util.Scanner;
class AreaOfCircle{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = 3.1415;
		double area  = pi*r*r;
		System.out.println(+area);
		
	}
}