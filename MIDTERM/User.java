package MIDTERM;

public class User {
    private String name;
    private TaskList tasks;

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TaskList getTaskList() {
        return tasks;
    }

    public void viewTasks() {
        tasks.viewTasks();
    }

    public boolean completeTask(String information) {
        return tasks.completeTask(information);
    }

    public void removeTask(String information) {
        tasks.removeTask(information);
    }
}