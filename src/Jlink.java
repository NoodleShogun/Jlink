import javax.swing.*;
import java.awt.Dimension;


public class Jlink {


    public static void main(String[] args){

    System.out.println("Program Started");

    //sets up frame Params
    JFrame frame = new JFrame();
    Gui panel = new Gui();

    frame.setTitle("JLink");
    frame.setPreferredSize(new Dimension(850, 450));
    frame.setMinimumSize(new Dimension(950, 540));
    //add objects here

    frame.add(panel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    }








}
