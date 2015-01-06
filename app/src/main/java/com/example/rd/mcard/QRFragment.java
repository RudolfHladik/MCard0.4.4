package com.example.rd.mcard;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Created by RD on 26.7.2014.
 */
public class QRFragment extends Fragment {
    // upa = utility point available
    int upa = 7;
    // points spent in skillful area
    int s = 0;
    // points spent in masterful area
    int m = 0;
    //boolean[][] isSelected = new boolean[2][6]; = [3] [7]
    boolean[] isSelected = new boolean[21];


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_qr, container, false);



        Arrays.fill(isSelected, false);
        final TextView txtUtilCount = (TextView) v.findViewById(R.id.txtUtilCount);


        final ImageView[] utilImg = new ImageView[21];
        // Skillful section
        utilImg[0] = (ImageView) v.findViewById(R.id.utilImg0);
        utilImg[1] = (ImageView) v.findViewById(R.id.utilImg1);
        utilImg[2] = (ImageView) v.findViewById(R.id.utilImg2);
        utilImg[3] = (ImageView) v.findViewById(R.id.utilImg3);
        utilImg[4] = (ImageView) v.findViewById(R.id.utilImg4);
        utilImg[5] = (ImageView) v.findViewById(R.id.utilImg5);
        utilImg[6] = (ImageView) v.findViewById(R.id.utilImg6);
        //Masterful section
        utilImg[7] = (ImageView) v.findViewById(R.id.utilImg7);
        utilImg[8] = (ImageView) v.findViewById(R.id.utilImg8);
        utilImg[9] = (ImageView) v.findViewById(R.id.utilImg9);
        utilImg[10] = (ImageView) v.findViewById(R.id.utilImg10);
        utilImg[11] = (ImageView) v.findViewById(R.id.utilImg11);
        utilImg[12] = (ImageView) v.findViewById(R.id.utilImg12);
        utilImg[13] = (ImageView) v.findViewById(R.id.utilImg13);
        //Heroic section
        utilImg[14] = (ImageView) v.findViewById(R.id.utilImg14);
        utilImg[15] = (ImageView) v.findViewById(R.id.utilImg15);
        utilImg[16] = (ImageView) v.findViewById(R.id.utilImg16);
        utilImg[17] = (ImageView) v.findViewById(R.id.utilImg17);
        utilImg[18] = (ImageView) v.findViewById(R.id.utilImg18);
        utilImg[19] = (ImageView) v.findViewById(R.id.utilImg19);
        utilImg[20] = (ImageView) v.findViewById(R.id.utilImg20);


        ImageButton[] utilBtn = new ImageButton[21];
        // Skillful section
        utilBtn[0] = (ImageButton) v.findViewById(R.id.utilBtn0);
        utilBtn[1] = (ImageButton) v.findViewById(R.id.utilBtn1);
        utilBtn[2] = (ImageButton) v.findViewById(R.id.utilBtn2);
        utilBtn[3] = (ImageButton) v.findViewById(R.id.utilBtn3);
        utilBtn[4] = (ImageButton) v.findViewById(R.id.utilBtn4);
        utilBtn[5] = (ImageButton) v.findViewById(R.id.utilBtn5);
        utilBtn[6] = (ImageButton) v.findViewById(R.id.utilBtn6);
        //Masterful section
        utilBtn[7] = (ImageButton) v.findViewById(R.id.utilBtn7);
        utilBtn[8] = (ImageButton) v.findViewById(R.id.utilBtn8);
        utilBtn[9] = (ImageButton) v.findViewById(R.id.utilBtn9);
        utilBtn[10] = (ImageButton) v.findViewById(R.id.utilBtn10);
        utilBtn[11] = (ImageButton) v.findViewById(R.id.utilBtn11);
        utilBtn[12] = (ImageButton) v.findViewById(R.id.utilBtn12);
        utilBtn[13] = (ImageButton) v.findViewById(R.id.utilBtn13);
        //Heroic section
        utilBtn[14] = (ImageButton) v.findViewById(R.id.utilBtn14);
        utilBtn[15] = (ImageButton) v.findViewById(R.id.utilBtn15);
        utilBtn[16] = (ImageButton) v.findViewById(R.id.utilBtn16);
        utilBtn[17] = (ImageButton) v.findViewById(R.id.utilBtn17);
        utilBtn[18] = (ImageButton) v.findViewById(R.id.utilBtn18);
        utilBtn[19] = (ImageButton) v.findViewById(R.id.utilBtn19);
        utilBtn[20] = (ImageButton) v.findViewById(R.id.utilBtn20);

        //Skillful listener
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
                    case R.id.utilBtn7:
                        i = 7;
                        break;
                    case R.id.utilBtn8:
                        i = 8;
                        break;
                    case R.id.utilBtn9:
                        i = 9;
                        break;
                    case R.id.utilBtn10:
                        i = 10;
                        break;
                    case R.id.utilBtn11:
                        i = 11;
                        break;
                    case R.id.utilBtn12:
                        i = 12;
                        break;
                    case R.id.utilBtn13:
                        i = 13;
                        break;
                    case R.id.utilBtn14:
                        i = 14;
                        break;
                    case R.id.utilBtn15:
                        i = 15;
                        break;
                    case R.id.utilBtn16:
                        i = 16;
                        break;
                    case R.id.utilBtn17:
                        i = 17;
                        break;
                    case R.id.utilBtn18:
                        i = 18;
                        break;
                    case R.id.utilBtn19:
                        i = 19;
                        break;
                    case R.id.utilBtn20:
                        i = 20;
                        break;

                }
                if (isSelected[i]){
                    isSelected[i] = false;
                    utilImg[i].setImageResource(R.drawable.lightsdown);
                    upa++;
                    if (i<7){
                        s--;
                    }else if (i>6&&i<14){
                        m--;
                    }


                }else if (i<7) {
                    if (upa > 0) {
                        isSelected[i] = true;
                        utilImg[i].setImageResource(R.drawable.lightsup);
                        upa--;
                        s++;


                    }
                }else if (i>6 && i<14){
                    if (0<upa && upa<5 && s>2){
                        isSelected[i] = true;
                        utilImg[i].setImageResource(R.drawable.lightsup);
                        upa--;
                        m++;

                    }
                }else if (i>13){
                    if (upa>0 && upa <3 && (s+m>4)){
                        isSelected[i] = true;
                        utilImg[i].setImageResource(R.drawable.lightsup);
                        upa--;


                    }
                }

                txtUtilCount.setText("UPA: " +upa+ " i: " +i + " s: "+s+" m: "+m );
            }


        };




        utilBtn[0].setOnClickListener(onClickListener);
        utilBtn[1].setOnClickListener(onClickListener);
        utilBtn[2].setOnClickListener(onClickListener);
        utilBtn[3].setOnClickListener(onClickListener);
        utilBtn[4].setOnClickListener(onClickListener);
        utilBtn[5].setOnClickListener(onClickListener);
        utilBtn[6].setOnClickListener(onClickListener);
        utilBtn[7].setOnClickListener(onClickListener);
        utilBtn[8].setOnClickListener(onClickListener);
        utilBtn[9].setOnClickListener(onClickListener);
        utilBtn[10].setOnClickListener(onClickListener);
        utilBtn[11].setOnClickListener(onClickListener);
        utilBtn[12].setOnClickListener(onClickListener);
        utilBtn[13].setOnClickListener(onClickListener);
        utilBtn[14].setOnClickListener(onClickListener);
        utilBtn[15].setOnClickListener(onClickListener);
        utilBtn[16].setOnClickListener(onClickListener);
        utilBtn[17].setOnClickListener(onClickListener);
        utilBtn[18].setOnClickListener(onClickListener);
        utilBtn[19].setOnClickListener(onClickListener);
        utilBtn[20].setOnClickListener(onClickListener);










        return v;
}
}
