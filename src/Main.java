import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // defines an empty ArrayList of the type HashMap whose keys are ints and its values are Strings
        ArrayList<HashMap<Integer, String>> listOfThings = new ArrayList<HashMap<Integer, String>>();

        // this is a Java list
        String [] animals = {"lion", "wolf", "dragon", "deer", "eagle", "squid", "fish"};

        // looping to make add content to listOfThings
        for(int i = 0; i < 7; i++) {
            HashMap<Integer, String> temp = new HashMap<>();
            temp.put(i, animals[i]);
            listOfThings.add(temp);
        }

        String king = "";
        // Java is very picky, we have to tell it what exactly we're looping over
        for(HashMap<Integer, String> hm : listOfThings) {
            for(Map.Entry<Integer, String> entry : hm.entrySet()) {
                // examples of if
                if (entry.getValue() == "lion") {
                    king += "ROAR!";
                }
                }
            }
        }
    }



