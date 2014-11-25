class multi_array_table {
    public static void main(String[] args) {
        int first[][] = {{1,2,3,4}, {2,3,4,5}};
        int second[][] = {{3,4,5,6}, {4,5,6,7}};

        System.out.println("This is the first array");
        table(first);

        System.out.println("This is the second array");
        table(second);
    }

    public static void table(int x[][]) {
        for(int row=0; row<x.length; row++) {
            for(int column=0; column<x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }

            System.out.println();
        }
    }
}
