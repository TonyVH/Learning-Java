package queue;

// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char[] q;
    private int putLoc, getLoc, length;

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
        length = size;
    }

    // Put a character into the queue.
    public void put(char ch) throws QueueFullException {
        if(putLoc == q.length) {
            throw new QueueFullException(q.length);
        }

        q[putLoc++] = ch;
    }

    // Get a character from the queue.
    public char get() throws QueueEmptyException {
        if(getLoc == putLoc) {
            throw new QueueEmptyException();
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
