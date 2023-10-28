package com.example.personalfinancetracker01.helper;

import android.app.AlertDialog;
import android.content.Context;

public class AlertHelper {
    public static void showOkAlert(Context context, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}
