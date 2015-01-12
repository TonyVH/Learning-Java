package series;

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();
        ByThrees ob2 = new ByThrees();
        int i;
        
        for(i = 0; i < 5; i++) {
            System.out.println("By twos: " + ob.getNext());
            System.out.println("By threes: " + ob2.getNext());
        }

        System.out.println("\nResetting");
        ob.reset();
        ob2.reset();
        for(i = 0; i < 5; i++) {
            System.out.println("By twos: " + ob.getNext());
            System.out.println("By threes: " + ob2.getNext());
        }

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        ob2.setStart(100);
        for(i = 0; i < 5; i++) {
            System.out.println("By twos: " + ob.getNext());
            System.out.println("By threes: " + ob2.getNext());
        }
    }
}
