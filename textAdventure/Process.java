import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Process {
	
	private String action;
	private String secondWord;
	public static final String commandWords[] = {"go" , "examine" , "take" , "drop" , "use" , "look", "quit"};

	public boolean validAction(String action){
		for (int i = 0; i < commandWords.length; i++){
			if(commandWords[i].equals(action))
				return true ;
		}
		return false;
		}	

	public Action getCommand(){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word1;
        String word2;
        String yourCommand = " "; 

        System.out.print("What next?: ");

		try {
            yourCommand = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("Can't process this command. Please try something else.") ;
        }

       Scanner scanner = new Scanner(yourCommand);

        if(scanner.hasNext())
            word1 = scanner.next();      
        else
            word1 = null;
        if(scanner.hasNext())
            word2 = scanner.next();      
        else
            word2 = null;

        if(validAction(word1))
            return new Action(word1, word2);
        else
            return new Action(null, word2);
		}

}

