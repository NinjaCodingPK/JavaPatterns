package abstractFactory;

/**
 * Created by wookie on 6/22/16.
 */
public class EnMouse implements Mouse {
        @Override
        public void click() {
            System.out.println("Click");
        }

        @Override
        public void dbClick() {
            System.out.println("Double click");
        }

        @Override
        public void scroll(int direction) {
            System.out.println("Scroll" + direction);
        }
}
