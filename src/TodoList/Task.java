package TodoList;

import java.time.LocalDate; 

public class Task {

    private String description;
    private boolean completed;
    private LocalDate dueDate; 

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public Task(String description, LocalDate dueDate) { 
        this.description = description;
        this.completed = false;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDueDate() { // Optional for due date
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) { // Optional for due date
        this.dueDate = dueDate;
    }
}