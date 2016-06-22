package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void dbClick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        System.out.println("Скроллим" + direction);
    }
}
