package com.rudolfhladik.rd.disciplines.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melnykov.fab.FloatingActionButton;
import com.rudolfhladik.rd.disciplines.CRUDer;
import com.rudolfhladik.rd.disciplines.Char;
import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.activities.ActivityImpCharCreate;
import com.rudolfhladik.rd.disciplines.adapters.RecAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RD on 12.2.2015.
 */
public class CharImpViewerFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mRecAdapter;
    private RecyclerView.LayoutManager mRecLayoutManager;
    private Bundle bundle;
    private Intent intent;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_char_viewer, container, false);

//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.swtor_logo);

//        Palette palette = Palette.generate(bitmap);
//                vibrant = palette.getVibrantSwatch().toString();
//                vibrantDark = palette.getDarkVibrantSwatch().toString();
//                vibrantLight = palette.getLightVibrantSwatch().toString();
//                muted = palette.getMutedSwatch().toString();
//                mutedDark = palette.getDarkMutedSwatch().toString();
//                mutedLight = palette.getLightMutedSwatch().toString();


//           Palette.generateAsync(bitmap, 6, new Palette.PaletteAsyncListener() {
//            @Override
//            public void onGenerated(Palette palette) {
//                vibrant = palette.getVibrantColor(0);
//                vibrantDark = palette.getDarkVibrantColor(0);
//                vibrantLight = palette.getLightVibrantColor(0);
//                muted = palette.getMutedColor(0);
//                mutedDark = palette.getDarkMutedColor(0);
//                mutedLight = palette.getLightMutedColor(0);
//
//
//
//
//            }
//        });




//        TextView colors = (TextView) view.findViewById(R.id.colorsTV);
//        colors.setText("Vibrant: " + vibrant  +
//                "\n VibrantDark: " + vibrantDark +
//                "\n VibrantLight: " + vibrantLight +
//                "\n muted: " + muted +
//                "\n mutedDark: " + mutedDark +
//                "\n mutedLight: " + mutedLight);
////        colors.setBackgroundColor(vibrantDark);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        // changes in content do not change size of view
        mRecyclerView.setHasFixedSize(true);
        mRecLayoutManager = new LinearLayoutManager(view.getContext());
        mRecyclerView.setLayoutManager(mRecLayoutManager);


        List<Char> items = new ArrayList<Char>();
        Char[] chars = null;
        if (items.isEmpty()){
            CRUDer cruDer = new CRUDer(view.getContext());
            chars = cruDer.getCharsFromDB(1);
            if (chars!= null) {
                int lenght = chars.length;
                for (int i = 0; i<lenght; i++){
                    items.add(chars[i]);
                }
            }
            //check DB if(DB empty) show dialog No Chars
//                            else load chars from DB
        }else {
            //
        }
//




        mRecAdapter = new RecAdapter(items, getActivity());
        mRecyclerView.setAdapter(mRecAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_add_char);
        fab.attachToRecyclerView(mRecyclerView);
        fab.show(false);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(view.getContext(),ActivityImpCharCreate.class );
                startActivity(intent);

            }
        });


        return view;
    }
}
