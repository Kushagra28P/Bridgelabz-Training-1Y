import java.util.Scanner;
class KmToMiles{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
			double kilometre = sc.nextDouble();
			double miles = kilometre*.621371;
		System.out.println(+miles);
		
	}
}