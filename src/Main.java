import java.io.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        genFile();

        File file = new File("C:\\Users\\aerot\\coding\\SandBoxJava\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while((st = br.readLine()) != null){
            System.out.println(st);

            int num = Integer.parseInt(st);

            /*
            TODO need to figure how to determine prime number condition
             */

            for(int i = 2; i < num - 1; i++) {
                int count = 0;

                if (num / i )
            }
        }
        }

    public static int genRandomNum () {
        int r = 0;
        try {
            SecureRandom srg = new SecureRandom();
            byte[] randomBytes = new byte[128];
            r = srg.nextInt(25);
            return r;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return r;
    }

    public static void genFile () {

        ArrayList<String> arr = new ArrayList<String>();

        for(int i = 0; i < 3; i++) {
            int r = genRandomNum();
            arr.add("" + r);
        }

        try{
            PrintWriter pw = new PrintWriter("text.txt", "UTF-8");

            for(String s : arr){
                pw.write(s + "\n");
            }

            pw.close();

        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }


    }



