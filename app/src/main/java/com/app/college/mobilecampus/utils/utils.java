package com.app.college.mobilecampus.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class utils {

    public static void showToast(String message, Context context) {
        Toast toast = Toast.makeText(context,message,Toast.LENGTH_SHORT);
        toast.setView(setColorToast(toast));
        toast.show();
    }
    private static View setColorToast(Toast toast){
        View new_view = toast.getView();
        TextView v = (TextView) new_view.findViewById(android.R.id.message);
        v.setTextColor(Color.WHITE);
        new_view.getBackground().setColorFilter(Color.parseColor("#42a9da"), PorterDuff.Mode.SRC_IN);
        return new_view;
    }

}
