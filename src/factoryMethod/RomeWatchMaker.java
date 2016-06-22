package factoryMethod;

/**
 * Created by wookie on 6/22/16.
 */
public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
