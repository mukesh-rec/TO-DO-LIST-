import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true)
        {
            System.out.println("Choose an action:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.println("Enter choice (1-5): ");

            if(scanner.hasNextInt())
            {
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            else {
                System.out.println(" INVALID INPUT. PLEASE ENTER A NUMBER.");
                scanner.nextLine();
                continue;
            }
            switch(choice)
            {
                case 1:
                    System.out.println("Enter task description: ");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;
                case 2:
                    todoList.viewTasks();
                    break;
                case 3:
                    todoList.viewTasks();
                    System.out.println("Enter task number to mark complete: ");
                    int completeIndex = scanner.nextInt();
                    if (!todoList.markTaskCompleted(completeIndex))
                    {
                        System.out.println("❌ Invalid task number. ");
                    }
                    scanner.nextLine();
                    break;
                case 4:
                    todoList.viewTasks();
                    System.out.println("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt();
                    if (!todoList.deleteTask(deleteIndex))
                    {
                        System.out.println("❌ Invalid task number. ");
                    }
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println(" 👋 EXITING TO DO LIST. GOOD BYE !! ");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice. please select 1-5");

            }
        }
    }
}
