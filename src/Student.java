import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        Map<String, Double > Student = new HashMap<>();
        int input;

        do {
            System.out.println("Please, choose the best option for you");
            System.out.println("1.add a student and his grade average");
            System.out.println("2.see all students");
            System.out.println("3.Search for a student average");
            System.out.println("4.leave");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input){
                case 1:
                    System.out.println("please type the name of the student");
                    String name= scanner.next();

                    if(Student.containsKey(name))
                    {
                        System.out.println("this student is already in the List");
                    }

                    System.out.println("please type the grade average student. example 3,6");
                    Double grade = scanner.nextDouble();

                    Student.put(name, grade);
                    break;
                case 2:

                    System.out.println("Students List");
                    for(Map.Entry<String, Double>entry :Student.entrySet())
                    {
                        System.out.println("name:" +" " + entry.getKey() +" "+ "Grade Average:" +" " + entry.getValue());
                    }

                    break;

                case 3:
                    System.out.println("Type the name of the student you want to know his grade average");
                    String nameAverage= scanner.next();


                    Double gradeAverage= Student.get(nameAverage);
                    if(gradeAverage!=null)
                    {
                        System.out.println("the average of  "+" "+  nameAverage +" "+ "is"+ gradeAverage);
                    }
                    break;

                case 4:
                    System.out.println("Have a wonderful day");
                    break;

                default:
                    System.out.println("This option is not valid");
                    break;
            }


        }while (input!=4);




    }
}
