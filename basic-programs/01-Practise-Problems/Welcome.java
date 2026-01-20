import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();   

        System.out.println(sentence);
    }
}
