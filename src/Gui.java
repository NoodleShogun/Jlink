import javax.swing.*;
import java.awt.*;


class Gui extends JPanel {


    Gui() {
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

      writer writer = new writer(150, 150);
      JScrollPane scroller = new JScrollPane(writer);


 //set component object properties
 hotBar.setBackground(Color.black);
 hotBar.setForeground(Color.white);
 hotBar.setPreferredSize(new Dimension(850, 25));
      hotBar.setLayout(new GridLayout(850, 1));

 textArea.setBackground(Color.white);
 textArea.setForeground(Color.white);
      textArea.setPreferredSize(new Dimension(850, 500));

      scroller.setPreferredSize(new Dimension(930, 467));

      //add objects to Panel
      add(hotBar, BorderLayout.NORTH);
      add(textArea, BorderLayout.CENTER);

      //adds stuff to Objects
      textArea.add(scroller);








 }



}
