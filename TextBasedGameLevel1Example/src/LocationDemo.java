import java.util.*;
import java.applet.*;
import java.awt.*;

//
//
// LocationDemo - Demonstrates the use of location/exit objects
//
// Last modification date : October 08, 1997
//
public class LocationDemo extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Location currentLocation;
	String command;

	TextField commandInput;
	TextArea  displayOutput;
	Button    buttonInput;

	// Constructor
	public LocationDemo()
	{
		super();
	}

	// Initialisation method
	public void init()
	{	
		/*****************************************************************************/
		/**You should not edit anything here unless you really know what you are doing*/
		super.init();

		// Define colours
		setBackground(Color.white);
		setForeground(Color.black);

		Panel appletPanel = new Panel();

		// Use a border layout
		BorderLayout b = new BorderLayout();
		appletPanel.setLayout (b);
		add(appletPanel);
		
		// Define UI items
		commandInput  = new TextField(20);
		displayOutput = new TextArea( 10, 60); // 10 rows x 60 chars
		buttonInput   = new Button("Go");
		Panel inputPanel = new Panel();
		/*****************************************************************************/
		/*****************************************************************************/
		
		/*You can edit this to add things to the panel********************************/
		// Add components to our layout / panels
		inputPanel.add(commandInput);
		inputPanel.add(buttonInput);
		appletPanel.add("North", displayOutput);
		appletPanel.add("South", inputPanel);

		// Create 3 locations
		//Use similar code to generate rooms
		Location l1 = new Location ("Entrance to hall", "You stand at the entrance of a long hallway. The hallway gets darker\nand darker, and you cannot see what lies beyond. To the east\nis an old oaken door, unlocked and beckonning");
		Location l2 = new Location ("End of hall", "You have reached the end of a long dark hallway. You can\nsee nowhere to go but back");
		Location l3 = new Location ("Small study", "This is a small and cluttered study, containing a desk covered with\npapers. Though they no doubt are of some importance,\nyou cannot read their writing");

		//TODO Use similar code to add exits to each location
		// Create an exit for l1
		l1.addExit (new Exit(Exit.NORTH, l2));//l1 has an exit to the North that leads to l2
		l1.addExit (new Exit(Exit.EAST, l3));//l1 has an exit to the East that leads to l3

		// Create an exit for l2
		l2.addExit (new Exit(Exit.SOUTH, l1));

		// Create an exit for l3
		l3.addExit (new Exit(Exit.WEST, l1));

		// Set up starting room locations
		currentLocation = l1;

		// Show first location
		showLocation();
		repaint();
	}

	/**
	 * Method displays title, description, and possible exits from a location.
	 * You may want to set up some other data member and getters/setters 
	 * in your location class to hold further information (eg. list of items to 
	 * pick up, other things you can do.
	 */
	private void showLocation()
	{
		// Show room title
		displayOutput.append( "\n" + currentLocation.getTitle() + "\n" );
		displayOutput.append( "\n" );
		
		// Show room description 
		displayOutput.append( currentLocation.getDescription() + "\n" );

		// Show available exits
		displayOutput.append( "\nAvailable exits : \n" );
		for (Enumeration<Exit> e = currentLocation.getExits().elements(); e.hasMoreElements();)
		{
			Exit an_exit = (Exit) e.nextElement();
			displayOutput.append(an_exit + "\n");
		}		
		
	}

	/**
	 * Method reads user input and calls the showLocation method
	 * to display the new rooms information.
	 * 
	 * You will likely make a lot of changes here.
	 */
	public boolean action (Event evt, Object focus)
	{
		String command;

		// Was a button pressed ? 
		if (evt.target instanceof Button)
		{
			// Obtain user input
			command = commandInput.getText(); //Whatever direction or command the user gave

			//If you user submits without typing then do nothing
			// Don't parse blank commands
			if (command.length() == 0)
				return true;

			// Convert to uppercase for comparison
			command = command.toUpperCase();

			// Search for an exit match
			for (Enumeration<Exit> e = currentLocation.getExits().elements(); e.hasMoreElements();)
			{
				Exit an_exit = (Exit) e.nextElement();

				if ( (an_exit.getDirectionName().compareTo(command) == 0) ||
					 (an_exit.getShortDirectionName().compareTo(command) == 0 )
				   )
				{
					// Set location to the location pointed to by exit
					currentLocation = an_exit.getLeadsTo();

					// Show new location description
					showLocation();
					/*TODO
					 * If you plan to do other things when the user enters 
					 * commands, around here might be a good place to start.
					 */

					// Clear text area
					commandInput.setText (new String());

					// Event handled
					return true;
				}				
			}

			// If code reaches here, direction is invalid
			displayOutput.append("\nHuh? Invalid direction!\n");

			// Clear text area
			commandInput.setText (new String());

			// Event handled
			return true;
		}
		// Event not handled
		else return false;
	}

}

