import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(2);
//        a.add(1);
//
//        List<Integer> b = new ArrayList<>();
//        b.add(2);
//        b.add(3);
//        b.add(1);
//        System.out.println(compareScores(a, b));

        
    }

    public static List<Integer> compareScores(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);

        for (int i = 0; i < 3; i++) {
            int aNum = a.get(i);
            System.out.println("aNum is: " + aNum);

            int bNum = b.get(i);
            System.out.println("bNum is: " + bNum);

            if(aNum > bNum) {
                int currentVal = result.get(0);
                System.out.println("Alice currently has: " + currentVal);
                result.set(0, currentVal+ 1);
            }

            if(aNum < bNum) {
                int currentVal = result.get(1);
                System.out.println("Bob currently has: " + currentVal);
                result.set(1, currentVal+ 1);
            }

        }
        return result;
    }

}



