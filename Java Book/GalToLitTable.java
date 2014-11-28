/*
    Try This 1-2
    This program displays a conversion
    table of gallons to liters.
*/
class GalToLitTalbe {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " Gallons is " +
                               liters + " liters.");

            counter++;
            // Every 10th line, print a blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; // Reset the line counter
            }
        }
    }
}
