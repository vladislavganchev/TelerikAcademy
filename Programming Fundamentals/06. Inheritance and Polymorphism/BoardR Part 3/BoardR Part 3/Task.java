import java.time.LocalDate;

public class Task {
    String title;
    String assignee;
    LocalDate dueDate;

    public Task(String title, String assignee, LocalDate dueDate) {
        this.title = title;
        this.assignee = assignee;
        this.dueDate = dueDate;
    }
}
