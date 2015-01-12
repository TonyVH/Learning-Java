package queue;

// A circular queue.
class CircularQueue implements ICharQ {
    private char q[];
    private int putLoc, getLoc, length;
    
    // Construact an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size+1];
        putLoc = getLoc = 0;
        length = size;
    }

    // Put a character into the queue.
    public void put(char ch) {
        /* Queue is full if either putLoc is one less than
           getLoc, or if putLoc is at the end of the array
           and getLoc is at the beginning. */
        if(putLoc+1 == getLoc || ((putLoc == q.length-1) && (getLoc == 0))) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putLoc++] = ch;
        if(putLoc == q.length) {
            putLoc = 0;
        }
    }

    // Get a character from the queue.
    public char get() {
        if(getLoc == putLoc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        char ch = q[getLoc++];
        if(getLoc == q.length) {
            getLoc = 0;
        }
        return ch;
    }

    public int length() {
        return q.length;
    }

    public void reset() {
        q = new char[length];
        putLoc = getLoc = 0;
    }
}
