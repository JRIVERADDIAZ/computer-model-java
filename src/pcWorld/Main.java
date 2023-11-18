package pcWorld;
import pcWorld.model.Mouse;
import pcWorld.model.KeyBoard;
import pcWorld.model.Monitor;
import pcWorld.model.Computer;
import pcWorld.service.Order;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 15);
        //System.out.println(monitor);
        Mouse mouse = new Mouse("USB", "Logitech");
        //System.out.println(mouse);
        KeyBoard keyboard = new KeyBoard("USB", "Logitech");
        //System.out.println(keyboard);

        Computer computer = new Computer(
                "Lenovo",
                monitor,
                mouse,
                keyboard
        );

        System.out.println(computer);

        Order order1 = new Order();
        order1.addComputer(computer);
        order1.showOrder();

    }
}