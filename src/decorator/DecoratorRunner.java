package decorator;

/**
 * Created by wookie on 6/22/16.
 */
public class DecoratorRunner {
    public static void main(String[] args) {
        PrinterInterface printer = new QuoteDecorator(new Printer("Assdas"));
        printer.print();
    }

}
