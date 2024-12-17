public class Main {
    public static void main(String[] args) {
        // Creating Car objects
        Car car1 = new Car("SportsCar", 150, 10, "smooth");
        Car car2 = new Car("Truck", 90, 5, "offroad");

        // Displaying car details
        System.out.println("Car Details:");
        car1.displayInfo();
        car2.displayInfo();

        System.out.println("\nTesting the move function:");
        car1.move();
        car1.move(); // Call move twice to reduce fuel
        car2.move();

        // Displaying total cars
        System.out.println("\nTotal Cars Created:");
        Car.displayTotalCars();

        //Using Vehicle reference for Car objects
        Vehicle v1 = car1; 
        Vehicle v2 = car2;

        v1.displayInfo(); // Calls overridden method in Car
        v2.move();        // Calls overridden method in Car
    }
}
