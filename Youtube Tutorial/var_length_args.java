class var_length_args {
    public static void main(String[] args) {
        System.out.println(average(24,32,12,41,53,12,53));
    }

    public static int average(int...numbers) {
        int total = 0;
        for(int x: numbers) {
            total += x;
        }

        return total/numbers.length;
    }
}
