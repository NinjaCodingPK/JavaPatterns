package delegate;

/**
 * Created by wookie on 6/22/16.
 */
public class delegateRunner {
    public static void main(String[] args) {
        Painter p = new Painter();
        p.setGraphics(new Square());
        p.draw();
    }
}
