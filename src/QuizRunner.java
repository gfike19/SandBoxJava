import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuizRunner {

    public static void main(String[] args) {
        HashMap<Character, String> choices = new HashMap<>();
        choices.put('a', "Anna");
        choices.put('b', "Fiona");
        choices.put('c', "Luna");
        choices.put('d', "Reapl");
        String [] answer = new String[] {"a", "b"};
        Checkbox chkbx = new Checkbox("Who are the bestest girls?", choices, 5, answer);

        TrueFalse tf = new TrueFalse("Allison is always right", 5, "t");

        MultiChoice mc =  new MultiChoice("Who is a demon?", choices, 5, "d");

        // test checkbox
        Quiz qz = new Quiz();
        qz.addQuestion(chkbx);
//        qz.runQuiz();

        // test true false
        Quiz qz0 = new Quiz();
        qz0.addQuestion(tf);
        //qz0.runQuiz();

        //test multiple choice
        Quiz qz1 = new Quiz();
        qz1.addQuestion(mc);
        //qz1.runQuiz();

        //test multiple choice and true false
        Quiz qz2 = new Quiz();
        qz2.addQuestion(tf);
        qz2.addQuestion(mc);
        //qz2.runQuiz();

        Quiz qz3 = new Quiz();
        qz3.addQuestion(chkbx);
        qz3.addQuestion(mc);
        qz3.addQuestion(tf);
        qz.runQuiz();
        }
    }



