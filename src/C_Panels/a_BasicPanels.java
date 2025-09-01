package C_Panels;

import javax.swing.*;
import java.awt.Color;

public class a_BasicPanels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);   // main page is empty for the method
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
    }
}
