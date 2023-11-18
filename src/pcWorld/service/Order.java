package pcWorld.service;
import pcWorld.model.Computer;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int OrderId;
    private final List<Computer> computers;
    private static int conputersCounter;

    public Order() {
        computers = new ArrayList<>();
        this.OrderId = ++conputersCounter;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void showOrder() {
        System.out.println("Order # " + OrderId);
        System.out.println("Computers total: " + computers.size());
        computers.forEach(System.out::println);
    }



}
