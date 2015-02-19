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
public class ImpUtilityClassSelectionFragment extends Fragment implements View.OnClickListener {

    View view;

    public int rep = 1; // imp = 1;
    public int advancedClass;

    Bundle bundle = new Bundle();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_imp_utility_class_select, container, false);

        //TODO 8 classes for Imps
        ImageView imp = (ImageView) view.findViewById(R.id.btn_rep);
        imp.setOnClickListener(this);

        ImageView guardian = (ImageView) view.findViewById(R.id.btn_juggernaut);
        guardian.setOnClickListener(this);

        ImageView sent = (ImageView) view.findViewById(R.id.btn_mara);
        sent.setOnClickListener(this);

        ImageView sage = (ImageView) view.findViewById(R.id.btn_sorc);
        sage.setOnClickListener(this);

        ImageView shadow = (ImageView) view.findViewById(R.id.btn_sin);
        shadow.setOnClickListener(this);

        ImageView mando = (ImageView) view.findViewById(R.id.btn_merc);
        mando.setOnClickListener(this);

        ImageView vanguard = (ImageView) view.findViewById(R.id.btn_pt);
        vanguard.setOnClickListener(this);

        ImageView scoundrel = (ImageView) view.findViewById(R.id.btn_op);
        scoundrel.setOnClickListener(this);

        ImageView slinger = (ImageView) view.findViewById(R.id.btn_sniper);
        slinger.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        Fragment fragment = new Fragment();

        switch (id) {
            case R.id.btn_juggernaut:
                fragment = new UtilityViewerFragment();

                advancedClass = 0;
                break;
            case R.id.btn_mara:
                fragment = new UtilityViewerFragment();

                advancedClass = 1;
                break;
            case R.id.btn_sorc:
                fragment = new UtilityViewerFragment();

                advancedClass = 2;
                break;
            case R.id.btn_sin:
                fragment = new UtilityViewerFragment();

                advancedClass = 3;
                break;
            case R.id.btn_merc:
                fragment = new UtilityViewerFragment();

                advancedClass = 4;
                break;
            case R.id.btn_pt:
                fragment = new UtilityViewerFragment();

                advancedClass = 5;
                break;
            case R.id.btn_op:
                fragment = new UtilityViewerFragment();

                advancedClass = 6;
                break;
            case R.id.btn_sniper:
                fragment = new UtilityViewerFragment();

                advancedClass = 7;
                break;
            case R.id.btn_rep:
                fragment = new RepUtilityClassSelectionFragment();


                break;
            case R.id.btn_imp:
                break;

            default:

                break;
        }
        bundle.putInt("Fraction", rep);
        bundle.putInt("AC", advancedClass);
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
    }
}
