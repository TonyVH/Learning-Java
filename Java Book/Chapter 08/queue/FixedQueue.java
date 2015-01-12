package queue;

// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char q[];
    private int putLoc, getLoc, length;

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
        length = size;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if(putLoc == q.length) {
            System.out.println(" - Queue is full.");
            return;
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
