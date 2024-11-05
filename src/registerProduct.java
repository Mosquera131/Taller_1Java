import java.util.Scanner;

public class registerProduct {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int numUsers=100;
        String[][] userMatrix=new String[numUsers][3];
        int input;
        int currentUserCount=0;


        do {
            System.out.println("Please, choose the best option for you");
            System.out.println("1.add an User");
            System.out.println("2.Show all the Users");
            System.out.println("3.leave it");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    if (currentUserCount < numUsers) {
                        System.out.println("Please type your name:");
                        userMatrix[currentUserCount][0] = scanner.nextLine();

                        System.out.println("Please type an email:");
                        userMatrix[currentUserCount][1] = scanner.nextLine();

                        System.out.println("Please type a password:");
                        userMatrix[currentUserCount][2] = scanner.nextLine();

                        if (!isValidPassword(userMatrix[currentUserCount][1])) {
                            System.out.println("Please, try a new password.");
                            continue; // if the password it is not right, it keeps asking for it.
                        }

                        System.out.println("The user has been registered.\n");
                        currentUserCount++;

                    } else {
                        System.out.println("User limit reached.");
                    }
                    break;



                case 2:
                    System.out.println("* \nProduct List:*");
                    for (int i = 0; i < numUsers; i++) {
                        if (userMatrix[i][0] != null) { // Asegura que solo imprima los productos ingresados
                            System.out.println("User: " + userMatrix[i][0] + ", "+ "Email:"+userMatrix[i][1]+", password: " + userMatrix[i][2]  );
                            System.out.println("************************************************************************");
                        }
                    }

                    break;
            }

        }while (input != 3) ;
        scanner.close();

    }
    public static boolean isValidPassword (String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (password == null || !password.matches(passwordRegex)) {
            System.out.println("La contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
            return false;
        }
        return true;
    }
    }

