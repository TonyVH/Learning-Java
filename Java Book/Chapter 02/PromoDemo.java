// A promotion surprise!
class PromoDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // No cast needed

        b = 10;
        b = (byte) (b * b);   // Cast needed
        /*
        When two byte are involved in an arithmetic operation,
        those bytes are converted to type int.
        */

        System.out.println("i and b: " + i + " " + b);
    }
}
