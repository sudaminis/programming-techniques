package concepts.lambaexpressions.exceptions;

public interface ComputeAverage {
    double avg(int[] a) throws EmptyArrayException;

    class EmptyArrayException extends Exception {
        EmptyArrayException() {
            super("Empty Array");
        }
    }
}
