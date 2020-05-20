import javafx.util.Pair;

public class TrueFalse extends Question{

    public TrueFalse(String query, int value, String answer) {
        this.query = query;
        this.value = value;
        this.answer = answer;
        this.type = "tf";
    }

    public void displayQuestion() {
        System.out.println(this.query + " " + this.value + " pts" + " (T/F)");
    }
}
