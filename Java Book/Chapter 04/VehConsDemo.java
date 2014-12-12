// Add a constructor.

class Vehicle {
    int passengers; // Number of passengers
    int fuelcap; // Fuel capacity in gallons
    int mpg;     // Fuel consumption in miles per gallon

    // Constructor for Vehicle class
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

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
class VehConsDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, minivan needs " +
                           gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, sportscar needs " +
                           gallons + " gallons of fuel.");
    }
}
