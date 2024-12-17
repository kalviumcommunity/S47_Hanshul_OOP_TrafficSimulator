public class Main {
    public static void main(String[] args) {
        Car car1 = new SportsCar(150, 10);
        Car car2 = new Truck(100, 8);
        Car car3 = new Sedan(120, 6);

        System.out.println("Car Information:");
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        System.out.println("\nStarting the Race...");
        car1.move();
        car2.move();
        car3.move();
    }
}
