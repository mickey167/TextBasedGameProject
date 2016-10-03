import java.util.Scanner;

public class Adventure1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String Go, Look, Pantry, Eat;

		System.out.println(" WELCOME TO MY TINY ADVENTURE");
		System.out.println("  ");
		System.out
		.println(" You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'? ");
		
		Go = getInput(keyboard);
		
		if (Go.equalsIgnoreCase("kitchen")) {
			System.out
			.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");
		}
		Look = getInput(keyboard);

		if (Look.equalsIgnoreCase("refrigerator")) {
			System.out
			.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");
		} else if (Look.equalsIgnoreCase("pantry")) {
			System.out
			.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");
			Pantry = getInput(keyboard);

			if (Pantry.equalsIgnoreCase("fight")) {
				System.out.println("  ");
				System.out.println("You're weak and die");
			}

			else if (Pantry.equalsIgnoreCase("run away")) {
				System.out.println("  ");
				System.out
				.println("You died because your too slow & can't run");
			}
		}
		Eat  = getInput(keyboard);

		if (Eat.equalsIgnoreCase("Yes")) {
			System.out.println("  ");
			System.out.println("You live!");
		}

		else if (Eat.equalsIgnoreCase("No")) {
			System.out.println("  ");
			System.out.println("You die of starvation!");
		}
		keyboard.close();
	}
	public static String getInput(Scanner scnr){
		System.out.print("> ");
		return scnr.nextLine();
	}


}