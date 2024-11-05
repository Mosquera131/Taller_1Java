import java.util.Scanner;

public class Cine {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);

        char[][] seats= new char[5][5];
        int input;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = 'O'; // 'O' all the seats are available
            }
        }
        do {
            System.out.println("Please, choose the best option for you");
            System.out.println("1.Reserve a seat");
            System.out.println("2.see all product");
            System.out.println("3.leave");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input){
                case 1:
                    System.out.println("please choose a row");
                    int row= scanner.nextInt();

                    System.out.println("please choose a Column");
                    int col= scanner.nextInt();

                    if (row<0|| col>4 || row>4 || col<0)
                    {
                        System.out.println("The rows and  the column have to be in a range from 0 to 5");
                    } else if (seats[row][col]=='X') {
                        System.out.println("The seat is already take, choose another one.");
                    }
                    else {
                        System.out.println("The seat has been reserve successfully ");
                        seats[row][col]='X';
                    }
                    break;

                case 2:
                    for (int i=0 ; i < seats.length; i++)
                    {
                        for (int j=0; j <seats[i].length; j++)
                        {
                            System.out.print(seats[i][j]+" ");
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("Thank you for booking your seat, have a wonderful day.");
                        break;

                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        }
        while(input!=3);


    }
}
