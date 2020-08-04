import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        vowel_count();
        }

        public static int vowel_count () {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter some text with vowels: ");
            String str = userInput.nextLine();
            int count = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
               str.charAt(i) == 'u' ){
                    count++;
                }
            }
            System.out.println("You're chosen word " + str + " has " + count +" vowels");
            return count;
        }
    }



