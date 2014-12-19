// Public vs private access.
class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    /* Mehtods to access alpha. It is okay for a
       member of a class to access a private member
       of the same class. */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();

        /* Access to alpha is allowed only 
           through its accessor methods. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // You cannot access alpha like this:
        // ob.alpha = 10;

        // These are okay because beta and gamma are public
        ob.beta = 88;
        ob.gamma = 99;
        System.out.println(ob.beta + " " + ob.gamma);
    }
}
