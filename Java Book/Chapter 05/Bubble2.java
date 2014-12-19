// Demonstrate the Bubble sort with an array of strings.

class Bubble2 {
    public static void main(String args[]) {
        String strs[] = {"this", "is", "a", "test",
                      "of", "a", "string", "sort"};
        int a, b;
        String t;
        int size = strs.length;

        // Display original array
        System.out.print("Original array is:");
        for(int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();

        // This is the bubble sort
        for(a = 1; a < size; a++) {
            for(b = size-1; b >= a; b--) {
                if(strs[b-1].compareTo(strs[b]) > 0) {
                    t = strs[b-1];
                    strs[b-1] = strs[b];
                    strs[b] = t;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted array is:");
        for(int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();
    }
}
