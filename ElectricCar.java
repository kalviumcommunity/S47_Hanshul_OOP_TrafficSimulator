public class ElectricCar extends Car {
    private int batteryPercentage;

    public ElectricCar(String name, int speed, int batteryPercentage, String track) {
        super(name, speed, 0, track); // Fuel is 0 since it's an electric car
        this.batteryPercentage = batteryPercentage;
    }

    public void chargeBattery(int charge) {
        batteryPercentage = Math.min(100, batteryPercentage + charge);
        System.out.println(name + " has been charged to " + batteryPercentage + "% battery.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryPercentage + "%");
    }

    @Override
    public boolean move() {
        if (batteryPercentage > 0) {
            batteryPercentage -= 5; // Moving consumes 5% battery
            return true;
        } else {
            System.out.println(name + " has no battery left and cannot continue.");
            return false;
        }
    }
}
