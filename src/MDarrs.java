public class MDarrs {
    public static void main(String [] args) {
        int [] [] test = {{12, 34, 5},
                {1, 4,3},
                {2, 3, 6}};
String [] days = {"mon", "tues", "wed", "Thu", "Fri", "Sat", "Sun"};
String [] times= {"7 am", "3 pm", "7 pm", "3am"};
            System.out.print("\t");
            for(int index = 0; index < days.length; index++) {
                System.out.print(days[index] + "\t");
            }
            System.out.print("\n");
        for(int row = 0; row < 4; row++) {
            System.out.print(times[row] + ": ");
            for(int col = 0; col < 7; col++) {

                System.out.print(test[row][col] + " | ");
            }
            System.out.print("\n");
        }
    }

    //        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                System.out.print("row: " + i + " col: " + j + " | " + test[i][j] + "\n");
//            }
//            System.out.print("\n");
//        }
}
