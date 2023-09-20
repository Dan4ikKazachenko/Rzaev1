public class Boat {
    private String name;
    private double length;
    private int maxSpeed;
    private String color;

    public Boat(String name, double length, int maxSpeed, String color) {
        this.name = name;
        this.length = length;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void startEngine() {
        System.out.println(name + " started the engine.");
    }

    public void stopEngine() {
        System.out.println(name + " stopped the engine.");
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}
