class enhanced_for_loop {
    public static void main(String[] args) {
        int list[] = {4,5,6,7,8};
        int sum = 0;

        for(int x: list) { 
            sum += x;
        }
        System.out.println(sum);
    }
}
