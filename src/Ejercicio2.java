import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int entrance=50;

do {
    System.out.println("How many entrance do you need?");
    int reserve = scanner.nextInt();

    if (entrance >= reserve) {
        entrance -= reserve;
        System.out.println("thank you for your booking, now we just have  " + entrance + " entrance available");

    } else if (reserve > entrance) {
        System.out.println("you are asking for more that is available");
    } else {
        System.out.println("there are not more entrance, it's full" + entrance);
    }
}while (entrance>0);

    scanner.close();

    }
}
