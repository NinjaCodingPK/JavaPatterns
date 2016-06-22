package decorator;

/**
 * Created by wookie on 6/22/16.
 */
public class Printer implements PrinterInterface {
    private String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}
