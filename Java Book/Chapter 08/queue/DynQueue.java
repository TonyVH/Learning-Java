package queue;

class DynQueue implements ICharQ {
    private char q[];
    private int putLoc, getLoc, length;

    // Create an empty queue.
    public DynQueue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
        length = size;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if(putLoc == q.length) {
            char t[] = new char[q.length * 2];

            for(int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }

            q = t;
        }

        q[putLoc++] = ch;
    }
    
    // Get a character from the queue.
    public char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getLoc++];
    }

    public int length() {
        return q.length;
    }

    public void reset() {
        q = new char[length];
        putLoc = getLoc = 0;
    }
}
