import javax.swing.*;
import java.awt.*;

public class toolBar extends JPanel {

    toolBar() {

        setBackground(Color.black);
        setForeground(Color.white);
        setPreferredSize(new Dimension(850, 25));
        setLayout(new GridLayout(850, 1));


    }

    public JButton save, load;


}
