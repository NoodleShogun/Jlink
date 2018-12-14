import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

      JButton save = new JButton("save");
      JButton load = new JButton("load");

 //set component object properties


      hotBar.setBackground(Color.white);
      hotBar.setForeground(Color.white);
      hotBar.setPreferredSize(new Dimension(850, 25));
      hotBar.setLayout(new GridLayout(1, 16));

      textArea.setBackground(Color.white);
      textArea.setForeground(Color.white);
      textArea.setPreferredSize(new Dimension(850, 500));

      scroller.setPreferredSize(new Dimension(930, 467));

      //add objects to Panel
      add(hotBar, BorderLayout.NORTH);
      add(textArea, BorderLayout.CENTER);

      //adds stuff to Objects
      textArea.add(scroller);
      hotBar.add(save);
      hotBar.add(load);

      save.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("Saving File");

              writer.saveToDocument("Untitled", "C:\\Users\\longl\\Documents");

          }
      });

      load.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("Loading File");

              writer.loadDocument("Untitled", "C:\\Users\\longl\\Documents");
          }
      });


 }



}
