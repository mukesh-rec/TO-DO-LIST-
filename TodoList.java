import java.util.ArrayList;
public class TodoList {
    private ArrayList<Task> tasks;
    public TodoList()
    {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description)
    {
        Task newTask = new Task(description);
        this.tasks.add(newTask);
        System.out.println("✅ TASK ADDED : \""+ description + "\"");
    }
    public void viewTasks()
    {
        if(tasks.isEmpty())
        {
            System.out.println("🫙 YOUR TO DO LIST IS EMPTY");
            return;
        }
        System.out.println("\n----📃YOUR TO DO LIST📃----");
        for (int i=0;i<tasks.size();i++)
        {
            System.out.println((i+1) + "." + tasks.get(i));
        }
        System.out.println("-------------------------------------\n");
    }
    public boolean markTaskCompleted(int taskNumber)
    {
        int index = taskNumber - 1;
        if(index >=0 && index<tasks.size())
        {
            tasks.get(index).markCompleted();
            System.out.println("Task"+ index+ " marked as completed !!");
            return true;
        }
        return false;
    }
    public boolean deleteTask(int index)
    {
        if (index > 0 && index <= tasks.size())
        {
            tasks.remove(index-1);
            System.out.println("❌ TASK" + index + " removed. ");
            return true;
        }
        return false;
    }

}
