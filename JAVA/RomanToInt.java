import java.util.*;

public class RomanToInt {


	public static int romanToInt(String s) {
		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) { // this is for loop for iterate through romans.
			char c = s.charAt(i);
			int currValue = getValue(c);

			if (currValue < prevValue) {
				result -= currValue; 
			} else {
				result += currValue;
			}

			prevValue = currValue;
		}

		return result;
	}

	private static int getValue(char c) { // get valve method return int valve using switch case 
		switch (c) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		String romanNumeral = scan.nextLine();
		
		int intValue = romanToInt(romanNumeral);
		System.out.println("Integer value: " + intValue);
	}


}