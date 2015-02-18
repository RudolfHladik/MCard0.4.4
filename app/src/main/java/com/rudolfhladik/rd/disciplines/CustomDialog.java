package com.rudolfhladik.rd.disciplines;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by RD on 28.1.2015.
 */
public class CustomDialog extends Dialog implements View.OnClickListener {

    public Activity activity;
    public Dialog dialog;
    public int advClass, upPoss, fraction;



public CustomDialog(Activity activity,int fraction, int ac, int position){
    super(activity);
    this.advClass = ac;
    this.upPoss = position;
    this.activity = activity;
    this.fraction = fraction;




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.utilitypoint_description_dialog);
        TextView title = (TextView) findViewById(R.id.ut_point_desc_title);
        TextView description = (TextView) findViewById(R.id.ut_point_desc_desc);
        TextView passive = (TextView) findViewById(R.id.ut_point_desc_passive);

        if (fraction==0) {
            RepUtilityDescription repUtDesc = new RepUtilityDescription();
            String[] desc = repUtDesc.getUtilityDescription(advClass, upPoss);
            title.setText(desc[0]);
            description.setText(desc[1]);
        }else if (fraction== 1){
            ImpUtilityDescription impUtDesc = new ImpUtilityDescription();
            String[] desc = impUtDesc.getUtilityDescription(advClass, upPoss);
            title.setText(desc[0]);
            description.setText(desc[1]);

        }


        title.setOnClickListener(this);
        description.setOnClickListener(this);
        passive.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        dismiss();
    }

}
