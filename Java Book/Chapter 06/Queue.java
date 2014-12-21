// Improved Queue class with access modifiers
class Queue {
    // These members are now private
    private char queue[];
    private int putIndex, getIndex;

    Queue(int size) {
        queue = new char[size];
        putIndex = getIndex = 0;
    }

    // Put a character into the queue
    public void put(char ch) {
        if(queueIsFull()) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putIndex++] = ch;
    }

    // Get a character from the queue
    public char get() {
        if(queueIsEmpty()) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return queue[getIndex++];
    }

    private boolean queueIsFull() {
        return (putIndex == queue.length);
    }

    private boolean queueIsEmpty() {
        return (getIndex == putIndex);
    }
}
