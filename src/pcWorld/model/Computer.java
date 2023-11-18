package pcWorld.model;

public class Computer {
    private int idComputer;
    private String name;
    private Monitor monitor;
    private Mouse mouse;
    private KeyBoard keyBoard;

    private static  int computerCounter;

    private Computer(){
        idComputer = ++computerCounter;
    }

    public Computer(String name, Monitor monitor, Mouse mouse, KeyBoard keyBoard){
        this();
        this.name = name;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "Computer{ " +
                " \n idComputer=" + idComputer +
                ", \n  name = " + name +
                ", \n monitor = " + monitor +
                ", \n mouse = " + mouse +
                ", \n keyBoard = " + keyBoard +
                '}';
    }
}
