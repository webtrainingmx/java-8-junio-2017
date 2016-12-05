package defaultMethods;


public interface Motorcycle {
    public default void print(){
        System.out.println("I'm a motorcycle");
    }
}
