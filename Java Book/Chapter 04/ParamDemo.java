// A simple example that uses a parameter.

class CheckNum {
    // Return true if x is even
    boolean isEven(int x) {
        return ((x % 2) == 0);
    }
}

class ParamDemo {
    public static void main(String args[]) {
        CheckNum e = new CheckNum();

        if(e.isEven(10)) {
            System.out.println("10 is even");
        }

        if(e.isEven(9)) {
            System.out.println("9 is even");
        }

        if(e.isEven(8)) {
            System.out.println("8 is even");
        }
    }
}
