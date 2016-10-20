import java.util.*;
public class Room {
	private String name;
	private String description;
	private ArrayList<Door> doors;
	
	public Room() {
		name = "Room";
		description = "The description of the room is blank.";
		doors = new ArrayList<Door>();
	}
	
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
		doors = new ArrayList<Door>();
	}
	
	/**
	 * Add a new door to the room.
	 */
	public void addDoor(Door dr){
			doors.add(dr);
	}
	
	/**
	 * Accessor and Modifier methods for all
	 * data members
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Door> getDoors() {
		return doors;
	}
}
