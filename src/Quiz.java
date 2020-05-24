import java.util.*;

/**
 * Add questions
 * Run or carry out the quiz
 * Grade the quiz
 */
public class Quiz {

    private double numCorrect;
    private int total;
    private double score;
    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz() {
    }

    public void addMultipleQuestions(ArrayList<Question> qs) {
        this.questions.addAll(qs);
        for (Question q : qs) {
            this.total += q.getValue();
        }
    }

    public void addQuestion(Question q) {
        this.questions.add(q);
        this.total += q.getValue();
    }

    public void calcScore(double numCorrect) {
        this.numCorrect = numCorrect;
        this.score = this.numCorrect / this.total;
        this.score *= 100;
    }

    public void runQuiz() {
        Scanner in = new Scanner(System.in);
        for (Question q : questions) {
            q.displayQuestion();

            // if question is checkbox type
            if (q.type.equals("chkbx")) {
                System.out.print("Enter your answers separated by a comma, no spaces.\n");
                String raw = in.nextLine();
                String [] arr = raw.split(",");
                String [] answers = (String []) q.getAnswer();
            }

            //multiple choice and true false
            if (q.type.equals("mc") || q.type.equals("tf")) {
                System.out.print("Enter a single letter for your answer: ");
                // TODO account for user entering more than one letter
                String userInput = in.next().toLowerCase();
                String answer = (String) q.getAnswer();
                if (answer.toLowerCase().equals(userInput)) {
                    this.numCorrect += q.getValue();
                }
            }
        }

        this.calcScore(numCorrect);

        System.out.println("Total correct: " + this.numCorrect + "\nOut of: " + this.total + "\nComes to: " +
                this.score + " %");
    }


// getters and setters
        public double getNumCorrect () {
            return numCorrect;
        }

        public int getTotal () {
            return total;
        }

        public double getScore () {
            return score;
        }

        public ArrayList<Question> getQuestions () {
            return questions;
        }

    }
