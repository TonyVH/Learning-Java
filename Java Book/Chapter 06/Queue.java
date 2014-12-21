// Improved Queue class with access modifiers
class Queue {
    // These members are now private
    private char queue[];
    private int putloc, getloc;

    Queue(int size) {
        queue = new char[size];
        putloc = getloc = 0;
    }

    // Put a character into the queue
    public void put(char ch) {
        if(queueIsFull()) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putloc++] = ch;
    }

    // Get a character from the queue
    public char get() {
        if(queueIsEmpty()) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return queue[getloc++];
    }

    private boolean queueIsFull() {
        if(putloc == queue.length) {
            return true;
        }
        return false;
    }

    private boolean queueIsEmpty() {
        if(getloc == putloc) {
            return true;
        }
        return false;
    }
}
