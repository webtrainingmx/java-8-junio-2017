package methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html">method reference</a>
 */
public class MethodReference {
    public static void main(String args[]){
        MethodReference methodReference = new MethodReference();
        methodReference.init();
    }

    public void init() {
        List<String> numberNames = Arrays.asList("one", "two","three","four","five");
        numberNames.forEach(System.out::println);
    }

}
