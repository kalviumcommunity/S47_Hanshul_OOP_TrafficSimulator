public class CarDisplay {
    public void displayCarInfo(Car car) {
        System.out.println("Car Name: " + car.getName());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
        System.out.println("Fuel: " + car.getFuel() + " liters");
    }
}
