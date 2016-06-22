package factoryMethod;

import java.util.Date;

/**
 * Created by wookie on 6/22/16.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
