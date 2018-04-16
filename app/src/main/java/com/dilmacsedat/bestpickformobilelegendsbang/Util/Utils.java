package com.dilmacsedat.bestpickformobilelegendsbang.Util;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by Sedat
 * on 6.04.2018.
 */

public class Utils {
    private static final String TAG = "Utils";

    public static int pxToDp(Context ctx, int px) {
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        int dp = Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return dp;
    }

    public static int dpToPx(Context ctx, int dp) {
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

}
