public class Main {
    public static void main(String[] args) {
        // Display total cars before creation
        System.out.println("Before creating cars:");
        Car.displayTotalCars();

        // Creating a regular car
        Car regularCar = new Car("Sedan", 100, 10, "city");

        // Creating an Electric Car (Single Inheritance)
        ElectricCar tesla = new ElectricCar("Tesla Model S", 120, 80, "smooth");

        // Creating a Race Car (Hierarchical Inheritance)
        RaceCar formula1 = new RaceCar("Formula 1", 200, 15, "smooth");

        // Display car information
        System.out.println("\nDisplaying Car Details:");
        regularCar.displayInfo();
        tesla.displayInfo();
        formula1.displayInfo();

        // Charging the electric car and enabling turbo for the race car
        tesla.chargeBattery(15);
        formula1.enableTurbo();

        // Starting the race
        System.out.println("\nStarting a Race:");
        Race race = new Race(regularCar, tesla, formula1, 10);
        race.startRace();

        // Display total cars and races
        System.out.println("\nSummary:");
        Car.displayTotalCars();
        Race.displayRaceCount();
    }
}
