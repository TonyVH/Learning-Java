// Interface for Vehicle class.
interface VehicleIF {
    // Distance vehicle can travel on a full tank of gas.
    int range();
    // Fuel needed to travel given distance.
    double fuelNeeded(int miles);
    // Passengers: get/set.
    int getPassengers();
    void setPassengers(int p);
    // FuelCap: get/set.
    int getFuelCap();
    void setFuelCap(int f);
    // MPG: get/set;
    int getMpg();
    void setMpg(int m);
}
