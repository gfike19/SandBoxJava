public class Main {

    public static void main(String[] args) {
        String str = "lorem ipsum";
        reverseString(str);
//        System.out.print(reverseString(str));
    }

    public static String reverseString(String str) {
        String newStr = "";
        // access each character in the string
        // put them in the new string in reverse order
        // for each
        // for int i .  . .
//        for(int i = 0; i < str.length(); i++) {
//            // newStr += str[i] same as newStr = newStr + str[i]
//            System.out.println("new string is currently: " + newStr);
//            System.out.println("string at i is: " + str.charAt(i));
//            newStr = str.charAt(i) + newStr;
//            System.out.println("new string is now: " + newStr + "\n");
//        }

        // other option, start from end of string and add to new that way
        for(int i = str.length() -1; i >= 0; i--){
            System.out.println("new string is currently: " + newStr);
            System.out.println("string at i is: " + str.charAt(i));
            newStr += str.charAt(i);
            System.out.println("new string is now: " + newStr + "\n");
        }
        return newStr;
    }
}



