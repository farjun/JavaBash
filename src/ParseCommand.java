import java.util.ArrayList;

public class ParseCommand {

    static void chooseCommandFunction() {

    }

    static ArrayList<ArrayList<String>> splitCommandOneArg(String args[]) {
        ArrayList<String> arguments = new ArrayList<>();
        ArrayList<String> flags = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();

        int i = 1;
        arguments.add(args[i]);
        i++;

        while (args[i].startsWith("-")) {
            flags.add(args[i]);
            i++;
        }

        while (i < args.length) {
            files.add(args[i]);
            i++;
        }

        ArrayList<ArrayList<String>> out = new ArrayList<>();
        out.add(arguments);
        out.add(flags);
        out.add(files);
        return out;
    }

}
