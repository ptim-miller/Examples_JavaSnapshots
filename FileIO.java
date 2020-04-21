// All rights reserved (c) 2020 P. Tim Miller
// For academic use only


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        try {
            inFile = new FileInputStream("input.txt");
            outFile = new FileOutputStream("output.txt");

            int ch;

            while((ch = inFile.read()) != -1) {
                if(ch != 'u') {
                    outFile.write(ch);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inFile.close();
                outFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
