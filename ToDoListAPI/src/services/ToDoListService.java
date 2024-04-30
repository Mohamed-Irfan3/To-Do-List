package services;
import java.util.ArrayList;
import java.util.List;

import models.Task;
import models.User;

public class ToDoListService {
	private UserService userService;
	public Object showTasks;

    public ToDoListService() {
        this.userService = new UserService();
    }

    public User registerUser(String username, String password) {
        return userService.registerUser(username, password);
    }

    public User authenticateUser(String username, String password) {
        return userService.authenticateUser(username, password);
    }

    public void addTask(User user, String description, String priority) {
        user.addTask(new Task(description, priority));
    }

    public void showTasks(User user) {
        List<Task> tasks = user.getTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "Completed" : "Not Completed";
                System.out.println((i + 1) + ". " + task.getDescription() + " - Priority: " + task.getPriority() + " - Status: " + status);
            }
        }
    }

    public boolean markTaskAsCompleted(User user, int taskNumber) {
        List<Task> tasks = user.getTasks();
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            Task task = tasks.get(taskNumber - 1);
            task.setCompleted(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeTask(User user, int taskNumber) {
        return user.removeTask(taskNumber);
    }

}
