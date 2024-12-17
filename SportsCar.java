public class SportsCar extends Car {
    public SportsCar(int speed, int fuel) {
        super("SportsCar", speed, fuel);
    }

    @Override
    public int getAdjustedSpeed() {
        return speed + 20; // SportsCar gets a speed boost
    }

    @Override
    public boolean move() {
        if (fuel > 0) {
            fuel--;
            System.out.println(name + " is speeding at " + getAdjustedSpeed() + " km/h");
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot race.");
            return false;
        }
    }
}
