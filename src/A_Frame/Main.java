package A_Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("my first Gui");  // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of the application
        frame.setResizable(false);  // prevent frame from being resized
        frame.setSize(450,450);  // set the x-direction and y-direction of frame
        frame.setVisible(true);  // make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\mecha\\IdeaProjects\\Java GUI\\src\\A_Frame\\Image\\india_png.jpg"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame

        frame.getContentPane().setBackground(Color.green);
        frame.getContentPane().setBackground(new Color(123,50,250));

    }
}
