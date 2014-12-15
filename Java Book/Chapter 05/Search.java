// Seach an array using for-each style for.
class Search {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 5;
        boolean found = false;

        // Use for-each style for to seach nums for val
        for(int x: nums) {
            if(x == val) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Value found!");
        }
        else {
            System.out.println("Value not found!");
        }
    }
}
