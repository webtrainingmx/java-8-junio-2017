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

        MathOperation division = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a / b ;
            }
        };


        System.out.println("10 + 5 = " + addition.operation(10,5) );
        System.out.println("10 - 5 = " + subtraction.operation(10,5));
        System.out.println("10 x 5 = " + multiplication.operation(10, 5));
        System.out.println("10 / 5 = " + division.operation(10, 5));
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
