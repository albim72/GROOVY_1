import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String content = "to jet ważna informacja nr 45\nRRRRR435435898594385239";
        String filePath = "C:\\Temp\\VeryIMessage.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write(content);
            System.out.println("dane zostały zapisane do pliku...");
            }catch (IOException e){
            System.out.println("Błąd!");
        }
    }
}
