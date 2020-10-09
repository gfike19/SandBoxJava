import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {6, 4, 3};
        int[] arr2 = {1, 5, 9};
        int[] example = zip_arrays(arr1, arr2);
        for (int i : example) {
            System.out.print(i + ", ");
        }
    }

    public static int[] zip_arrays(int[] a, int[] b) {
        int len = a.length;
        int[] zipArr = new int[len];
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            // pull out element from a at i
            // add above to zipArr
            zipArr[counter] = a[i];
            counter++;
            zipArr[counter] = b[i];
            counter++;
            // pull out element from b at i
            // add above to zipArr
        }

        // return an array of type int
        return zipArr;
    }
}



