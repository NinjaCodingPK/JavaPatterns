package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public class RuKeyboard  implements Keyboard {
    @Override
    public void print() {
        System.out.print("Печатаем");
    }

    @Override
    public void println() {
        System.out.println("Печатаем");
    }
}
