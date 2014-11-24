class array_table {
    public static void main(String[] args) {
        System.out.println("Index \t Value");
        int list[] = {32,12,34,53,23,65,43};

        for(int i=0; i<list.length; i++) {
            System.out.printf("  %d \t  %d",i,list[i]);
            System.out.println();
        }
    }
}
