// Queue class for characters 
class Queue {
    private char queue[];
    private int putIndex, getIndex;

    Queue(int size) {
        queue = new char[size];
        putIndex = getIndex = 0;
    }

    Queue(Queue ob) {
        putIndex = ob.putIndex;
        getIndex = ob.getIndex;
        queue = new char[ob.queue.length];

        // Copy elements
        for(int i = getIndex; i < putIndex; i++) {
            queue[i] = ob.queue[i];
        }
    }

    Queue(char a[]) {
        putIndex = 0;
        getIndex = 0;
        queue = new char[a.length];

        for(int i = 0; i < a.length; i++) {
            put(a[i]);
        }
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

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        // construct 10-element empty queue
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // Construct queue from array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Put some characters into q1
        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        // Show the queues
        System.out.print("Contests of q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println("\n");
    }
}
