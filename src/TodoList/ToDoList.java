package TodoList;
import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> tasks;
    private User owner;

    public ToDoList(User owner) {
        this.tasks = new ArrayList<>();
        this.owner = owner;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).setCompleted(true);
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public void printList() {
        System.out.println("To-Do List for " + owner.getName());
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "Completed" : "Pending";
            System.out.println((i + 1) + ". " + task.getDescription() + " (" + status + ")");
        }
    }
}
