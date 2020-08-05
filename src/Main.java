import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 3 - fizz
        // 5 - buzz
        // 3 and 5 - fizzbuzz
        // neither i

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++) {
            String disp = "";
            if(i % 3 == 0) {
                disp += "fizz";
            }
            if(i % 5 == 0) {
                disp += "buzz";
            }

            if(i % 5 != 0 && i % 3 != 0){
                disp += i;
            }
            System.out.println(disp);
        }
        }
    }



