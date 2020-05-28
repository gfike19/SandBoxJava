import java.util.*;

public class Main {

    public static void main(String[] args) {
        String [] signs = new String [] {"ram", "bull", "twins", "crab", "lion",
        "maiden", "scales", "scorpion", "centaur", "goat", "server", "two fishes"};

        String [] signs2 = new String [] {"rat", "ox", "tiger", "rabbit", "dragon",
        "horse", "goat", "monkey", "rooster", "dog", "pig"};

        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(" i = " + i + " and j = " + j);
                System.out.println(signs[j]);
                System.out.println(signs2[i]);
            }
        }

        List<String> signsArrayList = Arrays.asList(signs);

//        for(String s : signsArrayList){
//            for(String t :signs2){
//                System.out.println(s);
//                System.out.println(t);
//            }
//        }
        }
    }



