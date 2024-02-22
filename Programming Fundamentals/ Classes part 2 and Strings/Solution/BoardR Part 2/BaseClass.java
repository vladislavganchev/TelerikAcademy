import java.time.LocalDate;

public class BaseClass {
    public static void main(String[] args) {
        EventLog log = new EventLog("An important thing happened");
        System.out.println(log.getDescription());
        System.out.println(log.viewInfo());

        EventLog log2 = new EventLog("test");
    }
}
