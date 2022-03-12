import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class ABCReader {
    static List<String> Lines;
    static List<String> Accounts;
    static List<String> Password;
    static String Filename = System.getProperty("user.dir") + "/";
    public void Read(String path) throws IOException{
        String filename = Filename + path;
        Lines = 
        Files.readAllLines(Paths.get(filename),
             StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws IOException {
        new ABCReader().Read("123.txt");
        new ABCReader().Edit(":");
        for (String tmp : Lines) {
            System.out.println(tmp);
        }
    }
    public void Split(String sign){
        Edit(sign);
        int size = Lines.size();
        for (String content : Lines) {
            String[] array = content.split(sign);
            Accounts.add(array[0]);
            Password.add(array[1]);
        }
    }
    public void Edit(String sign){
        int size = Lines.size();
        for (int i = 0; i < size; i++) {
            String content = Lines.get(i);
            if (content.indexOf(sign) == -1) {
                Lines.remove(i);
            }
                

        }
    }
}
