package com.rudolfhladik.rd.disciplines.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;
import com.rudolfhladik.rd.disciplines.R;

/**
 * Created by RD on 6.2.2015.
 */
public class ActivityGuideViewer extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(R.color.primary)
                .headerLayout(R.layout.header_light)
                .contentLayout(R.layout.activity_guide_viewer);

        setContentView(helper.createView(this));

        helper.initActionBar(this);

        ActionBar actionBar = getActionBar();
        actionBar.setIcon(android.R.drawable.screen_background_dark_transparent);

    }




}
