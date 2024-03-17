package TodoList;
public class Main {

    public static void main(String[] args) {
        User user = new User("MohamedIrfan", "Irfan@example.com");
        ToDoList list = new ToDoList(user);

        list.addTask(new Task("Buy groceries"));
        list.addTask(new Task("Finish homework"));
        list.addTask(new Task("Call the dentist")); 

        list.printList();

        list.markTaskCompleted(1);
        System.out.println("\nAfter marking task 2 as completed:");
        list.printList();
    }
}