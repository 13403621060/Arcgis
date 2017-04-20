package common;

import android.graphics.BitmapFactory;

/**
 * Created by DMN on 2017/4/19.
 */

public class Utils {
    public static BitmapFactory.Options getBitmapOption(int inSampleSize) {
        System.gc();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inSampleSize = inSampleSize;
        return options;
    }
}
