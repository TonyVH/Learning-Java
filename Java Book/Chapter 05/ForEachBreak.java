// Use a for-each style for loop.
class ForEach2 {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for-each style for to display and sum the values
        // until 5 is found, then break.
        for(int x: nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if(x == 5) {
                break;
            }
        }

        System.out.println("Summation: " + sum);
    }
}
