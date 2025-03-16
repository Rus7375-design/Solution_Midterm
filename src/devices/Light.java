package devices;

public class Light implements SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " включен.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    @Override
    public String getStatus() {
        return name + " (Свет): Включен";
    }
}