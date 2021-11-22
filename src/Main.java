/**
 * This class implements the Brick Breaker game following the onlihe tutorial
 *
 * @author Paul Pauca
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("LEZGOOOOOOOOO IT WORKEDDDD");
        obj.setResizable(false);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        obj.setVisible(true);   // This line should be listed after adding the gameplay object

        System.out.println("Never gonna give you up, never gonna let you down, never gonna turn around and desert you");
    }
}
