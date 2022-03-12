import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends ABCReader{
    static String Title = """
                            
                            ____     _____\s
                    /\\     |  _ \\   / ____|
                   /  \\    | |_) | | |    \s
                  / /\\ \\   |  _ <  | |    \s
                 / ____ \\  | |_) | | |____\s
                /_/    \\_\\ |____/   \\_____|
                """;
    static String smile = """
        __\040\040
        _  \\ \\\040
       (_)  | |
            | |
        _   | |
       (_)  | |
           /_/\040
            """;
    public static void main(String[] args) throws IOException {
        System.out.println(Title);
        System.out.println("_>>>[EditCombo]<<<_");
        System.out.println("(*.txt)");
        System.out.print("->>>");
        try (Scanner scanner = new Scanner(System.in)) {
            String path = scanner.next();
            ABCReader abcReader = new ABCReader();
            abcReader.Read(path);
            System.out.println("\n(\":\")");
            System.out.print("->>>");
            String sign = scanner.next();
            abcReader.Edit(sign);
            File file = new File(ABCReader.Filename + "/" + "Edited.txt");
            boolean newFile = file.createNewFile();
            try (FileWriter fr = new FileWriter(file)) {
                for (String tmp : ABCReader.Lines) {
                    fr.write(tmp + "\n");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(smile);
        
        
    }
}
