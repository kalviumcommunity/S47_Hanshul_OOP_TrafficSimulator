public class SmoothTrack implements TrackBehavior {
    @Override
    public int getAdjustedSpeed(int baseSpeed, String carType) {
        if (carType.equalsIgnoreCase("SportsCar")) {
            return baseSpeed; // SportsCar gets full speed
        } else if (carType.equalsIgnoreCase("Truck")) {
            return baseSpeed - 5; // Truck speed reduced
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return baseSpeed - 5; // Sedan speed reduced
        }
        return baseSpeed;
    }
}
