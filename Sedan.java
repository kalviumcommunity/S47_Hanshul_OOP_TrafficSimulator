public class Sedan extends Car {
    public Sedan(int speed, int fuel) {
        super("Sedan", speed, fuel);
    }

    @Override
    public int getAdjustedSpeed() {
        return speed; // No adjustments for Sedan
    }

    @Override
    public boolean move() {
        if (fuel > 0) {
            fuel--;
            System.out.println(name + " is cruising at " + getAdjustedSpeed() + " km/h");
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot move.");
            return false;
        }
    }
}
