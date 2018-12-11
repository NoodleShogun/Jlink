import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;


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

    public static void saveToDocument(String docName) {



    }

    public static void saveToDocument(Document doc) {


    }


    public void loadDocument(String file) {


        String line = null;

        try {

            FileReader loadedFile = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(loadedFile);

            while ((line = bufferedReader.readLine()) != null) {

                append(line);

            }

            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            file + "'");

        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + file + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


    }

    }




