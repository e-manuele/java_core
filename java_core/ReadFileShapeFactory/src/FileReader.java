import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    List<String> fileRows;

    public FileReader() {
        fileRows = new ArrayList<>();
    }

    public List<String> readFile(String path) {
        File myObj = new File(path);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                this.fileRows.add(data);
//                System.out.println(data);
            }
            myReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return this.fileRows;
    }
}
