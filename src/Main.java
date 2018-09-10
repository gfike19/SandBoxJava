import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an item: ");
		String userInput = input.nextLine();
		input.close();
		String plu = createPlu(userInput);
		System.out.println("The plu that was generated was: " + plu);
	}
	public static String createPlu (String input) {
		String plu = "";
		
		while (plu.length() < 12) {
			
			for (int i = 0; i < input.length(); i++) {
				int temp = (int)input.charAt(i);
				plu += temp;
			}
		}
		
		return plu;
	}

}
