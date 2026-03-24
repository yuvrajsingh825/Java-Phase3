import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello Yuvraj!");
            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}