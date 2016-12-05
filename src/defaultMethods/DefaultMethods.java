package defaultMethods;

/**
 * @see "http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html"
 */
public class DefaultMethods {
    public static void main(String args[]){
        DefaultMethods defaultMethods = new DefaultMethods();
        defaultMethods.init();
    }

    public void init(){
        Valkyrie valkyrie = new Valkyrie();
        valkyrie.print();

        Civic civic = new Civic();
        civic.print();
        civic.printCarModel();
    }

    class Civic implements Honda{
        public void printCarModel(){
            System.out.println("I'm a civic");
        }
    }

    class Valkyrie implements Honda,Motorcycle{

        @Override
        public void print() {
            Motorcycle.super.print();
            Honda.super.print();
            System.out.println("I'm a valkyrie");
        }
    }
}
