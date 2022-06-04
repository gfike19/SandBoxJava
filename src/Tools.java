import java.time.LocalDate;
import java.util.List;

public abstract class Tools {

    public static List<Bill> sortBillsByDate(List<Bill> bills, int month, int year) {
        int length = bills.size();
        boolean isSorted = false;

        while (isSorted == false) {
            int numberofSwaps = 0;
            for(int i = 0; i < length -1; i++) {
                LocalDate date1 = LocalDate.of(year, month, bills.get(i).getDueDate());
                LocalDate date2 = LocalDate.of(year, month, bills.get(i + 1).getDueDate());

                if(date1.isAfter(date2)) {
                    Bill temp = bills.get(i + 1);
                    bills.remove(temp);
                    bills.add(i + 1, bills.get(i));
                    bills.remove(bills.get(i));
                    bills.add(i, temp);
                    numberofSwaps ++;
                }
            }
            if (numberofSwaps == 0) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        return bills;
    }
}
