public class Car {

    private static int totalCars = 0; // Static variable to track total cars created
    protected String name;
    protected int speed;
    protected int fuel;
    protected String track;

    // Default Constructor
    public Car() {
        this.name = "Unknown";
        this.speed = 0;
        this.fuel = 0;
        this.track = "Unknown";
        totalCars++;
        System.out.println("A car has been created using the default constructor.");
    }

    // Parameterized Constructor
    public Car(String name, int speed, int fuel, String track) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.track = track;
        totalCars++;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Track Type: " + track);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Participating in the Race: " + totalCars);
    }

    public boolean move() {
        if (fuel > 0) {
            fuel--;
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot continue.");
            return false;
        }
    }

    public int getAdjustedSpeed() {
        return speed;
    }
}
