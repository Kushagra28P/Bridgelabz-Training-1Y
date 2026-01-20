import java.util.Scanner;
class volumeofcylinder{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		double r = sc.nextDouble();
			double height = sc.nextDouble();
		double pi = 3.1415;
		double volume = pi*r*r*height;
		System.out.println(+volume);
		
	}
}