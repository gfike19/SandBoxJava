public class MDarrs2 {
    public static void main (String [] args) {
        // initalize arrays
        int [] arr1 = {52, 89, 92, 82};
        int [] arr2 = {0, 45, 11, 19};
        int [] arr3 = {46, 45, 14, 31};
        int [] arr4 = {43, 8, 31, 67};

        int [][] md = new int [4][4];
        // call method
        MapToMD(arr1, md, 0);
        MapToMD(arr2, md, 1);
        MapToMD(arr3, md, 2);
        MapToMD(arr4, md, 3);

        // display of md fully filled out

        for(int row = 0; row < 4; row ++) {
            for(int col = 0; col < 4; col++){
                System.out.print(md[row][col] + ", ");
            }
            System.out.print("\n");
        }
    }

    public static void MapToMD(int [] arr, int [][] md, int pos) {
        // go through each number in the regular array
        for(int i = 0; i < arr.length; i++) {
            // use the pos (position) to determine which row to insert the number
            // use i to determine row
            md[pos][i] = arr[i];
        }
    }
}
