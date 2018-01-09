package grep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grep{

    public static void go(String arg,List<String> flags,List<BufferedReader> fileReaders){
        List<List<String>> a = fileReaders.stream().map(br->br.lines().filter(line->line.contains(arg)).
                collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(a);
    }


}
