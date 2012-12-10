
package com.fly1ncu.mysteryofanimation;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Mystery2Activity extends Activity {
    private View mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery2);
        mView = findViewById(R.id.view);
    }

    public void onFadeButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        mView.startAnimation(anim);
    }

    public void onViewClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Viewがクリックされました");
        builder.setPositiveButton("OK", null);
        builder.show();
    }

}
