package com.example.rd.mcard;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by RD on 26.7.2014.
 */
public class HistoryFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mRecAdapter;
    private RecyclerView.LayoutManager mRecLayoutManager;






    public View onCreateView(LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);




        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        // changes in content do not change size of view
        mRecyclerView.setHasFixedSize(true);
        mRecLayoutManager = new LinearLayoutManager(view.getContext());
        mRecyclerView.setLayoutManager(mRecLayoutManager);
        List<Char> items = new ArrayList<Char>();
        items.add(new Char(9,"Terrel",60, 11,2,1,1,1));
        items.add(new Char(7,"Terril",60,14,1,2,1,0));




        // TODO rec adapter
        mRecAdapter = new RecAdapter(items);
        mRecyclerView.setAdapter(mRecAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


    return view;
}
}
