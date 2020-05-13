import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuizRunner {

    public static void main(String[] args) {
        ArrayList<String> chkBxAn = new ArrayList<>();
        chkBxAn.add("Standard") ;
        chkBxAn.add("Elven");
        chkBxAn.add("Dwarven");
    chkBxAn.add("Metric");
        Checkbox ch = new Checkbox("In what system is ton found?", 4, chkBxAn);
        System.out.print(ch.id);
        }
    }



