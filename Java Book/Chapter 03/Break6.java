// Where you put a labal is important.
class Break6 {
    public static void main(String args[]) {
        int x = 0, y = 0;

// Here the label is put before the for
stop1:  for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) {
                    break stop1;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
        }

        System.out.println();

// Now the label is immediately before {
        for(x = 0; x < 5; x++)
stop2:  {
            
    }
}
