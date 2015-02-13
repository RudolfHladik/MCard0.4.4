package com.rudolfhladik.rd.disciplines.fragments;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.activities.ActivityGuideViewer;

/**
 * Created by RD on 30.1.2015.
 */
public class GuidesFragment extends Fragment implements View.OnClickListener{
    Bundle bundle = new Bundle();
    int aC;
    int fraction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guides, container, false);

        ImageButton guard = (ImageButton) view.findViewById(R.id.btn_guardian);
        guard.setOnClickListener(this);

//        sage.setClipToOutline(true);








        return view;
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.btn_guardian:
                aC = 0;
                break;
        }

        fraction = 0;
        bundle.putInt("Fraction", fraction);
        bundle.putInt("AC", aC);


        Intent intent = new Intent(getActivity(), ActivityGuideViewer.class);

        startActivity(intent, bundle);

    }

}
