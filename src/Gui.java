import javax.swing.*;
import java.awt.*;


public class Gui extends JPanel {


    public Gui(){
  //creates components to add the the class Panel
createComp();


 }


 //creates the components and adds them to the main panel
  private void createComp(){
  BorderLayout border = new BorderLayout(2, 2);
  setBackground(new Color(96, 98,81));
  setLayout(border);




  //create Component objects
 JPanel hotBar = new JPanel();
 JPanel textArea = new JPanel();
 JTextArea textAreaWriter = new JTextArea();

 //set component object properties
 hotBar.setBackground(Color.black);
 hotBar.setForeground(Color.white);
 hotBar.setPreferredSize(new Dimension(850, 25));

 textArea.setBackground(Color.white);
 textArea.setForeground(Color.white);
 textArea.setPreferredSize(new Dimension(850, 415));

 textAreaWriter.setEnabled(true);
 textAreaWriter.setPreferredSize(new Dimension(850, 415));
 textAreaWriter.

 //add objects to Panels





 add(hotBar, border.NORTH);
 add(textArea,border.CENTER);








 }



}
