package A_JFrame;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("my first Gui");  // sets title of frame
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);  // exit out of the application
        this.setResizable(false);  // prevent frame from being resized
        this.setSize(450,450);  // set the x-direction and y-direction of frame
        this.setVisible(true);  // make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\mecha\\IdeaProjects\\Java GUI\\src\\A_Frame\\Image\\india_png.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame

        this.getContentPane().setBackground(Color.magenta);
    }
}
