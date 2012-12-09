
package com.fly1ncu.mysteryofanimation;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class Mystery1Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery1);
    }

    public void onViewClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Viewがクリックされました");
        builder.setPositiveButton("OK", null);
        builder.show();
    }

}
