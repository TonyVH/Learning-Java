// *** Will not compile! ***
class StaticError {
    int denom = 3;
    static int val = 1024;

    /* Error! Can't access a non-static variable
       from within a static method. */
    static int valDivDenom() {
        return val / denom; // Error!
    }
}
