
public class Door {
	private String name;
	private Room destination;
	
	public Door(){
		name = "Door";
		destination = new Room();
	}
	
	public Door(String name, Room destination){
		this.name = name;
		this.destination = destination;
	}

	/**
	 * Accessor and modifier methods
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getDestination() {
		return destination;
	}

	public void setDestination(Room destination) {
		this.destination = destination;
	}
}
