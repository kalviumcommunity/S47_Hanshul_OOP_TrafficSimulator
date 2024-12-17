public class RaceCar extends Car {
    private boolean turboEnabled;

    public RaceCar(String name, int speed, int fuel, String track) {
        super(name, speed, fuel, track);
        this.turboEnabled = false;
    }

    public void enableTurbo() {
        turboEnabled = true;
        System.out.println(name + " has enabled Turbo Boost!");
    }

    @Override
    public int getAdjustedSpeed() {
        if (turboEnabled) {
            return speed + 20; // Turbo increases speed by 20
        }
        return super.getAdjustedSpeed();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Turbo Boost Enabled: " + turboEnabled);
    }
}
