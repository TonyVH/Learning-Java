class do_while_loop {
    public static void main(String[] args) {
        int counter = 0;

        do {    // Will execute at least once, regardless of condition
            System.out.println(counter);
            counter++;
        }while(counter <= 10);
    }
}
