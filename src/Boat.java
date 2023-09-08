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
        System.out.println(name + " завел двигатель.");
    }

    public void stopEngine() {
        System.out.println(name + " остановил двигатель.");
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

    public static void main(String[] args) {
        Boat boat1 = new Boat("Скоростная лодка", 6.5, 90, "Синяя");

        System.out.println("Название: " + boat1.getName());
        System.out.println("Длина: " + boat1.getLength() + " метров");
        System.out.println("Максимальная скорость: " + boat1.getMaxSpeed() + " km/h");
        System.out.println("Цвет: " + boat1.getColor());
        boat1.startEngine();
        boat1.stopEngine();
    }
}