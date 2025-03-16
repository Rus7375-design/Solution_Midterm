package composites;

import devices.SmartDevice;
import java.util.ArrayList;
import java.util.List;

// Абстрактная группа устройств
public class DeviceGroup implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public DeviceGroup(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Включение всех устройств в " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Выключение всех устройств в " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " содержит устройства:\n");
        for (SmartDevice device : devices) {
            status.append("  - ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}