import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by KPS on 8/7/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        try(FileWriter writer = new FileWriter(path , true);
            BufferedWriter writer1 = new BufferedWriter(writer)){
          writer1.write("\t\nhello ");
        } catch (IOException e1) {
            e1.printStackTrace();

        }
    }
}
