import java.io.*;

public class ReaderWriterExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("output.txt");
                Reader reader = new FileReader("output.txt");

            String data = "Hello, this is an example of Java Reader and Writer.";
            writer.write(data);

            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
