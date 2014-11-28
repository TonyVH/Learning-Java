/*
    Calculates your weight based on the
    gravitational pull of the moon.
*/
class Moon{ 
    public static void main(String args[]) {
        double earth_weight, moon_weight;
        earth_weight = 188;
        moon_weight = earth_weight * .17;
        System.out.println("Weight on the moon: " + moon_weight);
    }
}

