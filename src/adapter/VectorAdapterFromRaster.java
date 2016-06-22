package adapter;

/**
 * Created by wookie on 6/22/16.
 */
public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}