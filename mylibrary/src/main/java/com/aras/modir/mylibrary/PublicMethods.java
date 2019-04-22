package com.aras.modir.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class PublicMethods {

    public static void showToast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    public static int convertStringToInt(String numbertostring) {
        int number = Integer.parseInt(numbertostring);
        return number;
    }

    public static String convertIntToString(int number) {
        String numbertostring = String.valueOf(number);
        return numbertostring;
    }

    public static int showPercentage(long bytesWritten, long totalSize) {
        int percentage = (int) (bytesWritten * 100.0 / totalSize + 0.5);
        return percentage;
    }


}
