import java.util.Scanner;

public class HitchhikersGuideRemixUsingRegex {

	public static void main(String[] args) {
		displayIntro();

		Scanner input = new Scanner(System.in);
		System.out.println(">");
		String userinput = input.nextLine();

		if (userinput.equalsIgnoreCase("Turn on the light")){
			describeBedroom();
		} else if (userinput.equalsIgnoreCase("Get out of bed")) {
			
		} else {
			System.out.println("I dont know what " + userinput + " means.");
		}
		input.close();
	}
	
	private static void describeBedroom(){
		System.out.print("Good start to the day.");
		System.out.print("Pity it's going to be the worst one of your life.");
		System.out.println("The light is now on.");
		System.out.println("");
		System.out.println("Bedroom, in the bed");
		System.out.println("The bedroom is a mess.");
		System.out.println("It is a small bedroom with a faded carpet and old wallpaper. "
				+"There is a washbasin, a chair with a tatty dressing gown slung over it,"
				+"and a window with the curtains drawn. Near the exit leading south is a phone.");
		System.out.println("There is a flathead screwdriver here. (outside the bed)");
		System.out.println("There is a toothbrush here. (outside the bed)");
	}

	private static void displayIntro() {
		System.out.println("THE HITCHHIKER'S GUIDE TO THE GALAXY");
		System.out.println("Infocom interactive fiction - a science fiction story");
		System.out.println("Copyright (c) 1984 by Infocom, Inc. All rights reserved.");
		System.out.println("Release 59 / Serial number 851108");
		System.out.println("");
		System.out.println("You wake up. The room is spinning very gently round your head.");
		System.out.println("Or at least it would be if you could see it which you can't.");
		System.out.println("");
		System.out.println("It is pitch black.");
	}

}
