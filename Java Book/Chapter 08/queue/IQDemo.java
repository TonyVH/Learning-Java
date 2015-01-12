package queue;

// Demonstrate the ICharQ interface.
class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        ICharQ iQ;

        int i;
        
        iQ = q1;
        // Put some characters into fixed queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        // Show the queue.
        System.out.print("Contents of fixed queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();

        iQ = q2;
        // Put some characters into dynamic queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        // Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();

        iQ = q3;
        // Put some characters into circular queue.
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        
        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();

        // Put more characters into circular queue.
        for(i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();

        System.out.println("Store and consume from circular queue");
        for(i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            System.out.print(iQ.get());
        }
        System.out.println();

        System.out.println(q1.length() + "\n" + q2.length() + "\n" + q3.length());

        q1.reset();
        q2.reset();
        q3.reset();
        for(i = 0; i < 10; i++) {
            System.out.print(q1.get());
            System.out.print("\n" + q3.get());
        }
        System.out.println();

        for(i = 0; i < 5; i++) {
            System.out.print(q2.get());
        }
        System.out.println();
    }
}
