// Side effects can be important.
class SideEffects {
    public static void main(String args[]) {
        int i = 0;

        /* Here i is incremented even though
           the if statement fails. */
        if(false & (++i < 100)) {
            System.out.println("This won't be displayed");
        }
       
        System.out.println("if statement executed: " + i);

        /* In this case, i is not incremented because
           the short-circuit operator skips the increment */
        if(false && (++i < 100)) {
            System.out.println("This won't be displayed");
        }

        System.out.println("if statement executed: " + i);
    }
}
