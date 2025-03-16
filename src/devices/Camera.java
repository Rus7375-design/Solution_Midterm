package devices;

public class Camera implements SmartDevice {
    private String name;

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " запись начата.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " запись завершена.");
    }

    @Override
    public String getStatus() {
        return name + " (Камера): Запись активна";
    }
}