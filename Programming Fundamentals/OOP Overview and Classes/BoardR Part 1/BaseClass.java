import java.time.LocalDate;

public class BaseClass {
    public static void main(String[] args) {
        // Create BoardItem instances
        BoardItem item = new BoardItem("Registration doesn't work", LocalDate.now().plusDays(2));
        item.advanceStatus(); // Advances the status of the item
        BoardItem anotherItem = new BoardItem("Encrypt user data", LocalDate.now().plusDays(10));

        // Create a Board instance and add items to it
        Board board = new Board();
        board.items.add(item);
        board.items.add(anotherItem);

        // Advance the status of each BoardItem in the board
        for (BoardItem boardItem : board.items) {
            boardItem.advanceStatus();
        }

        // Print information for each BoardItem in the board
        for (BoardItem boardItem : board.items) {
            System.out.println(boardItem.viewInfo());
        }
    }
}
