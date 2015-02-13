package com.rudolfhladik.rd.disciplines.activities;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

import com.rudolfhladik.rd.disciplines.MainActivity;
import com.rudolfhladik.rd.disciplines.R;

/**
 * Created by RD on 12.2.2015.
 */
public class ActivitySmall extends Activity implements View.OnClickListener{
    ImageView sage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(false);
//        getWindow().setAllowReturnTransitionOverlap(false);


        getWindow().setSharedElementExitTransition(exitTransition());
        getWindow().setSharedElementReenterTransition(reenterTransition());

        setContentView(R.layout.activity_small);

         sage = (ImageView) findViewById(R.id.thumb);
        sage.setOnClickListener(this);
        sage.setTransitionName("image");


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ActivitySmall.this, ActivityLarge.class );
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(ActivitySmall.this, sage, "image" );
        startActivity(intent, options.toBundle());
    }

    private Transition exitTransition() {
        ChangeBounds bounds = new ChangeBounds();
        bounds.setInterpolator(new BounceInterpolator());
        bounds.setDuration(2000);

        return bounds;
    }

    private Transition reenterTransition() {
        ChangeBounds bounds = new ChangeBounds();
        bounds.setInterpolator(new OvershootInterpolator());
        bounds.setDuration(500);

        return bounds;
    }
}
