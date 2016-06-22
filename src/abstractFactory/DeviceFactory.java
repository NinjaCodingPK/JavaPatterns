package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
