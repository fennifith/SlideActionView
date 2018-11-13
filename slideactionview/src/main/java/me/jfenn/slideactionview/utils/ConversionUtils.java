package me.jfenn.slideactionview.utils;

import android.content.Context;
import android.content.res.Resources;

public class ConversionUtils {

    /**
     * Converts dp units to pixels.
     *
     * @param dp            A distance measurement, in dp.
     * @return              The value of the provided dp units, in pixels.
     */
    public static int dpToPx(float dp) {
        return (int) (Resources.getSystem().getDisplayMetrics().density * dp);
    }

    /**
     * Converts pixels to dp.
     *
     * @param pixels        A distance measurement, in pixels.
     * @return              The value of the provided pixel units, in dp.
     */
    public static float pxToDp(int pixels) {
        return pixels / Resources.getSystem().getDisplayMetrics().density;
    }

    /**
     * Converts sp to pixels.
     *
     * @param sp            A distance measurement, in sp.
     * @return              The value of the provided sp units, in pixels.
     */
    public static int spToPx(float sp) {
        return (int) (Resources.getSystem().getDisplayMetrics().scaledDensity * sp);
    }

    /**
     * Converts pixels to sp.
     *
     * @param pixels        A distance measurement, in pixels.
     * @return              The value of the provided pixel units, in sp.
     */
    public static float pxToSp(int pixels) {
        return pixels / Resources.getSystem().getDisplayMetrics().scaledDensity;
    }

}
