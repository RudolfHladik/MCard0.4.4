package com.rudolfhladik.rd.disciplines.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rudolfhladik.rd.disciplines.R;

/**
 * Created by RD on 28.1.2015.
 */
public class RepUtilityClassSelectionFragment extends Fragment implements View.OnClickListener{

    View view;
    public int rep = 0; // imp = 1;
    public int advancedClass;

    Bundle bundle = new Bundle();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rep_utility_class_select, container, false);

        //TODO 8 classes for REPS

        ImageView imp = (ImageView) view.findViewById(R.id.btn_imp);
        imp.setOnClickListener(this);

        ImageView guardian = (ImageView) view.findViewById(R.id.btn_guardian);
        guardian.setOnClickListener(this);

        ImageView sent = (ImageView) view.findViewById(R.id.btn_sentinel);
        sent.setOnClickListener(this);

        ImageView sage = (ImageView) view.findViewById(R.id.btn_sage);
        sage.setOnClickListener(this);

        ImageView shadow = (ImageView) view.findViewById(R.id.btn_shadow);
        shadow.setOnClickListener(this);

        ImageView mando = (ImageView) view.findViewById(R.id.btn_commando);
        mando.setOnClickListener(this);

        ImageView vanguard = (ImageView) view.findViewById(R.id.btn_vanguard);
        vanguard.setOnClickListener(this);

        ImageView scoundrel = (ImageView) view.findViewById(R.id.btn_scoundrel);
        scoundrel.setOnClickListener(this);

        ImageView slinger = (ImageView) view.findViewById(R.id.btn_gunslinger);
        slinger.setOnClickListener(this);










        return view;
    }

    @Override
    public void onClick(View v) {
         int id = v.getId();
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        Fragment fragment = new Fragment();

        switch (id){
            case R.id.btn_guardian:
                fragment = new UtilityViewerFragment();

                advancedClass = 0;
                break;
            case R.id.btn_sentinel:
                fragment = new UtilityViewerFragment();

                advancedClass = 1;
                break;
            case R.id.btn_sage:
                fragment = new UtilityViewerFragment();

                advancedClass = 2;
                break;
            case R.id.btn_shadow:
                fragment = new UtilityViewerFragment();

                advancedClass = 3;
                break;
            case R.id.btn_commando:
                fragment = new UtilityViewerFragment();

                advancedClass = 4;
                break;
            case R.id.btn_vanguard:
                fragment = new UtilityViewerFragment();

                advancedClass = 5;
                break;
            case R.id.btn_scoundrel:
                fragment = new UtilityViewerFragment();

                advancedClass = 6;
                break;
            case R.id.btn_gunslinger:
                fragment = new UtilityViewerFragment();

                advancedClass = 7;
                break;
            case R.id.btn_imp:
                  fragment = new ImpUtilityClassSelectionFragment();


                break;
            case R.id.btn_rep:
                break;

            default:

                break;
        }

        bundle.putInt("Fraction", rep);
        bundle.putInt("AC", advancedClass);
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.content_frame,fragment).commit();



    }
}
