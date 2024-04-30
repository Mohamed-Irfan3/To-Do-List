package Todolist;

import models.User;
import services.ToDoListService;

public class main {
	public static void main(String[] args) {
        ToDoListService todoListService = new ToDoListService();
       
        User user1 = todoListService.registerUser("user1", "password1");
        User user2 = todoListService.registerUser("user2", "password2");

        User authenticatedUser1 = todoListService.authenticateUser("user1", "password1");
        User authenticatedUser2 = todoListService.authenticateUser("user2", "password2");

        todoListService.addTask(authenticatedUser1, "Buy groceries", "High");
        todoListService.addTask(authenticatedUser1, "Finish report", "Medium");
        todoListService.addTask(authenticatedUser1, "Call mom", "Low");

        System.out.println("Tasks for user1:");
        todoListService.showTasks(authenticatedUser1);

        boolean success = todoListService.markTaskAsCompleted(authenticatedUser1, 1);
        if (success) {
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }

        System.out.println("\nTasks for user1 after marking task as completed:");
        todoListService.showTasks
	}
}