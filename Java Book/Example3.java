/*
    This program illustrates the differences
    between int and double.
*/
class Example3 {
    public static void main(String args[]) {
        int var;    // This declares an int variable
        double x;   // This declares a double variable

        var = 10;   // Assign var the value of 10
        x = 10.0;   // Assign x the value of 10.0

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println();   // Print a blank line

        // Divide both by 4
        var /= 4;   // var = var / 4;
        x /= 4;     // x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}
