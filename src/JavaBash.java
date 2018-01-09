import grep.Grep;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class JavaBash {


    static void command(String args[]){
        String command = args[0];
        ArrayList<ArrayList<String>> splittedCommand = ParseCommand.splitCommandOneArg(args);
        switch (command){
            case "grep":
                List<BufferedReader> bufferedReaders = VerifiyCommand.VerifyFiles(splittedCommand.get(2));
                if(bufferedReaders.stream().allMatch(br->br.equals(null))){
                   break;
                }
                Grep.go(splittedCommand.get(0).get(0),splittedCommand.get(1),bufferedReaders);
                break;


        }

    }

    public static void main(String[] args) {
        String command[] = new String[]{"grep","i","src/grep/testFile1.txt","src/grep/testFile2.txt"};
        command(command);
    }
}
