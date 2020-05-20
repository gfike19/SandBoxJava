import java.util.*;

/**
 * a question with a fixed set of possible answers, of which only one may be chosen and
 * only one answer is correct
 */
public class MultiChoice extends Question {

    public MultiChoice(String query, HashMap<Character, String> choices, int value,
                       String answer) {
        this.query = query;
        this.choices = choices;
        this.value = value;
        this.answer = answer;
        this.type = "mc";
    }

    public void displayQuestion () {
        System.out.println(this.query + " " + this.value + " pts");
        HashMap<Character, String> c = (HashMap<Character, String>) choices;
        for(Map.Entry<Character, String> entry : c.entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }
    }
}
