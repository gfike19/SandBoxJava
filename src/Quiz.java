import java.util.ArrayList;

public class Quiz {

    private int numCorrect;
    private int total;
    private double score;
    private ArrayList<Question> questions;

    public Quiz (ArrayList<Question> questions) {
        this.setQuestions(questions);

        for(Question q : this.questions) {
            this.total += q.getValue();
        }
    }

    public void calcScore(int numCorrect) {
        this.numCorrect = numCorrect;
        this.score = this.numCorrect / this.total;
    }

    public int getNumCorrect() {
        return numCorrect;
    }


    public int getTotal() {
        return total;
    }


    public double getScore() {
        return score;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
