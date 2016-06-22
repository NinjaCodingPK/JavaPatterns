package delegate;

/**
 * Created by wookie on 6/22/16.
 */
public class Painter {
    private Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw() {
        graphics.draw();
    }
}
