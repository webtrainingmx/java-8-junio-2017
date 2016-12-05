package functionalInterfaces;

/**
 * Represents an operation that accepts no parameter and returns no result.
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/FunctionalInterface.html">functional interface</a>
 */

@FunctionalInterface
public interface Action {
    public void run();
}