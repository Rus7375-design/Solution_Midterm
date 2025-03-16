package devices;

public class Thermostat implements SmartDevice {
    private String name;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " установлен на 22°C.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    @Override
    public String getStatus() {
        return name + " (Термостат): Работает на 22°C";
    }
}