package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @see "https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html"
 */
public class PrintNumbers {
    public static void main(String args[]){
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.init();
    }

    public void init(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Print all numbers:");
        eval(list, n->true);

        System.out.println("Print even numbers:");
        eval(list, n-> n%2 == 0 );

        System.out.println("Print numbers greater than 3:");
        eval(list, n-> n > 3 );
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

}
