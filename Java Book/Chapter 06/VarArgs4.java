/*
    Varargs, overloading, and ambiguity.

    This program contains an error and will
    not complie!
*/
class VarArgs4 {
    // Use an int vararg parameter
    static void vaTest(int ... v) {
        // ...
    }

    // Use a boolean vararg parameter
    static void vaTest(boolean ... v) {
        // ...
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);    // Okay
        vaTest(true, false, true);  // Okay
        vaTest();   // Error: Ambiguous!
    }
}
