// use a return value.
class Vehicle {
    int passengers; // Number of passengers
    int fuelcap; // Fuel capacity in gallons
    int mpg;     // Fuel consumption in miles per gallon

    // Display the range
    int range() {
        return fuelcap * mpg;
    }
}

// This class declares an object of type Vehicle
class RetMethod {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields for sports_car
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Minivan can carry " + minivan.passengers +
                         " with range of " + minivan.range() + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers +
                         " with range of " + sportscar.range() + " miles.");
    }
}
