import java.time.LocalDate;
import java.lang.String;

public class BoardItem {
    private String title;
    private LocalDate dueDate;
    private Status status;

    public BoardItem(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = Status.OPEN;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title.length() < 5 || title.length() > 30) {
            throw new IllegalArgumentException("Title must be between 5 and 30 characters");
        }
        this.title = title;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        if (dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Due date cannot be in the past.");
        }
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return this.status;
    }

    public void revertStatus() {
        this.status = this.status.revert();
    }

    public void advanceStatus() {
        this.status = this.status.advance();
    }

    public String viewInfo() {
        return String.format(" '%s', [%s | %s]", this.title, this.status, this.dueDate);
    }
}
