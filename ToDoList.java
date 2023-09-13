package task;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String task;
        int choice;

        do {
            System.out.println("----- To-Do List Menu -----");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("----- Tasks -----");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}

