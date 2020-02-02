public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public String getStatusNumber() {
        return (isDone ? "1" : "0");
    }

    public void setDone() {
        isDone = true;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }
}