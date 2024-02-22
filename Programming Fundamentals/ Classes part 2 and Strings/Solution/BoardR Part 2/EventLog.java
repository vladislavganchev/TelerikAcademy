import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventLog {
    private final String description;
    private final LocalDate timestamp;

    public EventLog(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty or null");
        }
        this.description = description;
        this.timestamp = LocalDate.now();
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getTimestamp() {
        return this.timestamp;
    }

    public String viewInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        return String.format(" '%s', [%s]",timestamp.format(formatter), description);
    }
}
