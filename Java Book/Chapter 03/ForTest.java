// Loop until an S is typed.
class ForTest {
    public static void main(String args[])
        throws java.io.IOException {
        
        int i;

        System.out.println("Press S to stop.");

        for(i = 1; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);   // Take ENTER into account
        }
    }
}
