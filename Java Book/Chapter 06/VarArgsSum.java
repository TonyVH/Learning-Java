// Sum a variable number of ints pasted to a method.
class VarArgsSum {
    private static int sum(int ... n) {
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int sum = sum(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
    }
}
