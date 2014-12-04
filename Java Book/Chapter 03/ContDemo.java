// Use continue.
class ContDemo {
    public static void main(String args[]) {
        int i;

        // Print even numbers between 0 and 100
        for(i = 0; i <= 100; i++) {
            if((i%2) != 0) {
                continue;   // Iterate
            }
            System.out.println(i);
        }
    }
}
