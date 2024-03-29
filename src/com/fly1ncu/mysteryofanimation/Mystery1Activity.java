
package com.fly1ncu.mysteryofanimation;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Mystery1Activity extends Activity {
    private View mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery1);
        mView = findViewById(R.id.view);
    }

    public void onLeftButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.translate_left);
        mView.startAnimation(anim);
    }

    public void onRightButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.translate_right);
        mView.startAnimation(anim);
    }

    public void onViewClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Viewがクリックされました");
        builder.setPositiveButton("OK", null);
        builder.show();
    }

}
