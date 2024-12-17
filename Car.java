public class Car extends Vehicle {
    private static int totalCars = 0; // Static variable to track total cars created
    private String track;

    // Constructor
    public Car(String name, int speed, int fuel, String track) {
        super(name, speed, fuel); // Call to Vehicle constructor
        this.track = track;
        totalCars++;
    }

    // Implementing abstract method 'move' from Vehicle class
    @Override
    public void move() {
        if (fuel > 0) {
            fuel--;
            System.out.println(name + " is moving at " + speed + " km/h. Remaining fuel: " + fuel + " liters.");
        } else {
            System.out.println(name + " is out of fuel and cannot move.");
        }
    }

    // Overriding the displayInfo method to add track information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to base class method
        System.out.println("Track Type: " + track);
    }

    // Static method to display total cars
    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
}
