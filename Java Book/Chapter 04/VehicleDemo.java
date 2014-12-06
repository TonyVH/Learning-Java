// A program that uses the Vehicle class.
class Vehicle {
    int passengers; // Number of passengers
    int fuelcap; // Fuel capacity in gallons
    int mpg;     // Fuel consumption in miles per gallon
}

// This class declares an object of type Vehicle
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers +
                           " with a range of " + range + " miles.");
    }
}
