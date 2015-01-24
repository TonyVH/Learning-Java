package queue;

// A character queue interface.
public interface ICharQ {
    // Put a character into the queue.
    void put(char ch) throws QueueFullException;

    // Get a character from the queue.
    char get() throws QueueEmptyException;

    // Return the length of the queue.
    int length();

    // Reset the queue and index values.
    void reset();
}
