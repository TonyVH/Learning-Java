/* 
    This class implements a "fail-soft" array which
    prevents runtime errors.
*/

class FailSoftArray {
    private int a[];
    private int errval;
    public int length;

    /* Construct array given its size and the value to
       return if get() fails. */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Return balue at given index
    public int get(int index) {
        if(indexOK(index)) {
            return a[index];
        }
        else {
            return errval;
        }
    }

    // Put a value at an index. Return false on failure.
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        else {
            return false;
        }
    }

    // Return true if index is within bounds
    private boolean indexOK(int index) {
        if(index >= 0 && index < length) {
            return true;
        }
        else {
            return false;
        }
    }
}

// Demonstrate fail-soft array.
class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x, i;

        // Show quiet failures
        System.out.println("Fail quietly.");
        for(i = 0; i < (fs.length*2); i++) {
            fs.put(i, i*10);
        }

        for(i = 0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        
        // Now, handle failures
        System.out.println("\nFail with error reports.");
        for(i = 0; i < (fs.length*2); i++) {
            if(!fs.put(i, i*10)) {
                System.out.println("Index " + i + " out-of-bounds");
            }
        }

        for(i = 0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) {
                System.out.print(x + " ");
            }
            else {
                System.out.print("\nIndex " + i + " out-of-bounds");
            }
        }
        System.out.println();
    }
}


























