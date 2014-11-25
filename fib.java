class fib {
    public static void main(String[] args) {
        int n = 1000;
        fib(n);
    }

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int c;

        while(a <= n) {
            System.out.print(a + " ");
            c = a;
            a = b;
            b += c;
        }

        System.out.println();
    }
}
