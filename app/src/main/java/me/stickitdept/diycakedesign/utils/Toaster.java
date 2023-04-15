package me.stickitdept.diycakedesign.utils;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void makeToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
