import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);

       int amountProducts=100;
       String[][] productmatrix = new String[amountProducts][2];
        int input;
       int  currentProductCount=0;
       boolean found = false;


       do {
           System.out.println("Please, choose the best option for you");
           System.out.println("1.add a product");
           System.out.println("2.see all product");
           System.out.println("3.Delete a product.");
           System.out.println("4.leave");
           input = scanner.nextInt();
           scanner.nextLine();

           System.out.println("**WELCOME TO THE SHOP**");

         switch (input) {
             case 1:
                 if(currentProductCount <amountProducts){

                     System.out.println("please, type the name of the product that you want to add");
                     productmatrix[currentProductCount][0] = scanner.nextLine();

                     System.out.println("please, type the quantity of the product that you want to add");
                     productmatrix[currentProductCount][1] = scanner.nextLine();
                     currentProductCount++;
                 }
                 else {
                     System.out.println("product limited reached.");
                 }
                 break;

             case 2:
                 System.out.println("* \nProduct List:*");
                 for (int i = 0; i < amountProducts; i++) {
                     if (productmatrix[i][0] != null) { // Asegura que solo imprima los productos ingresados
                         System.out.println("Product: " + productmatrix[i][0] + ", Quantity: " + productmatrix[i][1]);
                         System.out.println("************************************************************************");
                     }
                 }
                 break;

             case 3:
                 if (productmatrix !=null)
                 {
                     System.out.println("please, type the product that you want to delete");
                     String productToDelet = scanner.nextLine();
                     for(int a=0; a <productmatrix.length; a++){
                         for(int b=0; b <productmatrix[a].length; b++){
                             if (productmatrix[a][b]!=null && productmatrix[a][b].equalsIgnoreCase(productToDelet))
                             {productmatrix[a][b]=null;
                                 System.out.println(productToDelet+"has been deleted");
                                 found=true;
                             break;}
                         }
                     }

                 } else{
                     System.out.println("The array is empty");
                 }

                 break;
             default:
                 System.out.println("Have a wonderful day.");
         }


 } while (input!=4);
        scanner.close();
    }
}
