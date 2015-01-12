package queue;

// A character queue interface.
public interface ICharQ {
    // Put a character into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();

    // Return the length of the queue.
    int length();

    // Reset the queue and index values.
    void reset();
}
