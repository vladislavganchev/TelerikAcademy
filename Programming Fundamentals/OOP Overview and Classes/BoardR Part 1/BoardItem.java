import java.time.LocalDate;
import java.lang.String;

public class BoardItem {
    String title;
    LocalDate dueDate;
    Status status;

    public BoardItem(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = Status.OPEN;
    }

    public void revertStatus() {
        this.status = this.status.revert();
    }

    public void advanceStatus() {
        this.status = this.status.advance();
    }

    public String viewInfo() {
        return String.format(" '%s', [%s | %s]", this.title, this.dueDate, this.status);
    }
}
