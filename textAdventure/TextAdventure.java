import java.util.*; 

public class TextAdventure {
	private Location startingLocation;
	private Process process;

	public static void main(String [] args){
		  TextAdventure game = new TextAdventure();
       		game.initializeGame();
		}

		public TextAdventure() {
        	createLocations();
        	process = new Process();
		}

	  public void initializeGame(){            
        boolean quit = false;

        System.out.println();
        System.out.println("Congrats! it's your first day at UF!");
        System.out.println(startingLocation.description());
        System.out.println();
        
        
        while (!quit){
            Action command = process.getCommand();
            quit = processAction(command);
        }
        System.out.println("Thank's for playing! Good bye.");
    }

	private void createLocations() {

			Location room0, room1, room2, room3, room4, room5, room6, room7, room8, room9, room10;

			room0 = new Location("in your living room. Moves: north, east, west");
			room1 = new Location("in your bedroom. Moves: west");
			room2 = new Location("in your kitchen. Moves: east");
			room3 = new Location("at the bus stop. Moves: north, south");
			room4 = new Location("on campus at the reitz union. Moves: north, south, east, west");
			room5 = new Location("in Turlington plaza. ¡¡¡BEWARE!!! trolls giving out unecessary flyers in the vicinity!!! Moves: west....seriously gtfo and go west");
			room6 = new Location("at the basketball arena. Moves: east");
			room7 = new Location("at the football stadium. Moves: north, south");
			room8 = new Location("across the street from the edge of campus AKA University Ave. Moves: south, east, west");
			room9 = new Location("at Chipotle. Moves: west");
			room10 = new Location("at 101 Cantina. Moves: east");

			room0.setDoors(room3, null, room1, room2);
			room1.setDoors(null, null, null, room0);
			room2.setDoors(null, null, room0, null);
			room3.setDoors(room4, room0, null, null);
			room4.setDoors(room7, room3, room5, room6);
			room5.setDoors(null, null, null, room4);
			room6.setDoors(null, null, room4, null);
			room7.setDoors(room8, room4, null, null);
			room8.setDoors(null, room7, room9, room10);
			room9.setDoors(null, null, null, room8);
			room10.setDoors(null, null, room8, null);

			startingLocation = room0;
			
		}

		private Boolean processAction(Action action) {
        String command =  action.getAction();
        boolean invalid = action.invalidAction();
        
        if(invalid){
          System.out.println("What?");
            return false;
        }

		
		if (command.equals("go")){
			Location enterRoom = startingLocation.enterRoom(action.getSecondWord());

        	if(!action.hasSecondWord()){
            System.out.println("Go where?");
            //return;
        	}

        	if (enterRoom == null)
            System.out.println("You can't go this way");
        	
        	else {

            startingLocation = enterRoom;
            System.out.println(startingLocation.description());
        	}

		}
           
          
        if (command.equals("look"))
        	System.out.println(startingLocation.description());
       
        else if (command.equals("quit")){
            if(action.hasSecondWord())
                return false;
            else
                return true;
        }
        return false;

    }

}