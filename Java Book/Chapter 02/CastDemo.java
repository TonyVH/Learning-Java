// Demonstrate casting.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);  // cast double to int
        System.out.println("Integer outcome fo x / y: " + i);

        i = 100;
        b = (byte) i;   // In byte range
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;   // Out of byte range
        System.out.println("Value of b: " + b);

        b = 88; //ASCII code for X
        ch = (char) b;
        System.out.println("Value of ch: " + ch); 
        
    }
}
