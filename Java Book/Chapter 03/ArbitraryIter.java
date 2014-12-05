/*
    Program to demonstrate that the variable in a 
    for loop can increase by arbitrary amounts.
*/
class ArbitraryIter {
    public static void main(String args[]) {
        for(int i = 1; i < 100; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
