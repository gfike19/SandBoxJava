import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 a question with a fixed set of possible answers, of which any number may be chosen;
 there is one correct combination of choices
 */
public class Checkbox extends Question {

    public Checkbox(String query, HashMap<Character, String> choices,
                    int value, ArrayList<String> answer) {
        this.query = query;
        this.choices = choices;
        this.value = value;
        this.answer = answer;
        this.type = "chkbx";
    }

    public void displayQuestion() {
        System.out.println(this.query + " " + this.value + " pts");
        HashMap<Character, String> c = (HashMap<Character, String>) this.choices;
        for(Map.Entry<Character, String> entry : c.entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }
    }
}
