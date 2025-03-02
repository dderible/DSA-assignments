package MIDTERM;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner theScan = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("~~~ DECLAN'S TASK MANAGER! ~~~");
            System.out.print("Select an option below:");
            System.out.println("1: Adding User");
            System.out.println("2: Adding Task");
            System.out.println("3: Marking Task as Completed");
            System.out.println("4: View Tasks");
            System.out.println("5: Exit");
            System.out.print(" ");

            int choice = theScan.nextInt();
            theScan.nextLine();

            switch (choice) {
                case 1: //Adding user
                    System.out.print("Please enter the name of the user: ");
                    String username = theScan.nextLine();
                    addUser(username);
                    break;

                case 2: //Adding task
                    System.out.print("Please enter the name of the user: ");
                    String usersTask = theScan.nextLine();
                    User user = getUser(usersTask);
                    if (user == null) {
                        System.out.println("ERROR: User does not exist.");
                        break;
                    }
                    System.out.print("Enter task information: ");
                    String taskInfo = theScan.nextLine();
                    user.addTask(taskInfo);
                    break;

                case 3: //Marking a task as completed
                    System.out.print("Please enter the name of the user: ");
                    String taskComplete = theScan.nextLine();
                    User userTaskComplete = getUser(taskComplete);
                    if (userTaskComplete == null) {
                        System.out.println("ERROR: User does not exist.");
                        break;
                    }
                    System.out.print("Enter task information: ");
                    int taskManager = theScan.nextInt();
                    userTaskComplete.markAsCompleted(taskManager);
                    break;

                case 4: //View the tasks
                    System.out.print("Please enter the name of the user: ");
                    String viewTasks = theScan.nextLine();
                    User userViewTasks = getUser(viewTasks);
                    if (userViewTasks == null) {
                        System.out.println("ERROR: User does not exist.");
                        break;
                    }
                    userViewTasks.printTasks();
                    break;

                case 5: //Exit program
                    System.out.println("~~~ Thank you for using DECLAN'S TASK MANAGER. Until next time! ~~~");
                    System.out.println(" ");
                    scanner.close();
                    return;

                default:
                    System.out.println("ERROR: Invalid choice. Please try again.");
            }
        }
    }
}