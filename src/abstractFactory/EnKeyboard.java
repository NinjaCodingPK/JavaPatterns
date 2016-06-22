package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.print("Print");
    }

    @Override
    public void println() {
        System.out.println("Print");
    }
}
