package com.rudolfhladik.rd.disciplines.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rudolfhladik.rd.disciplines.R;

import java.util.List;
import java.util.Map;

/**
 * Created by RD on 20.8.2014.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> laptopCollections;
    private List<String> laptops;

    public ExpandableListAdapter(Activity context, List<String> laptops,
                                 Map<String, List<String>> laptopCollections) {
        this.context = context;
        this.laptopCollections = laptopCollections;
        this.laptops = laptops;
    }

    public Object getChild(int groupPosition, int childPosition) {
        return laptopCollections.get(laptops.get(groupPosition)).get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String laptop = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.child_item, null);
        }


        TextView item = (TextView) convertView.findViewById(R.id.child_item_txt_view);

        ImageView delete = (ImageView) convertView.findViewById(R.id.child_item_img_view);


        item.setText(laptop);
       if (childPosition == 0) {
           delete.setImageResource(R.drawable.ic_rep);
       }else {
           delete.setImageResource(R.drawable.ic_imp);
       }
        return convertView;
    }

    public int getChildrenCount(int groupPosition) {
        return laptopCollections.get(laptops.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition) {
        return laptops.get(groupPosition);
    }

    public int getGroupCount() {
        return laptops.size();
    }

    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String laptopName = (String) getGroup(groupPosition);
        int i = groupPosition;
        int data = 0;


            LayoutInflater layoutInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // setting different layout for rows
            if (i>2){

                convertView = layoutInflater.inflate(R.layout.drawer_lv_menu_item,
                        null);
            }else {
                convertView = layoutInflater.inflate(R.layout.exp_lv_parent, null);
            }
//        }
        TextView item = (TextView) convertView.findViewById(R.id.txtTitle);
        ImageView img = (ImageView) convertView.findViewById(R.id.imgIcon);





        switch (i){
            case 0: data = R.drawable.ic_jedi_black;

                break;

            case 1: data = R.drawable.ic_qr;
                break;

            case 2: data = R.drawable.ic_shop_history;
                break;
            case 3:
                    data = R.drawable.ic_action_settings;
//




                break;
            case 4: data = R.drawable.ic_action_help;
                break;

//
        }
//
        img.setImageResource(data);
//
        item.setText(laptopName);
//
        return convertView;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
