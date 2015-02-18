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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;

import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.activities.ActivityGuideViewer;

/**
 * Created by RD on 30.1.2015.
 */
public class ActivityGuides extends Activity implements View.OnClickListener{
    Bundle bundle = new Bundle();
    int aC;
    int fraction;
    ImageButton guard, sent, sage, shadow, mando, vang, scoundrel, slinger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);


        getWindow().setSharedElementExitTransition(exitTransition());
        getWindow().setSharedElementReenterTransition(reenterTransition());

        setContentView(R.layout.activity_guides);



        guard = (ImageButton) findViewById(R.id.btn_guardian);
        guard.setOnClickListener(this);

        sent = (ImageButton) findViewById(R.id.btn_sentinel);
        sent.setOnClickListener(this);

         sage = (ImageButton) findViewById(R.id.btn_sage);
        sage.setOnClickListener(this);

         shadow = (ImageButton) findViewById(R.id.btn_shadow);
        shadow.setOnClickListener(this);

         mando = (ImageButton) findViewById(R.id.btn_commando);
        mando.setOnClickListener(this);

         vang = (ImageButton) findViewById(R.id.btn_vanguard);
        vang.setOnClickListener(this);

         scoundrel = (ImageButton) findViewById(R.id.btn_scoundrel);
        scoundrel.setOnClickListener(this);

         slinger = (ImageButton) findViewById(R.id.btn_gunslinger);
        slinger.setOnClickListener(this);

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
        bounds.setDuration(2000);

        return bounds;
    }

    @Override
    public void onClick(View v) {
        ImageButton shared = guard;

        switch (v.getId()){
            case R.id.btn_guardian:
                guard.setTransitionName("image");
                shared = guard;
                aC = 0;
                break;
            case R.id.btn_sentinel:
                sent.setTransitionName("image");
                shared = sent;
                aC = 1;
                 break;
            case R.id.btn_sage:
                sage.setTransitionName("image");
                shared= sage;
                aC = 2;
                    break;
            case R.id.btn_shadow:
                shadow.setTransitionName("image");
                shared = shadow;
                    aC = 3;
                    break;
            case R.id.btn_commando:
                 mando.setTransitionName("image");
                 shared = mando;
                 aC = 4;
                 break;
            case R.id.btn_vanguard:
                 vang.setTransitionName("image");
                 shared = vang;
                 aC = 5;
                 break;

            case R.id.btn_scoundrel:
                    scoundrel.setTransitionName("image");
                    shared = scoundrel;
                    aC = 6;
                    break;
                case R.id.btn_gunslinger:
                    slinger.setTransitionName("image");
                    shared = slinger;
                    aC = 7;
                    break;

        }

        fraction = 0;
        bundle.putInt("Fraction", fraction);
        bundle.putInt("AC", aC);

        Intent intent = new Intent(ActivityGuides.this, ActivityGuideViewer.class );
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(ActivityGuides.this, shared , "image" );
        startActivity(intent, options.toBundle());


//        Intent intent = new Intent(getApplicationContext(), ActivityGuideViewer.class);
//
//        startActivity(intent, bundle);

    }

}
