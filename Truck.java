public class Truck extends Car {
    public Truck(int speed, int fuel) {
        super("Truck", speed, fuel);
    }

    @Override
    public int getAdjustedSpeed() {
        return speed - 10; // Trucks are slower
    }

    @Override
    public boolean move() {
        if (fuel > 0) {
            fuel--;
            System.out.println(name + " is hauling at " + getAdjustedSpeed() + " km/h");
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot haul.");
            return false;
        }
    }
}
