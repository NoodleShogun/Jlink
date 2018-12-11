import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

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
        String docText = paramString();

        try {

            FileWriter savedFile = new FileWriter(docName);

            BufferedWriter bufferedWriter = new BufferedWriter(savedFile);

            bufferedWriter.write(docText);

            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println("Could not save to that loaction or something fucked up");

        }




    }


    public void loadDocument(String file) {


        String line;

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




