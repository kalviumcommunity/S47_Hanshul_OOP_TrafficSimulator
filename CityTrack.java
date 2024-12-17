public class CityTrack implements TrackBehavior {
    @Override
    public int getAdjustedSpeed(int baseSpeed, String carType) {
        if (carType.equalsIgnoreCase("SportsCar")) {
            return baseSpeed - 10; // SportsCar speed reduced
        } else if (carType.equalsIgnoreCase("Truck")) {
            return baseSpeed - 5; // Truck speed reduced
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return baseSpeed; // Sedan retains full speed
        }
        return baseSpeed;
    }
}
