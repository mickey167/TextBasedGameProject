import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/* FrameDemo.java requires no other files. */
public class GamePlayer {
	
	private static JFrame frame;
    /**
     * Create the GUI and show it.  
     */
    private static void createAndShowGUI(String gameTitle) {
        //Create and set up the window.
        frame = new JFrame(gameTitle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(900, 500));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void outputToScreen(String output) {
    	JLabel outputLabel = new JLabel(output);
        outputLabel.setPreferredSize(new Dimension(900, 500));
        frame.getContentPane().add(outputLabel, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI("Game title");
            }
        });
        
        outputToScreen("testing output");
    }
}
