package com.rudolfhladik.rd.disciplines;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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

        switch (id){
            case R.id.btn_guardian:

                advancedClass = 0;
                break;
            case R.id.btn_sentinel:

                advancedClass = 1;
                break;
            case R.id.btn_sage:

                advancedClass = 2;
                break;
            case R.id.btn_shadow:

                advancedClass = 3;
                break;
            case R.id.btn_commando:

                advancedClass = 4;
                break;
            case R.id.btn_vanguard:

                advancedClass = 5;
                break;
            case R.id.btn_scoundrel:

                advancedClass = 6;
                break;
            case R.id.btn_gunslinger:

                advancedClass = 7;
                break;
            case R.id.btn_imp:
                break;
            case R.id.btn_rep:
                break;

            default:
                advancedClass = 0;
                break;
        }

        bundle.putInt("Fraction", rep);
        bundle.putInt("AC", advancedClass);
        UtilityViewerFragment utilityViewerFragment = new UtilityViewerFragment();
        utilityViewerFragment.setArguments(bundle);
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame,utilityViewerFragment).commit();



    }
}
