import java.io.*;

public class Merge2Files {
    public static void main(String[] args) throws IOException {
        Merge2Files merge2Files = new Merge2Files();
        merge2Files.merge2files();
    }
    void merge2files() throws IOException {
        PrintWriter file3 = new PrintWriter("file3.txt");

        BufferedReader file1 = new BufferedReader(new FileReader("file1.txt"));

        String line = file1.readLine();

        while (line != null)
        {
            file3.println(line);
            line = file1.readLine();
        }

        file1 = new BufferedReader(new FileReader("file2.txt"));

        line = file1.readLine();

        while(line != null)
        {
            file3.println(line);
            line = file1.readLine();
        }
        file3.flush();
        file1.close();
        file3.close();

    }

}
