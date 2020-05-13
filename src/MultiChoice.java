import java.util.ArrayList;

public class MultiChoice extends Question {

    public MultiChoice(ArrayList<String> query, int value, String answer) {
        this.query = query;
        this.value = value;
        this.answer = answer;
    }
}
