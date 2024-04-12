import java.io.*;

public class IOStreamsExample {
    public static void main(String[] args) {
        // Writing to a file using FileOutputStream
        try {
             InputStream readF = new FileInputStream("DEMOFILE.txt");
            OutputStream writeF = new FileOutputStream("OUTPUTFILE.txt") ;
           
       
        // Reading from a file using FileInputStream
            
            int Data;
            while ((Data = readF.read()) != -1) {
                writeF.write(Data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
