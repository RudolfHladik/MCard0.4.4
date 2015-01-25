package com.rudolfhladik.rd.disciplines.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.ShopItem;

/**
 * Created by RD on 6.8.2014.
 */
public class ShopItemAdapter extends ArrayAdapter<ShopItem> {
    Context context;
    int layoutResID;
    ShopItem[] data = null;


    public ShopItemAdapter(Context context, int layoutResID, ShopItem[] data){
        super(context, layoutResID, data);
        this.context = context;
        this.layoutResID = layoutResID;
        this.data = data;




    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ShopItemHolder holder = null;


        if (row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResID, parent, false);
            holder = new ShopItemHolder();
            holder.imgIcon = (ImageView) row.findViewById(R.id.imgIconSales);
            holder.txtTitle = (TextView) row.findViewById(R.id.txtTitleSales);

            row.setTag(holder);

        }else
        {
            holder = (ShopItemHolder) row.getTag();
        }

        ShopItem shopItem = data[position];
        holder.txtTitle.setText(shopItem.title);
        holder.imgIcon.setImageResource(shopItem.icon);

    return row;
    }

    static class ShopItemHolder {
        ImageView imgIcon;
        TextView txtTitle;

    }

}
