import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.io.File;


class writer extends JTextArea {

    writer(int row, int col) {
        setWrapStyleWord(true);
        setLineWrap(true);

        setColumns(col);
        setRows(row);
        setEnabled(true);
        setPreferredSize(new Dimension(930, 467));
        setLineWrap(true);




    }

    public void saveToDocument(String docName) {


    }

    public void saveToDocument(Document doc) {


    }


    public void loadDocument(File file) {


    }



}
