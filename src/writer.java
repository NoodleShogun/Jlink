import javax.swing.*;
import java.awt.*;
import java.io.*;

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

    public void saveToDocument(String docName, String dir) {

        String docText = getText();

        //try to see if data from Writer class can be saved to the file
        try {

            FileWriter savedFile = new FileWriter(dir + "\\" + docName + ".txt");

            BufferedWriter bufferedWriter = new BufferedWriter(savedFile);

            bufferedWriter.write(docText);

            bufferedWriter.close();

        } catch (IOException ex) {
            //if not print this out V
            System.out.println("Could not save to that location or something fucked up");

        }




    }


    public void loadDocument(String file, String dir) {


        String line;

        try {

            FileReader loadedFile = new FileReader(dir + "\\" + file + ".txt");

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




