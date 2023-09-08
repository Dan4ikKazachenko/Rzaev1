public class Main {
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
