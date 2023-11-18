package pcWorld.model;

public class InputDevice {
    private String inputType;
    private String brand;
      // constructor

    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "pcWorld.model.inputDevice{" +
                "inputType='" + inputType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
