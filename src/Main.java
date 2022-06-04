import java.time.LocalDate;
import java.util.*;

public class Main {
    // LocalDate format = yyyy-MM-DD

    public static void main(String[] args) {
        ArrayList<String> billNames = new ArrayList<>(List.of("Mortgage", "amazon card payment", "paramount",
                "youtube", "fence", "electric", "capital one", "car", " hulu", "internet", "care credit",
                "water trash sewer", "dr", "car ins", "cellphone", "gas", "starbucks", "operation bill"));
        List<Bill> bills = new ArrayList<>();

        while (bills.size() < 10) {
            Random rand = new Random();
            // generate random number and pull bill name from bilNames array
            String name = billNames.get(rand.nextInt(billNames.size()));
            // Bill constructor = (String name, amount, due date, is bill autopay?, autopay method)
            Bill b = new Bill(name, rand.nextInt(200), rand.nextInt(20), rand.nextBoolean(),
                    "joint");
            bills.add(b);
            billNames.remove(name);
        }

        Random rand = new Random();
        int month = rand.nextInt(12);

        System.out.println("Bills Unsorted: ");

        for(Bill b : bills) {
            LocalDate ld = LocalDate.of(2022, month, b.getDueDate());
            System.out.println(String.format("%20s %3s %10s", b.getName(), b.getAmount(), ld));
        }
        List<Bill> sortedBills = Tools.sortBillsByDate(bills, month, 2022);
        System.out.println("\nBills Sorted: ");

        for(Bill b : sortedBills) {
            LocalDate ld = LocalDate.of(2022, month, b.getDueDate());
            System.out.println(String.format("%20s %3s %10s", b.getName(), b.getAmount(), ld));
        }

    }

    public static List<Bill> setToList(Set<Bill> bills) {
        List<Bill> billList = new ArrayList<>();

        for(Bill b : bills) {
            billList.add(b);
        }
        return billList;
    }

}



