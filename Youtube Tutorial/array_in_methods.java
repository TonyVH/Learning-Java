class array_in_methods {
    public static void main(String[] args) {
        int list[] = {1,2,3,4,5,6};
        change(list);
        for(int y: list) {
            System.out.println(y);
        } 
    }
    public static void change(int x[]) {
        for(int i=0; i<x.length; i++) {
            x[i] += 5;
        }
    }
}
