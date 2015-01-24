package stack;

public class StackFullException extends Exception {
    private int size;

    public StackFullException(int s) {
        size = s;
    }

    public String toString() {
        return "Stack can only hold " + size;
    }
}
