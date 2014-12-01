// Demonstrate the use of multiple variable in a for statment
class MultiVarFor{
    public static void main(String args[]) {
        int i, j;

        for(i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);
        }
    }
}
