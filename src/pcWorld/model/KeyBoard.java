package pcWorld.model;

public class KeyBoard extends InputDevice{
    private final int idKeyBoard;
    private static int keyBoardCounter;

    // Contructor
    public KeyBoard(String inputType, String brand) {
        super(inputType, brand);
        idKeyBoard = ++keyBoardCounter;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "idKeyBoard=" + idKeyBoard +
                "} " + super.toString();
    }
}
