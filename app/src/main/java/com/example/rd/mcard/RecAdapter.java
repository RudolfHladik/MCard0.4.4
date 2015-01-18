package com.example.rd.mcard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RD on 16.1.2015.
 */
public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {

    private List<Char> mChars;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected ImageView charImg;
        protected TextView charName;
        protected TextView charAC;
        protected TextView charRole;
        protected TextView charEnv;

        public ViewHolder(View v){
            super(v);
            charImg = (ImageView) v.findViewById(R.id.iv_char_img);
            charName = (TextView) v.findViewById(R.id.tv_char_name);
            charAC = (TextView) v.findViewById(R.id.tv_char_ac);
            charRole = (TextView) v.findViewById(R.id.tv_char_role);
            charEnv = (TextView) v.findViewById(R.id.tv_char_env);

        }
    }

    public RecAdapter(List<Char> chars){
        this.mChars = chars;
    }

    @Override
    public int getItemCount() {
        return mChars.size();
    }

    @Override
    public RecAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.char_item, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {


        viewHolder.charName.setText(mChars.get(position).charName);
        viewHolder.charAC.setText(mChars.get(position).getAdvClass());
        viewHolder.charRole.setText(mChars.get(position).getRole());
        viewHolder.charEnv.setText(mChars.get(position).getSpecialization());





    }
}
