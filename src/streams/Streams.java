package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html">stream</a>
 */
public class Streams {
    public static void main(String args[]){
        Streams streams = new Streams();
        streams.init();
    }
    public void init(){
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        filter();
        collector();
        statistics();
    }

    public void filter(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream()
                .filter(string -> string.isEmpty())
                .count();

        System.out.println( count );
        System.out.println();
    }

    public void collector(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println( filtered );
        System.out.println();
    }

    public void statistics(){
        Random random = new Random();
        List<Integer> integers = random.ints(10,0,100).boxed().collect(Collectors.toList());
        System.out.println(integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
