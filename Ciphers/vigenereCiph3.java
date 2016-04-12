
//Same basic functionality as the Caesar cipher, but tweaked so you can pass a code word to encrypt your message

public class vigenereCiph3 {
	public static void main(String args[]){
		String message = args[0];
		
		//code word that will be used to encrypt your message 
		String shift = args[1];
		
		System.out.println(enc(message, shift));
	}

	public static String enc(String message, String shift) {
		String result = "";
		char letters[] = message.toCharArray();
		char passcode[] = shift.toCharArray();
		for (int j = 0, k = 0; j < letters.length; j++) {
			
			//defining k in this way will allow k to loop back to 0 after it reaches the maximum length of the code word.
			k = j % shift.length();
			
			int lettersNum = (int) letters[j];
			int shiftNum = (int) passcode[k];
			
			/*take each ascii value in the code word and subtract 96, which will give it its shift value . so "a" with
			an ascii value of 97, will have a shift value of 1. */
			int n = shiftNum - 96; 
			
			if (lettersNum >= 97 && lettersNum <= 122) {
				int newLetter = lettersNum + n;
				while (newLetter > 122) {
					 newLetter = newLetter - 26;
				}
				result = result + (char) newLetter;	
			}
			


				else if (lettersNum >= 65 && lettersNum <= 90) {
					int newLetter = lettersNum + n; 
					 
						while (newLetter > 90) {
							newLetter = newLetter - 26;
							 

						}
					result = result + (char)newLetter; 
				}
				

				else if (lettersNum == 32) {
					int newLetter = lettersNum;
					result = result + (char) newLetter;

				}
		
		}
		return result;

	}
}
	