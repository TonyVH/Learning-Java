// Find prime numbers between 2 and 100
class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;

        for(i = 2; i < 100; i++) {
            isprime = true;

            // See if the number is evenly divisible
            for(j=2; j <= i/j; j++) {
                // If it is, then it is not prime
                if((i%j) == 0) {
                    isprime = false;
                }
            }

            if(isprime) {
                System.out.println(i + " is prime.");
            }
        }
    }
}
