import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TareasPendiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();
        List<String> completeList=new ArrayList<>();
        int input;
        final  int max = 2;

        do {

            System.out.println("Please, choose the best option for you");
            System.out.println("1.add task");
            System.out.println("2.see all task");
            System.out.println("3.to mark a task as done.");
            System.out.println("4.see all the Complete List ");
            System.out.println("5.leave");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Please, add the homework that you have to do");
                    String task = scanner.next();
                    if (todoList.size() < max) {
                        todoList.add(task);
                        System.out.println("you task was added.");
                    } else {
                        System.out.println("you can't add more task, already has 10 task to do.");
                    }
                    break;

                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("You list is empty");
                    } else {
                            for (int i = 0; i < todoList.size(); i++) {

                                System.out.println((i+1)+":"+ todoList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("please time the task that you want to delete");
                    String complete= scanner.next();
                    for (int i = 0; i < todoList.size(); i++){
                        if (todoList.get(i).equals(complete))
                        {
                            completeList.add(complete);
                            todoList.remove(i);
                            i--;
                        }
                    }

                    break;
                case 4:
                    if (completeList.isEmpty()) {
                        System.out.println("You list is empty");
                    } else {
                        for (int i = 0; i < completeList.size(); i++) {

                            System.out.println((i+1)+":"+ completeList.get(i));
                        }
                    }

                    break;

                default:
                    System.out.println("Have a wonderful day.");
            }
        } while (input != 5);
        scanner.close();
    }
}








