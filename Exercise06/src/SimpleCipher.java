/*
 * Author: Joel Black
 * Date: December 3, 2021,
 * Description: Exercise 6
/*
 * Customer class for SimpleCipher for encoding and decoding user input
 */

public class SimpleCipher {

	// Encoding of string text reverse characters and add 2
	public String encode(String text) {
		// declarations
		String encoded = "";
		// constructor StringBulider to rebuild string
		StringBuilder result = new StringBuilder();

		// convert text into character array
		char ca[] = text.toCharArray();
		// reverse the array using provided method
		ca = this.reverse(ca);

		// add 2 to each element of the array using a for loop
		for (int index = 0; index < ca.length; index++) {
			ca[index] = (char) (ca[index] + 2);
		}

		// convert the character array back to a String named result
		// using StringBuilder
		result.append(ca);
		encoded = result.toString();
		// return encoded
		return encoded;

	}

	// Decoding reverse the characters back and subtract 2
	public String decode(String text) {
		//declarations
		String decoded = "";
		//constructor StringBulider to rebuild string
		StringBuilder result = new StringBuilder();

		// convert text into char array
		char ca[] = text.toCharArray();
		// reverse character array calling given method
		ca = this.reverse(ca);

		// subtract 2 from each element of the array using a for loop
		for (int index = 0; index < ca.length; index++) {
			ca[index] = (char) (ca[index] - 2);
		}

		// convert the character array back to a String named result
		// using StringBuilder
		result.append(ca);
		decoded = result.toString();
		// return the resulting String.
		return decoded;
	}

	/*
	 * Comments that overview the method. Note: This method is already completed.
	 */
	private char[] reverse(char[] original) {
		int length = original.length;
		char[] reversed = new char[length];
		int writeIndex = 0;
		for (int readIndex = length - 1; readIndex >= 0; readIndex--) {
			reversed[writeIndex] = original[readIndex];
			writeIndex++;
		}
		// the readIndex above starts at the last index, and stops at index zero
		// the writeIndex starts at zero, and stops at the last index.
		return reversed;
	}
}