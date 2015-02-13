package com.rudolfhladik.rd.disciplines.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.rudolfhladik.rd.disciplines.R;

/**
 * Created by RD on 12.2.2015.
 */
public class ActivityLarge extends Activity {

    ImageView sage, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(false);
//        getWindow().setAllowReturnTransitionOverlap(false);


//        getWindow().setSharedElementEnterTransition(enterTransition());
        getWindow().setSharedElementReturnTransition(returnTransition());
        getWindow().setSharedElementEnterTransition(null);
//        getWindow().setSharedElementReturnTransition(null);




        setContentView(R.layout.activity_large);
        image = (ImageView) findViewById(R.id.sage);
        int cx = (image.getLeft() + image.getRight()) / 2;
        int cy = (image.getTop() + image.getBottom()) / 2;

        int finalRadius = Math.max(image.getWidth(), image.getHeight());
        Animator animator = ViewAnimationUtils.createCircularReveal(image, cx, cy, 0, finalRadius);
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                image.setVisibility(View.VISIBLE);

            }
        });

        animator.start();


        sage = (ImageView) findViewById(R.id.large);
        sage.setTransitionName("image");

    }

    private Transition enterTransition() {
        ChangeBounds bounds = new ChangeBounds();
        bounds.setDuration(2000);

        return bounds;
    }

    private Transition returnTransition() {
        ChangeBounds bounds = new ChangeBounds();
        bounds.setInterpolator(new DecelerateInterpolator());
        bounds.setDuration(300);

        return bounds;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAfterTransition();
    }
}
