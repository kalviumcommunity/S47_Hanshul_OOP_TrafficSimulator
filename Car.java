public class Car {
    private String name;
    private int speed;
    private int fuel;
    private TrackBehavior trackBehavior; // Track behavior strategy

    public Car(String name, int speed, int fuel, TrackBehavior trackBehavior) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.trackBehavior = trackBehavior;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAdjustedSpeed() {
        return trackBehavior.getAdjustedSpeed(speed, name);
    }

    public boolean move() {
        if (fuel > 0) {
            fuel--;
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot move.");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
    }
}
