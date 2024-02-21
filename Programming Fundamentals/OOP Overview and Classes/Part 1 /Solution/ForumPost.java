import java.util.ArrayList;

public class ForumPost {
    String author;
    String text;
    int upVotes;
    ArrayList<String> replies;

    public ForumPost(String author, String text, int upVotes) {
        this.author = author;
        this.text = text;
        this.upVotes = upVotes;
        this.replies = new ArrayList<>();
    }

    public ForumPost(String author, String text) {
        this(author, text, 0);
    }

    public String format() {
        StringBuilder strB = new StringBuilder();
        strB.append(String.format("%s / by %s, %d votes. %n", this.text, this.author, this.upVotes));

        if (replies.isEmpty()) {
             {
                strB.append("No replies yet.\n");
            }
        } else {
            for (String reply : replies) {
                strB.append(" -").append(reply).append("\n");
            }
        }
        return strB.toString();
    }
}
