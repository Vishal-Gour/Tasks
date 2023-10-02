import java.util.Scanner;

public class PanagramCheck {

	public static boolean isPangram(String str) {
		// Convert the string to lowercase to handle both cases
		str = str.toLowerCase();

		// Create a boolean array to mark the presence of each letter
		boolean[] alphabet = new boolean[26];

		// Iterate through the characters of the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('a' <= ch && ch <= 'z') {
				alphabet[ch - 'a'] = true;
			}
		}

		// Check if all letters have been marked
		for (boolean b : alphabet) {
			if (!b) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String testString =scan.nextLine();
		boolean result = isPangram(testString);

		if (result) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}



}
