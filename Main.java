public class Main {
    public static void main(String[] args) {
        // Track behaviors
        TrackBehavior smoothTrack = new SmoothTrack();
        TrackBehavior cityTrack = new CityTrack();
        TrackBehavior offroadTrack = new OffroadTrack();

        // Create cars with different track behaviors
        Car car1 = new Car("SportsCar", 150, 10, smoothTrack);
        Car car2 = new Car("Truck", 90, 8, cityTrack);
        Car car3 = new Car("Sedan", 120, 6, offroadTrack);

        // Display car details
        System.out.println("Car Information Before Race:");
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        // Start race simulation
        System.out.println("\nAdjusted Speeds:");
        System.out.println(car1.getName() + " adjusted speed: " + car1.getAdjustedSpeed());
        System.out.println(car2.getName() + " adjusted speed: " + car2.getAdjustedSpeed());
        System.out.println(car3.getName() + " adjusted speed: " + car3.getAdjustedSpeed());
    }
}
