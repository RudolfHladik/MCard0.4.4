package com.rudolfhladik.rd.disciplines;

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
import com.rudolfhladik.rd.disciplines.adapters.RecAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RD on 26.7.2014.
 */
public class CharViewerFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mRecAdapter;
    private RecyclerView.LayoutManager mRecLayoutManager;

    private Intent intent;
    String vibrant = "";
    String vibrantDark = "";
    String vibrantLight = "";
    String muted = "";
    String mutedDark = "";
    String mutedLight = "";




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
        boolean[] dis = new boolean[21];
        dis[0] = true;
        dis[1] = true;
        dis[2] = true;
        dis[7] = true;
        dis[8] = true;
        dis[14] = true;
        dis[15] = true;
        Char Terrel = new Char(9,"Terrel",60, 11,2,1,1,1);
        Terrel.setDisciplines(dis);
        List<Char> items = new ArrayList<Char>();
        items.add(Terrel);
        items.add(new Char(7,"Terril",60,14,1,2,1,0));
        items.add(new Char(7,"Terrell",60,14,1,2,1,0));
        items.add(new Char(7,"Fixr",60,14,1,2,1,0));
        items.add(new Char(7,"Zeebone",60,14,1,2,1,0));





        mRecAdapter = new RecAdapter(items);
        mRecyclerView.setAdapter(mRecAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_add_char);
        fab.attachToRecyclerView(mRecyclerView);
        fab.show(false);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(view.getContext(),ActivityCharCreate.class );
                startActivity(intent);

            }
        });


    return view;
}
}
