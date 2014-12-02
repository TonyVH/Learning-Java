// Move more out of the for loop.
class Empty2 {
    public static void main(String args[]) {
        int i = 0;  // Initialization out of the loop

        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;    // Increment loop control var
        }
    }
}
