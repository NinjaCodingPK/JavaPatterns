package factoryMethod;

/**
 * Created by wookie on 6/22/16.
 */
public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
