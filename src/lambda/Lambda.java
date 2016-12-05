package lambda;

/**
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html">lambda</a>
 */
public class Lambda {
    public static void main(String[] args){
        Lambda lambda = new Lambda();
        lambda.init();
    }

    public void init(){
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;


        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }



    public interface MathOperation {
        public int operation(int a, int b);
    }

}
