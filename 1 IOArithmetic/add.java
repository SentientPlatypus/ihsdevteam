import java.io.*;

public class add {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.out"));

        int firstnum = Integer.parseInt(reader.readLine());
        int secondnum = Integer.parseInt(reader.readLine());

        writer.write(Integer.toString(firstnum + secondnum));

        reader.close();
        writer.close();
    }
}
