import java.util.HashMap;
@SuppressWarnings("unchecked")

public class Location{
	
	private HashMap doors;
	private String details;

	public Location(String details){
		doors = new HashMap();
		this.details = details;
	}

	public void setDoors(Location north, Location south, Location east, Location west){
		
		if (north != null)
			doors.put("north", north);
		
		if (south != null)
			doors.put("south", south);
		
		if (east != null)
			doors.put("east", east);
		
		if (west != null)
			doors.put("west", west);
	}

	public String description(){
		return "you're " + details + ".\n";
	}

	public Location enterRoom(String move) {
        return (Location)doors.get(move);
    }
}
