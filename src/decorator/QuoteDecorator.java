package decorator;

/**
 * Created by wookie on 6/22/16.
 */
public class QuoteDecorator implements PrinterInterface {
    private PrinterInterface component;

    public QuoteDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
