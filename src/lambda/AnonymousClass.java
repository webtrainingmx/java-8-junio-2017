package lambda;

/**
 *
 */
public class AnonymousClass {
    public static void main(String[] args){
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.init();
    }

    public void init(){
        MathOperation addition = new Addition();
        MathOperation subtraction = new Subtraction();

        MathOperation multiplication = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        };


        System.out.println("10 + 5 = " + operate(10, 5, addition ) );
        System.out.println("10 - 5 = " + operate(10, 5, subtraction ));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication ));
        System.out.println("10 / 5 = " + operate(10, 5, new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a / b ;
            }
        }));
    }

    public int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }



    interface MathOperation {
        int operation(int a, int b);
    }

    class Addition implements MathOperation{

        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }

    class Subtraction implements MathOperation{

        @Override
        public int operation(int a, int b) {
            return a - b;
        }
    }

}
