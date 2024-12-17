public class OffroadTrack implements TrackBehavior {
    @Override
    public int getAdjustedSpeed(int baseSpeed, String carType) {
        if (carType.equalsIgnoreCase("SportsCar")) {
            return baseSpeed - 20; // SportsCar speed greatly reduced
        } else if (carType.equalsIgnoreCase("Truck")) {
            return baseSpeed; // Truck retains full speed
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return baseSpeed - 10; // Sedan speed reduced
        }
        return baseSpeed;
    }
}
