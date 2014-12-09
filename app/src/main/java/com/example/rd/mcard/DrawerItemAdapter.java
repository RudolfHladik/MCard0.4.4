package com.example.rd.mcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RD on 23.7.2014.
 */
public class DrawerItemAdapter extends ArrayAdapter<DrawerItem> {
    Context context;
    int layoutResourceId;
    DrawerItem data[] = null;

    public DrawerItemAdapter( Context context, int layoutResourceId, DrawerItem[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        DrawerItemHolder holder = null;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new DrawerItemHolder();
            holder.imgIcon = (ImageView) row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView) row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }
        else
        {
            holder = (DrawerItemHolder) row.getTag();
        }

        DrawerItem drawerItem = data[position];
        holder.txtTitle.setText(drawerItem.title);
        holder.imgIcon.setImageResource(drawerItem.icon);


        return row;
    }

    static class DrawerItemHolder
    {
        ImageView imgIcon;
        TextView txtTitle;

    }
}
