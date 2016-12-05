package optionalClass;

import java.util.Optional;

/**
 * @see "https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html"
 */
public class OptionalClass {
    public static void main(String args[]){
        OptionalClass optionalClass = new OptionalClass();
        optionalClass.init();
    }

    public void init(){
        Integer nullInteger = null;
        Integer notNullInteger = 10;

        Optional<Integer> nullOptional = Optional.ofNullable(nullInteger);
        Optional<Integer> notNullOptional = Optional.of(notNullInteger);
         System.out.println(sum(nullOptional, notNullOptional));
    }

    public int sum(Optional<Integer> opt1, Optional<Integer> opt2){
        System.out.println("First parameter is present: " + opt1.isPresent());
        System.out.println("Second parameter is present: " + opt2.isPresent());

        Integer int1 = opt1.orElse(0);
        Integer int2 = opt2.get();

        return int1 + int2;
    }
}
