package MIDTERM;

public class TaskList {
    private class TaskEntry {
        Task task;
        TaskEntry next;

        public TaskEntry(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private TaskEntry firstTask;

    public void addTask(String information) {
        Task newTask = new Task(information);
        TaskEntry newTaskEntry = new TaskEntry(newTask);

        if (firstTask == null) {
            firstTask = newTaskEntry;
        } else {
            TaskEntry current = firstTask;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTaskEntry;

        }
    }

    public boolean taskCompleted(String taskComplete) {
        if (firstTask == null) {
            System.out.println("ERROR: Task list is empty.");
            return false;
        }

        TaskEntry current = firstTask;

        public void printTasks() {
            if (firstTask == null) {
                System.out.println("ERROR: Task list is empty.");
                return;
            }

            TaskEntry current = firstTask;

            while (current != null) {
                System.out.println(taskComplete + ". " + current.task);
                current = current.next;
                taskComplete++;
            }
        }
}