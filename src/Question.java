abstract class Question {

    public String query;
    public Object choices;
    public int value;
    public Object answer;
    public String type;

    public void displayQuestion(){};

    public String getQuery() {
        return query;
    }

    public Object getChoices() {
        return choices;
    }

    public int getValue() {
        return value;
    }

    public Object getAnswer() {
        return answer;
    }

    public String getType() {
        return type;
    }
}
