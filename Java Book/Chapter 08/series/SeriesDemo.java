package series;

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();
        int i;
        
        for(i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        System.out.println("\nResetting");
        ob.restart();
        for(i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }
    }
}
