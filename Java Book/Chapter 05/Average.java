// Use an array to find the average of 10 numbers.
class Average {
    public static void main(String args[]) {
        int i;
        int sum = 0;
        double nums[] = new double[10];

        for(i = 0; i < nums.length; i++) {
            nums[i] = i + i * i;
        }

        for(i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Average: " + sum / nums.length);
    }
}
