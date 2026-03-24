import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("test.txt");
            int data;

            while((data = reader.read()) != -1){
                System.out.print((char)data);
            }

            reader.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}