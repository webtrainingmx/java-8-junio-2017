package defaultMethods;


public interface Honda {
    public default void print(){
        System.out.println("I'm a Honda vehicle");
    }
}
