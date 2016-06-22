package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public class EnTouchpad implements Touchpad {
    @Override
    public void track(int direction) {
        System.out.println("Scroll" + direction);
    }
}
