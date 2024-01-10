import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Temp\\mojedane.txt");
        }catch (FileNotFoundException e){
            System.out.println("Błąd dostępu do pliku: "  + e);
            System.exit(1);
        }
    }
}
