package com.example.rd.mcard;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Arrays;

/**
 * Created by RD on 26.7.2014.
 */
public class QRFragment extends Fragment {
    int upa = 7;
    //boolean[][] isSelected = new boolean[2][6]; = [3] [7]
    boolean[] isSelected = new boolean[20];


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_qr, container, false);



        Arrays.fill(isSelected, false);

        // upa = utility point available

        final ImageView[] utilImg = new ImageView[20];
        utilImg[0] = (ImageView) v.findViewById(R.id.utilImg0);
        utilImg[1] = (ImageView) v.findViewById(R.id.utilImg1);
        utilImg[2] = (ImageView) v.findViewById(R.id.utilImg2);
        utilImg[3] = (ImageView) v.findViewById(R.id.utilImg3);
        utilImg[4] = (ImageView) v.findViewById(R.id.utilImg4);
        utilImg[5] = (ImageView) v.findViewById(R.id.utilImg5);
        utilImg[6] = (ImageView) v.findViewById(R.id.utilImg6);

        ImageButton[] utilBtn = new ImageButton[20];
        utilBtn[0] = (ImageButton) v.findViewById(R.id.utilBtn0);
        utilBtn[1] = (ImageButton) v.findViewById(R.id.utilBtn1);
        utilBtn[2] = (ImageButton) v.findViewById(R.id.utilBtn2);
        utilBtn[3] = (ImageButton) v.findViewById(R.id.utilBtn3);
        utilBtn[4] = (ImageButton) v.findViewById(R.id.utilBtn4);
        utilBtn[5] = (ImageButton) v.findViewById(R.id.utilBtn5);
        utilBtn[6] = (ImageButton) v.findViewById(R.id.utilBtn6);



        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int id = view.getId();
                int i = 0;


                switch (id){
                    case R.id.utilBtn0:
                        i = 0;
                        break;
                    case R.id.utilBtn1:
                        i = 1;
                        break;
                    case R.id.utilBtn2:
                        i = 2;
                        break;
                    case R.id.utilBtn3:
                        i = 3;
                        break;
                    case R.id.utilBtn4:
                        i = 4;
                        break;
                    case R.id.utilBtn5:
                        i = 5;
                        break;
                    case R.id.utilBtn6:
                        i = 6;
                        break;

                }
                if (isSelected[i]){
                    isSelected[i] = false;
                    utilImg[i].setImageResource(R.drawable.lightsdown);
                    upa++;

                }else if (upa>0){
                    isSelected[i] = true;
                    utilImg[i].setImageResource(R.drawable.lightsup);
                    upa--;

                }

            }


        };

        utilBtn[0].setOnClickListener(onClickListener);
        utilBtn[1].setOnClickListener(onClickListener);
        utilBtn[2].setOnClickListener(onClickListener);
        utilBtn[3].setOnClickListener(onClickListener);
        utilBtn[4].setOnClickListener(onClickListener);
        utilBtn[5].setOnClickListener(onClickListener);
        utilBtn[6].setOnClickListener(onClickListener);









        return v;
}
}
