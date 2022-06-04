public class Bill {

    private String name;

    private int amount;


    private int dueDate;


    private boolean autopay;


    private String autopayMethod;

    public Bill(String name, int amount, int dueDate, boolean autopay, String autopayMethod) {
        this.name = name;
        this.amount = amount;
        this.dueDate = dueDate;
        this.autopay = autopay;
        this.autopayMethod = autopayMethod;
    }

    public Bill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isAutopay() {
        return autopay;
    }

    public void setAutopay(boolean autopay) {
        this.autopay = autopay;
    }

    public String getAutopayMethod() {
        return autopayMethod;
    }

    public void setAutopayMethod(String autopayMethod) {
        this.autopayMethod = autopayMethod;
    }
}
