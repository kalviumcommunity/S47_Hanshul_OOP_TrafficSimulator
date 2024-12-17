public class CarMovement {
    public void move(Car car) {
        if (car.getFuel() > 0) {
            car.setFuel(car.getFuel() - 1); // Decrease fuel
            System.out.println(car.getName() + " is moving at " + car.getSpeed() + " km/h. Remaining fuel: " + car.getFuel() + " liters.");
        } else {
            System.out.println(car.getName() + " is out of fuel and cannot move.");
        }
    }
}
