import java.util.*;
public class GamePlayer {

	private static Room currentLocation;
	public static void main(String[] args) {
		/*
		 * Build the map
		 */
		Room foyer = new Room("Foyer", "A large area with marble flooring "
				+"and a wide staircase leading up for as far as you can see.  To the left there is a small"
				+ " wooden door.");
		Room hallway = new Room("Hallway", "Normal looking space.  There is a wierd tapestry on the far wall."
				+"It almost looks like a dinosaur winking?");
		Room secret1 = new Room("Secret Room 1", "Behind the tapestry you have found a hidden room.  The air is filled with a strange"
				+ " purpleish haze in the distance, and you can smell pepermint.");
		Room kitchen = new Room("Kitchen", "What did you come in here for?  There are no snacks for humans.");
		
		/*
		 *Add some doors so you can move between rooms. 
		 */
		foyer.addDoor(new Door("staircase", hallway));
		foyer.addDoor(new Door("left", kitchen));
		
		kitchen.addDoor(new Door("back", foyer));
		
		hallway.addDoor(new Door("tapestry", secret1));
		
		/*
		 * Setup initial game play
		 */
		Scanner userinput = new Scanner(System.in);
		System.out.println("You are standing in the foyer of a great castle.");
		currentLocation = foyer;
		System.out.println(foyer.getDescription());
		String answer = userinput.next();
		answer.toUpperCase();
		if (answer.equalsIgnoreCase("go")){
			System.out.print("You are going...");
			answer = userinput.nextLine();
			System.out.println(answer);
			//if (answer.equalsIgnoreCase(anotherString))
		}
		
	}

}
