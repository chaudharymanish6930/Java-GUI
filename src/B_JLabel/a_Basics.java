package B_JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class a_Basics {
    public static void main(String[] args) {

        // JLabel = a gui display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("C:\\Users\\mecha\\IdeaProjects\\Java GUI\\src\\B_JLabel\\Image\\india_png.jpg");
        Border border = BorderFactory.createLineBorder(Color.blue,4);

        JLabel label = new JLabel();   // create label
        label.setText("Bro, How are you??"); // set text of the label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left right center of image icon
        label.setVerticalTextPosition(JLabel.TOP);   // set text top center bottom of imageicon
        label.setForeground(new Color(0x00ff00));   // set font of the color
        label.setFont(new Font("SansSerif", Font.PLAIN,40));  // set font of the text
        label.setIconTextGap(-22);  // set the gap of text to the image
        label.setBackground(Color.black);   // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);  // create border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text with label
        label.setHorizontalAlignment(JLabel.CENTER);  // set horizontal positon of icon+text with label
//        label.setBounds(100,100,250,250);   set x,y posi within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,550);
//        frame.setLayout(null);  main page is empty for the method
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
