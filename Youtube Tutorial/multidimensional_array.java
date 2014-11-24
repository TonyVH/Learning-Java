class multidimentional_array {
    public static void main(String[] args) {

        int first[][] = {{1,2,3,4}, {9,8,7,6}};
        int second[][] = {{5,6,7,8}, {5,4,3,2}};
        int x, i;

        for(i=0; i<first.length; i++) {
            for(x=0; x<first[0].length; x++) {
                System.out.print(first[i][x] + " ");
            }
    
            System.out.println();
            for(x=0; x<second[0].length; x++) {
                System.out.print(second[i][x] + " ");
            }

            System.out.println();
        }
    }
}
