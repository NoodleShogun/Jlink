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
        String docText = paramString();

        try {

            File savedFile = new File(docName, dir);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(savedFile));

            bufferedWriter.write(docText);

            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println("Could not save to that loaction or something fucked up");

        }




    }


    public void loadDocument(String file, String dir) {


        String line;

        try {

            File loadedFile = new File(file, dir);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(loadedFile));

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




