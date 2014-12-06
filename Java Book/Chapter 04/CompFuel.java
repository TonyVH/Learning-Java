/*
    Add a parameterized method that computes the
    fuel required for a given distance.
*/

class Vehicle {
    int passengers; // Number of passengers
    int fuelcap; // Fuel capacity in gallons
    int mpg;     // Fuel consumption in miles per gallon

    // Return the range
    int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

// This class declares an object of type Vehicle
class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields for sports_car
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, minivan needs " +
                           gallons + " gallons of fuel.");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, sportscar needs " +
                           gallons + " gallons of fuel.");
    }
}
