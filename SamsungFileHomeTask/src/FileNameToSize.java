import java.io.*;

public class FileNameToSize {
    public static void main(String[] args) throws IOException {
        FileNameToSize fileNameToSize = new FileNameToSize();
        fileNameToSize.fileName();
    }

     void fileName() throws IOException {
        try {
            FileReader in = new FileReader("a.txt");
            File in1 = new File("a.txt");
            FileWriter out = new FileWriter(in1.length() + ".txt");


            File out2 = new File("b.text");
            File rename = new File(in1.length() + ".txt");


            out2.renameTo(rename);
            System.out.println(out2.getName());
            //how to rename a file into


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File open error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("File read/write error: " + e.getMessage());
        }
    }
}
