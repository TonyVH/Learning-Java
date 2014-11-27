class fib {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int c;

        while(a < 10000) {
            System.out.printf("%d ", a);
            c = a;
            a = b;
            b = c + b;
        }
        
        System.out.println();
    }
}
