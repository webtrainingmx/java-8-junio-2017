package methodReference;

import java.util.Arrays;
import java.util.List;

public class PrintNumberNames {
    public static void main(String args[]){
        PrintNumberNames printNumberNames = new PrintNumberNames();
        printNumberNames.init();
    }

    public void init() {
        List<String> numberNames = Arrays.asList("one", "two","three","four","five");

        for(String numberName : numberNames){
            System.out.println(numberName);
        }
    }
}
