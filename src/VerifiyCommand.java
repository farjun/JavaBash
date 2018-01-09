import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VerifiyCommand {

    static List<BufferedReader> VerifyFiles(ArrayList<String> filePaths) {

        return filePaths.stream().map(s -> {
            try {
                return new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                System.err.println("error could not find file " + s);
            }
            return null;
        }).collect(Collectors.toList());

    }
}
