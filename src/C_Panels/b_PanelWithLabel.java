package C_Panels;

import javax.swing.*;
import java.awt.*;

public class b_PanelWithLabel {
    public static void main(String[] args) {
        // JPanel is a gui that function as a container to hold other components
        ImageIcon icon = new ImageIcon("C:\\Users\\mecha\\IdeaProjects\\Java GUI\\src\\A_JFrame\\Image\\india_png.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.CYAN);
        greenPanel.setBounds(250,0,250,250);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);   // main page is empty for the method
        frame.setSize(750,750);
        frame.setVisible(true);
//       frame.add(label);
        redPanel.add(label);
        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);
    }
}
