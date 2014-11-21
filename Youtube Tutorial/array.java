class array {
    public static void main(String[] args) {
       
        int list[] = {2,3,4,5,6,7,9,10}; // Note that an array may only contain values
        System.out.println(list[5]);     // of the same type (int, str, etc.).

        /* int list[] = new int[10];
           ^ is another way of creating a new array.
           It will have a maximum length of 10.
           Values are assigned as such: list[0] = 7; */

        for(int i=0; i<8; i++) {        // Iterate through the items in the array
            System.out.println(list[i]);// with a for loop.
        }
    }
}
