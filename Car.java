public class Car {
    protected String name;
    protected int speed;
    protected int fuel;

    public Car(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
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

    public boolean move() {
        if (fuel > 0) {
            fuel--;
            System.out.println(name + " is moving at speed " + speed);
            return true;
        } else {
            System.out.println(name + " is out of fuel.");
            return false;
        }
    }

    public int getAdjustedSpeed() {
        return speed; // Default behavior for general cars
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
    }
}
