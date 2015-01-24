package stack;

public class StackEmptyException extends Exception {
    
    public StackEmptyException() {
    }

    public String toString() {
        return "\nStack is empty.";
    }
}
