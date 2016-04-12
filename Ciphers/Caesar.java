public class Caesar {
	public static void main(String args[]){
		String message = args[0]; 
		//Message that is going to be encrypted
		
		int shift = Integer.parseInt(args[1]); 
		//amount you want to shift by
		
		System.out.println(enc(message, shift)); 
		//encrpyted message 
	}

	public static String enc(String message, int shift) {
		String result = "";
		char letters[] = message.toCharArray();
		
		//for loop is used to allow the functions to run until the end of the message that you want to encrypt
		for (int j = 0; j < letters.length; j++) {
			int lettersNum = (int) letters[j];
			
			//if statement runs to check if the integers that correspond to the lowercase 
			if (lettersNum >= 97 && lettersNum <= 122) {
				int newLetter = lettersNum + shift;
				
				/*while loop takes into account that if the shift value raises newLetter above 122 it will subtact 26 and add 10. 
				it will continue to subtact 26 and add 10 until the newLetter is within 97 and 122, aka a and z*/
				while (newLetter > 122) {
					 newLetter = newLetter - 26;
				}
				
				result = result + (char) newLetter;	
			}
			


				/*else if runs exactly the same but is for uppercase letters. 
				there is also a while loop to keep integers within 65 and 90, aka A and Z*/
				else if (lettersNum >= 65 && lettersNum <= 90) {
					int newLetter = lettersNum + shift; 
					 
						while (newLetter > 90) {
							newLetter = newLetter - 26;
							 

						}
					//takes the number, converts it back into a char, and sticks it into the result string at the beginning of the function
					result = result + (char)newLetter; 
				}
				

				//takes into account of spaces in the message and will print a space in the encrypted message
				else if (lettersNum == 32) {
					int newLetter = lettersNum;
					result = result + (char) newLetter;

				}
		
		}
		//after for loop is completed, you will now have a fully encrypted message that can be called upon in your main function
		return result;

	}
}

	
		

				
		