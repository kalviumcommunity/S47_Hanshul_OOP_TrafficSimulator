public class Main {
    public static void main(String[] args) {
        // Demonstrating Constructor Overloading
        System.out.println("Creating cars using different constructors:");

        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("SportsCar", 150); // Constructor with name and speed
        Car car3 = new Car("Truck", 90, 15, "offroad"); // Constructor with all details

        // Display total cars
        System.out.println();
        Car.displayTotalCars();

        // Demonstrating Function Overloading
        System.out.println("\nDemonstrating Method Overloading:");

        car1.displayInfo(); // Default display
        car2.displayInfo("Car Details - SportsCar"); // Overloaded display with title
        car3.displayInfo(true); // Overloaded display showing only basic details
    }
}
