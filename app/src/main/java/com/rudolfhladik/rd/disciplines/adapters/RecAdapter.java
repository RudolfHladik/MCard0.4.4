package com.rudolfhladik.rd.disciplines.adapters;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.melnykov.fab.FloatingActionButton;
import com.rudolfhladik.rd.disciplines.CRUDer;
import com.rudolfhladik.rd.disciplines.Char;
import com.rudolfhladik.rd.disciplines.MainActivity;
import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.fragments.CharImpViewerFragment;
import com.rudolfhladik.rd.disciplines.fragments.CharRepViewerFragment;
import com.rudolfhladik.rd.disciplines.fragments.UtilityViewerFragment;

import java.io.IOException;
import java.util.List;

/**
 * Created by RD on 16.1.2015.
 */
public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {

    public List<Char> mChars;
    public Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        protected CardView cardView;
        protected ImageView charImg, sideSymbol;
        protected TextView charName;
        protected TextView charAC;
        protected TextView charRole;
        protected TextView charEnv;
        protected TextView btnDel;
        protected TextView btnEdit;
        protected TextView btnDisciplines;
        public Intent intent = new Intent();
        public Bundle bundle = new Bundle();








        public ViewHolder(View v){
            super(v);
            cardView = (CardView) v.findViewById(R.id.card_view);
            charImg = (ImageView) v.findViewById(R.id.iv_char_img);
            charName = (TextView) v.findViewById(R.id.tv_char_name);
            charAC = (TextView) v.findViewById(R.id.tv_char_ac);
            charRole = (TextView) v.findViewById(R.id.tv_char_role);
            charEnv = (TextView) v.findViewById(R.id.tv_char_env);
            sideSymbol = (ImageView) v.findViewById(R.id.side);
            btnDel = (TextView) v.findViewById(R.id.btn_delete_char);
            btnEdit = (TextView) v.findViewById(R.id.btn_edit_char);
            btnDisciplines = (TextView) v.findViewById(R.id.btn_disciplines);



            btnDisciplines.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean[] dis = new boolean[21];
                    dis = intent.getBooleanArrayExtra("Disciplines");
                    int rep = intent.getIntExtra("Fraction", 0);
                    int advancedClass = intent.getIntExtra("AC", 0);
                    bundle.putInt("Fraction", rep);
                    bundle.putInt("AC", advancedClass);
                    bundle.putBooleanArray("Disciplines", dis);
                    try{
                        final Activity activity = (Activity) v.getContext();
                        UtilityViewerFragment utilityViewerFragment = new UtilityViewerFragment();
                        utilityViewerFragment.setArguments(bundle);
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.content_frame,utilityViewerFragment).commit();


                    } catch (ClassCastException e) {
                        Log.d("", "Can't get the fragment manager with this");
                    }



//                   intent =  new Intent(v.getContext(), ActivityDisciplineEditor.class);
//                    intent.putExtra("Action_edit", true);
//                    intent.putExtra("Disciplines", dis);
//
//
//                    v.getContext().startActivity(intent);


                }
            });


        }

    }


    public RecAdapter(List<Char> chars, Context context){

        this.mChars = chars;
        this.context = context;
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
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.charImg.setImageURI(mChars.get(position).getAvatarUri());
        viewHolder.charName.setText(mChars.get(position).charName);
        viewHolder.charAC.setText(mChars.get(position).getAdvClass());
        viewHolder.charRole.setText(mChars.get(position).getRole());
        viewHolder.charEnv.setText(mChars.get(position).getSpecialization());
        viewHolder.intent.putExtra( "Disciplines",mChars.get(position).getDisciplines());
        viewHolder.intent.putExtra("Fraction", mChars.get(position).fraction);
        viewHolder.intent.putExtra("AC", mChars.get(position).advClass);
        viewHolder.intent.putExtra("ID", mChars.get(position).charid);
        int side = mChars.get(position).fraction;

        if (side == 0){
            viewHolder.sideSymbol.setImageResource(R.drawable.ic_rep);

        }else {
            viewHolder.sideSymbol.setImageResource(R.drawable.ic_imp);
//            viewHolder.sideSymbol.set
        }

        // Palette

        try {



            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), mChars.get(position).avatarUri);
            Palette palette = Palette.generate(bitmap, 6);
            viewHolder.cardView.setCardBackgroundColor(palette.getMutedColor(context.getResources().getColor(R.color.white)));
            viewHolder.charName.setTextColor(palette.getVibrantColor(context.getResources().getColor(R.color.primary_text)));
            viewHolder.charAC.setTextColor(palette.getDarkMutedColor(context.getResources().getColor(R.color.secondary_text)));
            viewHolder.charRole.setTextColor(palette.getDarkMutedColor(context.getResources().getColor(R.color.secondary_text)));
            viewHolder.charEnv.setTextColor(palette.getDarkMutedColor(context.getResources().getColor(R.color.secondary_text)));
        }catch (IOException io){

        }


        viewHolder.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = mChars.get(position).charid;
                CRUDer cru = new CRUDer(v.getContext());
                cru.deleteCharFromDB(id);
                mChars.remove(position);

                notifyItemRemoved(position);
                notifyDataSetChanged();

            }
        });

    }
}
