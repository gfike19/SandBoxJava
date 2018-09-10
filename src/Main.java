import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an item: ");
		String userInput = input.nextLine();
		input.close();
		
		String plu = createPlu(userInput);
		System.out.println("The plu that was generated was: " + plu);
		System.out.print("PLU length is: " + plu.length());
	}
	public static String createPlu (String input) {
		String plu = "";
					
			for (int i = 0; i < input.length(); i++) {
				int temp = (int)input.charAt(i);
				if (plu.length() < 12) {
					plu += temp;
				}
			}
			
			if (plu.length() > 12) {
				plu = plu.substring(0, 12);
			}
		
		return plu;
	}

}
