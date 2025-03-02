package MIDTERM;

public class Task {
    private String information;
    private boolean completion;

    public Task (String information) {
        this.information = information;
        this.isCompleted = false;
    }

    public String getInformation() {
        return information;
    }

    public boolean getCompletion() {
        return completion;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return information + " ~~~ " + (completion ? "Task Complete!" : "Task In Progress...");
    }
}