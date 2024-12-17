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

    // Constructor with name and speed
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.fuel = 0;
        this.track = "Unknown";
        totalCars++;
        System.out.println("A car has been created with name and speed.");
    }

    // Constructor with all parameters
    public Car(String name, int speed, int fuel, String track) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.track = track;
        totalCars++;
        System.out.println("A car has been created with all details.");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Display method overloading

    // Default display
    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Track Type: " + track);
    }

    // Overloaded display with a title
    public void displayInfo(String title) {
        System.out.println("===== " + title + " =====");
        displayInfo();
    }

    // Overloaded display to show only essential details
    public void displayInfo(boolean showBasic) {
        if (showBasic) {
            System.out.println("Car: " + name + ", Speed: " + speed + " km/h");
        } else {
            displayInfo();
        }
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Participating in the Race: " + totalCars);
    }
}
