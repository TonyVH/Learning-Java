class Stack {
    private int index;
    private char s[];

    public Stack(int size) {
        s = new char[size];
        index = 0;
    }

    public Stack(char a[]) {
        s = new char[a.length];
        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    public Stack(Stack ob) {
        s = new char[ob.s.length];
        for(int i = 0; i < ob.s.length; i++) {
            s[i] = ob.s[i];
        }
        index = ob.index;
    }

    public void push(char ch) {
        if(index == s.length) {
            System.out.println(" - Stack is full!");
            return;
        }
        s[index++] = ch;
    }

    public char pop() {
        if(index == 0) {
            System.out.println(" - Stack is empty!");
            return (char) 0;
        }
        return s[--index];
    }
}

class StackDemo {
    public static void main(String args[]) {
        Stack s1 = new Stack(10);

        char name[] = {'T', 'o', 'n', 'y'};

        Stack s2 = new Stack(name);

        char ch; 
        int i;

        for(i = 0; i < 10; i++) {
            s1.push((char) ('A' + i));
        }

        Stack s3 = new Stack(s1);

        System.out.print("Contents of s1: ");
        for(i = 0; i < 10; i++) {
            ch = s1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of s2: ");
        for(i = 0; i < 4; i++) {
            ch = s2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of s3: ");
        for(i = 0; i < 10; i++) {
            ch = s3.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
    }
}
