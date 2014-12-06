// A program that uses the Vehicle class.
class Vehicle {
    int passengers; // Number of passengers
    int fuelcap; // Fuel capacity in gallons
    int mpg;     // Fuel consumption in miles per gallon
}

// This class declares an object of type Vehicle
class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields for sports_car
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Compute the range assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers +
                           " with a range of " + range1 + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers +
                           " with a range of " + range2 + " miles.");
    }
}
