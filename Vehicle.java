abstract class Vehicle {
    protected String name;
    protected int speed;
    protected int fuel;

    // Constructor
    public Vehicle(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
    }

    // Abstract method (virtual function)
    public abstract void move();

    // Virtual method that can be overridden
    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
    }
}
