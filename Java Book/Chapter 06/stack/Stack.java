package stack;

public class Stack {
    private int index;
    private char[] s;

    public Stack(int size) {
        s = new char[size];
        index = 0;
    }

    public Stack(char[] a) {
        s = new char[a.length];
        try {
            for(int i = 0; i < a.length; i++) {
                push(a[i]);
            }
        }
        catch(StackFullException exc) {
            System.out.println(exc);
        }
    }

    public Stack(Stack ob) {
        s = new char[ob.s.length];
        for(int i = 0; i < ob.s.length; i++) {
            s[i] = ob.s[i];
        }
        index = ob.index;
    }

    public void push(char ch) throws StackFullException {
        if(index == s.length) {
            throw new StackFullException(s.length);
        }
        s[index++] = ch;
    }

    public char pop() throws StackEmptyException {
        if(index == 0) {
            throw new StackEmptyException();
        }
        return s[--index];
    }
}
