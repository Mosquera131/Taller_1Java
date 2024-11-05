import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Plesse type your age");
        int input= scanner.nextInt();

        String result= input>18? "you are old enough, you can go inside":"you don't have the age to go inside";
        System.out.println(result);
        scanner.close();
    }
}