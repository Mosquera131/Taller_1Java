import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        List<String> Client = new ArrayList<>();
        int amountpeople=100;

        int  curramontpeople=0;
        int input;

        String[][] Reservations =new String[amountpeople][2];

        do {

            System.out.println("Please, choose the best option for you");
            System.out.println("1.add a reservation");
            System.out.println("2.see all reservations");
            System.out.println("3.Delete a reservation.");
            System.out.println("4.leave");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input){

                case 1:
                    if (curramontpeople < amountpeople)
                    {
                        System.out.println("For a reservation type your name?");
                        Reservations[curramontpeople][0]= scanner.nextLine();

                        System.out.println("type the time for today reservation example. morning 7 and night 19");
                        Reservations[curramontpeople][1]= scanner.nextLine();

                        Client.add(Reservations[curramontpeople][0]);

                        curramontpeople++;
                    }
                    else {
                        System.out.println("there is not more space in the restaurant");
                    }

                    break;

                case 2:
                    System.out.println("My reservations");
                    for(int i=0; i<amountpeople; i++)
                    {
                        if (Reservations[i][0]!=null)
                        {System.out.println("client:"+  Reservations[i][0] +"  "+  "Reservation: "+ Reservations[i][1] );}

                    }
                    break;

                case 3:
                    if (Reservations!=null )
                    {
                        System.out.println("please type the name of the person you want to delete the reservation");
                        String ReserToDelete= scanner.nextLine();
                        for (int a=0; a < Reservations.length; a++ ){
                            for (int b=0; b< Reservations[a].length; b++)
                            {
                                if(Reservations[a][b]!=null && Reservations[a][b].equalsIgnoreCase(ReserToDelete))
                                {
                                    Reservations[a][b]=null;
                                    break ;
                                }
                            }


                        }
                        for (int i=0; i<Client.size(); i++)
                        {
                            if (Client.get(i).equals(ReserToDelete))
                            {
                                Client.remove(i);
                                System.out.println(Client);
                                i--;
                            }

                        }


                    }
                    break;
            }
        }while (input!=4);









    }
}
