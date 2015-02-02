package com.rudolfhladik.rd.disciplines;

import android.app.Dialog;
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
public class UtilityViewerFragment extends Fragment {
    // upa = utility point available
    int upa = 7;
    // points spent in skillful area
    int s = 0;
    // points spent in masterful area
    int m = 0;
    //boolean[][] isSelected = new boolean[2][6]; = [3] [7]
    boolean[] isSelected;
    int ac;
    int fraction;

    public static final int numberOfUtilities = 21;

    int[] guardian = new int[numberOfUtilities];
    int[] sentinel = new int[numberOfUtilities];
    int[] sage = new int[numberOfUtilities];
    int[] shadow = new int[numberOfUtilities];
    int[] commando = new int[numberOfUtilities];
    int[] vanguard = new int[numberOfUtilities];
    int[] scoundrel = new int[numberOfUtilities];
    int[] gunslinger = new int[numberOfUtilities];

    int[] juggernaut = new int[numberOfUtilities];
    int[] marauder = new int[numberOfUtilities];
    int[] sorcerer = new int[numberOfUtilities];
    int[] assassin = new int[numberOfUtilities];
    int[] mercenery = new int[numberOfUtilities];
    int[] powertech = new int[numberOfUtilities];
    int[] operative = new int[numberOfUtilities];
    int[] sniper = new int[numberOfUtilities];







    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_discipline_edit, container, false);



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

        // guardian utilities images
        guardian[0] = R.drawable.guardian_0;
        guardian[1] = R.drawable.guardian_1;
        guardian[2] = R.drawable.guardian_2;
        guardian[3] = R.drawable.guardian_3;
        guardian[4] = R.drawable.guardian_4;
        guardian[5] = R.drawable.guardian_5;
        guardian[6] = R.drawable.guardian_6;
        guardian[7] = R.drawable.guardian_7;
        guardian[8] = R.drawable.guardian_8;
        guardian[9] = R.drawable.guardian_9;
        guardian[10] = R.drawable.guardian_10;
        guardian[11] = R.drawable.guardian_11;
        guardian[12] = R.drawable.guardian_12;
        guardian[13] = R.drawable.guardian_13;
        guardian[14] = R.drawable.guardian_14;
        guardian[15] = R.drawable.guardian_15;
        guardian[16] = R.drawable.guardian_16;
        guardian[17] = R.drawable.guardian_17;
        guardian[18] = R.drawable.guardian_18;
        guardian[19] = R.drawable.guardian_19;
        guardian[20] = R.drawable.guardian_20;

        sentinel[0] = R.drawable.sentinel_0;
        sentinel[1] = R.drawable.sentinel_1;
        sentinel[2] = R.drawable.sentinel_2;
        sentinel[3] = R.drawable.sentinel_3;
        sentinel[4] = R.drawable.sentinel_4;
        sentinel[5] = R.drawable.sentinel_5;
        sentinel[6] = R.drawable.sentinel_6;
        sentinel[7] = R.drawable.sentinel_7;
        sentinel[8] = R.drawable.sentinel_8;
        sentinel[9] = R.drawable.sentinel_9;
        sentinel[10] = R.drawable.sentinel_10;
        sentinel[11] = R.drawable.sentinel_11;
        sentinel[12] = R.drawable.sentinel_12;
        sentinel[13] = R.drawable.sentinel_13;
        sentinel[14] = R.drawable.sentinel_14;
        sentinel[15] = R.drawable.sentinel_15;
        sentinel[16] = R.drawable.sentinel_16;
        sentinel[17] = R.drawable.sentinel_17;
        sentinel[18] = R.drawable.sentinel_18;
        sentinel[19] = R.drawable.sentinel_19;
        sentinel[20] = R.drawable.sentinel_20;

        sage[0] = R.drawable.sage_0;
        sage[1] = R.drawable.sage_1;
        sage[2] = R.drawable.sage_2;
        sage[3] = R.drawable.sage_3;
        sage[4] = R.drawable.sage_4;
        sage[5] = R.drawable.sage_5;
        sage[6] = R.drawable.sage_6;
        sage[7] = R.drawable.sage_7;
        sage[8] = R.drawable.sage_8;
        sage[9] = R.drawable.sage_9;
        sage[10] = R.drawable.sage_10;
        sage[11] = R.drawable.sage_11;
        sage[12] = R.drawable.sage_12;
        sage[13] = R.drawable.sage_13;
        sage[14] = R.drawable.sage_14;
        sage[15] = R.drawable.sage_15;
        sage[16] = R.drawable.sage_16;
        sage[17] = R.drawable.sage_17;
        sage[18] = R.drawable.sage_18;
        sage[19] = R.drawable.sage_19;
        sage[20] = R.drawable.sage_20;

        shadow[0] = R.drawable.shadow_0;
        shadow[1] = R.drawable.shadow_1;
        shadow[2] = R.drawable.shadow_2;
        shadow[3] = R.drawable.shadow_3;
        shadow[4] = R.drawable.shadow_4;
        shadow[5] = R.drawable.shadow_5;
        shadow[6] = R.drawable.shadow_6;
        shadow[7] = R.drawable.shadow_7;
        shadow[8] = R.drawable.shadow_8;
        shadow[9] = R.drawable.shadow_9;
        shadow[10] = R.drawable.shadow_10;
        shadow[11] = R.drawable.shadow_11;
        shadow[12] = R.drawable.shadow_12;
        shadow[13] = R.drawable.shadow_13;
        shadow[14] = R.drawable.shadow_14;
        shadow[15] = R.drawable.shadow_15;
        shadow[16] = R.drawable.shadow_16;
        shadow[17] = R.drawable.shadow_17;
        shadow[18] = R.drawable.shadow_18;
        shadow[19] = R.drawable.shadow_19;
        shadow[20] = R.drawable.shadow_20;

        commando[0] = R.drawable.commando_0;
        commando[1] = R.drawable.commando_1;
        commando[2] = R.drawable.commando_2;
        commando[3] = R.drawable.commando_3;
        commando[4] = R.drawable.commando_4;
        commando[5] = R.drawable.commando_5;
        commando[6] = R.drawable.commando_6;
        commando[7] = R.drawable.commando_7;
        commando[8] = R.drawable.commando_8;
        commando[9] = R.drawable.commando_9;
        commando[10] = R.drawable.commando_10;
        commando[11] = R.drawable.commando_11;
        commando[12] = R.drawable.commando_12;
        commando[13] = R.drawable.commando_13;
        commando[14] = R.drawable.commando_14;
        commando[15] = R.drawable.commando_15;
        commando[16] = R.drawable.commando_16;
        commando[17] = R.drawable.commando_17;
        commando[18] = R.drawable.commando_18;
        commando[19] = R.drawable.commando_19;
        commando[20] = R.drawable.commando_20;

        vanguard[0] = R.drawable.vanguard_0;
        vanguard[1] = R.drawable.vanguard_1;
        vanguard[2] = R.drawable.vanguard_2;
        vanguard[3] = R.drawable.vanguard_3;
        vanguard[4] = R.drawable.vanguard_4;
        vanguard[5] = R.drawable.vanguard_5;
        vanguard[6] = R.drawable.vanguard_6;
        vanguard[7] = R.drawable.vanguard_7;
        vanguard[8] = R.drawable.vanguard_8;
        vanguard[9] = R.drawable.vanguard_9;
        vanguard[10] = R.drawable.vanguard_10;
        vanguard[11] = R.drawable.vanguard_11;
        vanguard[12] = R.drawable.vanguard_12;
        vanguard[13] = R.drawable.vanguard_13;
        vanguard[14] = R.drawable.vanguard_14;
        vanguard[15] = R.drawable.vanguard_15;
        vanguard[16] = R.drawable.vanguard_16;
        vanguard[17] = R.drawable.vanguard_17;
        vanguard[18] = R.drawable.vanguard_18;
        vanguard[19] = R.drawable.vanguard_19;
        vanguard[20] = R.drawable.vanguard_20;

        scoundrel[0] = R.drawable.scoundrel_0;
        scoundrel[1] = R.drawable.scoundrel_1;
        scoundrel[2] = R.drawable.scoundrel_2;
        scoundrel[3] = R.drawable.scoundrel_3;
        scoundrel[4] = R.drawable.scoundrel_4;
        scoundrel[5] = R.drawable.scoundrel_5;
        scoundrel[6] = R.drawable.scoundrel_6;
        scoundrel[7] = R.drawable.scoundrel_7;
        scoundrel[8] = R.drawable.scoundrel_8;
        scoundrel[9] = R.drawable.scoundrel_9;
        scoundrel[10] = R.drawable.scoundrel_10;
        scoundrel[11] = R.drawable.scoundrel_11;
        scoundrel[12] = R.drawable.scoundrel_12;
        scoundrel[13] = R.drawable.scoundrel_13;
        scoundrel[14] = R.drawable.scoundrel_14;
        scoundrel[15] = R.drawable.scoundrel_15;
        scoundrel[16] = R.drawable.scoundrel_16;
        scoundrel[17] = R.drawable.scoundrel_17;
        scoundrel[18] = R.drawable.scoundrel_18;
        scoundrel[19] = R.drawable.scoundrel_19;
        scoundrel[20] = R.drawable.scoundrel_20;

        gunslinger[0] = R.drawable.gunslinger_0;
        gunslinger[1] = R.drawable.gunslinger_1;
        gunslinger[2] = R.drawable.gunslinger_2;
        gunslinger[3] = R.drawable.gunslinger_3;
        gunslinger[4] = R.drawable.gunslinger_4;
        gunslinger[5] = R.drawable.gunslinger_5;
        gunslinger[6] = R.drawable.gunslinger_6;
        gunslinger[7] = R.drawable.gunslinger_7;
        gunslinger[8] = R.drawable.gunslinger_8;
        gunslinger[9] = R.drawable.gunslinger_9;
        gunslinger[10] = R.drawable.gunslinger_10;
        gunslinger[11] = R.drawable.gunslinger_11;
        gunslinger[12] = R.drawable.gunslinger_12;
        gunslinger[13] = R.drawable.gunslinger_13;
        gunslinger[14] = R.drawable.gunslinger_14;
        gunslinger[15] = R.drawable.gunslinger_15;
        gunslinger[16] = R.drawable.gunslinger_16;
        gunslinger[17] = R.drawable.gunslinger_17;
        gunslinger[18] = R.drawable.gunslinger_18;
        gunslinger[19] = R.drawable.gunslinger_19;
        gunslinger[20] = R.drawable.gunslinger_20;

        juggernaut[0] = R.drawable.juggernaut_0;
        juggernaut[1] = R.drawable.juggernaut_1;
        juggernaut[2] = R.drawable.juggernaut_2;
        juggernaut[3] = R.drawable.juggernaut_3;
        juggernaut[4] = R.drawable.juggernaut_4;
        juggernaut[5] = R.drawable.juggernaut_5;
        juggernaut[6] = R.drawable.juggernaut_6;
        juggernaut[7] = R.drawable.juggernaut_7;
        juggernaut[8] = R.drawable.juggernaut_8;
        juggernaut[9] = R.drawable.juggernaut_9;
        juggernaut[10] = R.drawable.juggernaut_10;
        juggernaut[11] = R.drawable.juggernaut_11;
        juggernaut[12] = R.drawable.juggernaut_12;
        juggernaut[13] = R.drawable.juggernaut_13;
        juggernaut[14] = R.drawable.juggernaut_14;
        juggernaut[15] = R.drawable.juggernaut_15;
        juggernaut[16] = R.drawable.juggernaut_16;
        juggernaut[17] = R.drawable.juggernaut_17;
        juggernaut[18] = R.drawable.juggernaut_18;
        juggernaut[19] = R.drawable.juggernaut_19;
        juggernaut[20] = R.drawable.juggernaut_20;

        marauder[0] = R.drawable.marauder_0;
        marauder[1] = R.drawable.marauder_1;
        marauder[2] = R.drawable.marauder_2;
        marauder[3] = R.drawable.marauder_3;
        marauder[4] = R.drawable.marauder_4;
        marauder[5] = R.drawable.marauder_5;
        marauder[6] = R.drawable.marauder_6;
        marauder[7] = R.drawable.marauder_7;
        marauder[8] = R.drawable.marauder_8;
        marauder[9] = R.drawable.marauder_9;
        marauder[10] = R.drawable.marauder_10;
        marauder[11] = R.drawable.marauder_11;
        marauder[12] = R.drawable.marauder_12;
        marauder[13] = R.drawable.marauder_13;
        marauder[14] = R.drawable.marauder_14;
        marauder[15] = R.drawable.marauder_15;
        marauder[16] = R.drawable.marauder_16;
        marauder[17] = R.drawable.marauder_17;
        marauder[18] = R.drawable.marauder_18;
        marauder[19] = R.drawable.marauder_19;
        marauder[20] = R.drawable.marauder_20;

        sorcerer[0] = R.drawable.sorcerer_0;
        sorcerer[1] = R.drawable.sorcerer_1;
        sorcerer[2] = R.drawable.sorcerer_2;
        sorcerer[3] = R.drawable.sorcerer_3;
        sorcerer[4] = R.drawable.sorcerer_4;
        sorcerer[5] = R.drawable.sorcerer_5;
        sorcerer[6] = R.drawable.sorcerer_6;
        sorcerer[7] = R.drawable.sorcerer_7;
        sorcerer[8] = R.drawable.sorcerer_8;
        sorcerer[9] = R.drawable.sorcerer_9;
        sorcerer[10] = R.drawable.sorcerer_10;
        sorcerer[11] = R.drawable.sorcerer_11;
        sorcerer[12] = R.drawable.sorcerer_12;
        sorcerer[13] = R.drawable.sorcerer_13;
        sorcerer[14] = R.drawable.sorcerer_14;
        sorcerer[15] = R.drawable.sorcerer_15;
        sorcerer[16] = R.drawable.sorcerer_16;
        sorcerer[17] = R.drawable.sorcerer_17;
        sorcerer[18] = R.drawable.sorcerer_18;
        sorcerer[19] = R.drawable.sorcerer_19;
        sorcerer[20] = R.drawable.sorcerer_20;

        assassin[0] = R.drawable.assassin_0;
        assassin[1] = R.drawable.assassin_1;
        assassin[2] = R.drawable.assassin_2;
        assassin[3] = R.drawable.assassin_3;
        assassin[4] = R.drawable.assassin_4;
        assassin[5] = R.drawable.assassin_5;
        assassin[6] = R.drawable.assassin_6;
        assassin[7] = R.drawable.assassin_7;
        assassin[8] = R.drawable.assassin_8;
        assassin[9] = R.drawable.assassin_9;
        assassin[10] = R.drawable.assassin_10;
        assassin[11] = R.drawable.assassin_11;
        assassin[12] = R.drawable.assassin_12;
        assassin[13] = R.drawable.assassin_13;
        assassin[14] = R.drawable.assassin_14;
        assassin[15] = R.drawable.assassin_15;
        assassin[16] = R.drawable.assassin_16;
        assassin[17] = R.drawable.assassin_17;
        assassin[18] = R.drawable.assassin_18;
        assassin[19] = R.drawable.assassin_19;
        assassin[20] = R.drawable.assassin_20;

        mercenery[0] = R.drawable.mercenery_0;
        mercenery[1] = R.drawable.mercenery_1;
        mercenery[2] = R.drawable.mercenery_2;
        mercenery[3] = R.drawable.mercenery_3;
        mercenery[4] = R.drawable.mercenery_4;
        mercenery[5] = R.drawable.mercenery_5;
        mercenery[6] = R.drawable.mercenery_6;
        mercenery[7] = R.drawable.mercenery_7;
        mercenery[8] = R.drawable.mercenery_8;
        mercenery[9] = R.drawable.mercenery_9;
        mercenery[10] = R.drawable.mercenery_10;
        mercenery[11] = R.drawable.mercenery_11;
        mercenery[12] = R.drawable.mercenery_12;
        mercenery[13] = R.drawable.mercenery_13;
        mercenery[14] = R.drawable.mercenery_14;
        mercenery[15] = R.drawable.mercenery_15;
        mercenery[16] = R.drawable.mercenery_16;
        mercenery[17] = R.drawable.mercenery_17;
        mercenery[18] = R.drawable.mercenery_18;
        mercenery[19] = R.drawable.mercenery_19;
        mercenery[20] = R.drawable.mercenery_20;

        powertech[0] = R.drawable.powertech_0;
        powertech[1] = R.drawable.powertech_1;
        powertech[2] = R.drawable.powertech_2;
        powertech[3] = R.drawable.powertech_3;
        powertech[4] = R.drawable.powertech_4;
        powertech[5] = R.drawable.powertech_5;
        powertech[6] = R.drawable.powertech_6;
        powertech[7] = R.drawable.powertech_7;
        powertech[8] = R.drawable.powertech_8;
        powertech[9] = R.drawable.powertech_9;
        powertech[10] = R.drawable.powertech_10;
        powertech[11] = R.drawable.powertech_11;
        powertech[12] = R.drawable.powertech_12;
        powertech[13] = R.drawable.powertech_13;
        powertech[14] = R.drawable.powertech_14;
        powertech[15] = R.drawable.powertech_15;
        powertech[16] = R.drawable.powertech_16;
        powertech[17] = R.drawable.powertech_17;
        powertech[18] = R.drawable.powertech_18;
        powertech[19] = R.drawable.powertech_19;
        powertech[20] = R.drawable.powertech_20;

        operative[0] = R.drawable.operative_0;
        operative[1] = R.drawable.operative_1;
        operative[2] = R.drawable.operative_2;
        operative[3] = R.drawable.operative_3;
        operative[4] = R.drawable.operative_4;
        operative[5] = R.drawable.operative_5;
        operative[6] = R.drawable.operative_6;
        operative[7] = R.drawable.operative_7;
        operative[8] = R.drawable.operative_8;
        operative[9] = R.drawable.operative_9;
        operative[10] = R.drawable.operative_10;
        operative[11] = R.drawable.operative_11;
        operative[12] = R.drawable.operative_12;
        operative[13] = R.drawable.operative_13;
        operative[14] = R.drawable.operative_14;
        operative[15] = R.drawable.operative_15;
        operative[16] = R.drawable.operative_16;
        operative[17] = R.drawable.operative_17;
        operative[18] = R.drawable.operative_18;
        operative[19] = R.drawable.operative_19;
        operative[20] = R.drawable.operative_20;

        sniper[0] = R.drawable.sniper_0;
        sniper[1] = R.drawable.sniper_1;
        sniper[2] = R.drawable.sniper_2;
        sniper[3] = R.drawable.sniper_3;
        sniper[4] = R.drawable.sniper_4;
        sniper[5] = R.drawable.sniper_5;
        sniper[6] = R.drawable.sniper_6;
        sniper[7] = R.drawable.sniper_7;
        sniper[8] = R.drawable.sniper_8;
        sniper[9] = R.drawable.sniper_9;
        sniper[10] = R.drawable.sniper_10;
        sniper[11] = R.drawable.sniper_11;
        sniper[12] = R.drawable.sniper_12;
        sniper[13] = R.drawable.sniper_13;
        sniper[14] = R.drawable.sniper_14;
        sniper[15] = R.drawable.sniper_15;
        sniper[16] = R.drawable.sniper_16;
        sniper[17] = R.drawable.sniper_17;
        sniper[18] = R.drawable.sniper_18;
        sniper[19] = R.drawable.sniper_19;
        sniper[20] = R.drawable.sniper_20;





        Bundle bundle = this.getArguments();
        ac = bundle.getInt("AC");
        fraction = bundle.getInt("Fraction");
        isSelected = bundle.getBooleanArray("Disciplines");
        if (isSelected == null) {
            isSelected = new boolean[21];

            Arrays.fill(isSelected, false);
        }else {
            for (int i = 0; i < 21; i++ ){
                if (isSelected[i]){

                    if (i<7) {
                        if (upa > 0) {

                            utilImg[i].setImageResource(R.drawable.lightsup);
                            upa--;
                            s++;


                        }
                    }else if (i>6 && i<14){
                        if (0<upa && upa<5 && s>2){

                            utilImg[i].setImageResource(R.drawable.lightsup);
                            upa--;
                            m++;

                        }
                    }else if (i>13){
                        if (upa>0 && upa <3 && (s+m>4)){

                            utilImg[i].setImageResource(R.drawable.lightsup);
                            upa--;


                        }
                    }

                }
            }
        }







        if (fraction==0){

            for (int i = 0; i<numberOfUtilities; i++){

              switch (ac){
                  case 0: utilBtn[i].setImageResource(guardian[i]);
                      break;
                  case 1: utilBtn[i].setImageResource(sentinel[i]);
                      break;
                  case 2: utilBtn[i].setImageResource(sage[i]);
                      break;
                  case 3: utilBtn[i].setImageResource(shadow[i]);
                      break;
                  case 4: utilBtn[i].setImageResource(commando[i]);
                      break;
                  case 5: utilBtn[i].setImageResource(vanguard[i]);
                      break;
                  case 6: utilBtn[i].setImageResource(scoundrel[i]);
                      break;
                  case 7: utilBtn[i].setImageResource(gunslinger[i]);
                      break;
                  default: utilBtn[i].setImageResource(guardian[i]);
                      break;

              }

            }

        }else if (fraction== 1){



            for (int i = 0; i<numberOfUtilities; i++){

                switch (ac){
                    case 0: utilBtn[i].setImageResource(juggernaut[i]);
                        break;
                    case 1: utilBtn[i].setImageResource(marauder[i]);
                        break;
                    case 2: utilBtn[i].setImageResource(sorcerer[i]);
                        break;
                    case 3: utilBtn[i].setImageResource(assassin[i]);
                        break;
                    case 4: utilBtn[i].setImageResource(mercenery[i]);
                        break;
                    case 5: utilBtn[i].setImageResource(powertech[i]);
                        break;
                    case 6: utilBtn[i].setImageResource(operative[i]);
                        break;
                    case 7: utilBtn[i].setImageResource(sniper[i]);
                        break;
                    default: utilBtn[i].setImageResource(juggernaut[i]);
                        break;

                }

            }


        }






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




                CustomDialog descriptionDialog = new CustomDialog(getActivity(),fraction,3, i);
                descriptionDialog.setCancelable(true);

                descriptionDialog.show();


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
