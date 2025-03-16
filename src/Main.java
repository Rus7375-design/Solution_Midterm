import devices.*;
import composites.*;

public class Main {
    public static void main(String[] args) {
        Room livingRoom = new Room("Гостиная");
        livingRoom.addDevice(new Light("Люстра"));
        livingRoom.addDevice(new Camera("Камера наблюдения"));

        Room bedroom = new Room("Спальня");
        bedroom.addDevice(new Light("Ночник"));
        bedroom.addDevice(new Thermostat("Обогреватель"));

        Floor firstFloor = new Floor("Первый этаж");
        firstFloor.addDevice(livingRoom);
        firstFloor.addDevice(bedroom);

        firstFloor.turnOn();
        System.out.println(firstFloor.getStatus());
        firstFloor.turnOff();
    }
}
