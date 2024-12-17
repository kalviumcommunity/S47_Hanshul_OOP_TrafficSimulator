public class Main {
    public static void main(String[] args) {
        // Create car objects
        Car car1 = new Car("SportsCar", 150, 10);
        Car car2 = new Car("Truck", 90, 5);

        // Separate responsibilities
        CarDisplay carDisplay = new CarDisplay();
        CarMovement carMovement = new CarMovement();

        // Display car details
        System.out.println("Displaying Car Details:");
        carDisplay.displayCarInfo(car1);
        carDisplay.displayCarInfo(car2);

        // Move the cars
        System.out.println("\nTesting Car Movement:");
        carMovement.move(car1);
        carMovement.move(car1);
        carMovement.move(car2);
    }
}
