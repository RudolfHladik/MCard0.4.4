package com.rudolfhladik.rd.disciplines;



import android.content.res.Resources;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by RD on 14.1.2015.
 */
public class Char {
    //race 1: human, 2: twillek, 3: zabrak, 4: sith, 5: mirluka, 6:chiss, 7:cathar 8:cyborg 9: mirialan 10: rattataki
    //     0: torguta

   Bitmap bitmap;



    public static String human = "Human";
    public static String twillek = "Twilek";
    public static String zabrak = "Zabrak";
    public static String sith = "Sith pureblood";
    public static String miraluka = "Miraluka";
    public static String chiss = "Chiss";
    public static String cathar = "Cathar";
    public static String cyborg = "Cyborg";
    public static String mirialan = "Mirialan";
    public static String rattataki = "Rattataki";
    public static String torguta = "Torguta";

    // REP Advanced classes: 11: guardian, 12: sentinel, 13: sage, 14: shadow, 15: commando, 16: vanguard, 17: scoundrel, 18: gunslinger
    // IMP Advanced classes: 21: juggernaut, 22: marauder, 13: sorcerer, 14: assassin, 15: mercenarz, 16: powertech, 17: operative, 18: sniper


    public static String guardian = "Guardian";
    public static String sentinel = "Sentinel";
    public static String sage = "Sage";
    public static String shadow = "Shadow";
    public static String commando = "Commando";
    public static String vanguard = "Vanguard";
    public static String scoundrel = "Scoundrel";
    public static String gunslinger = "Gunslinger";

    public static String juggernaut = "Juggernaut";
    public static String marauder = "Marauder";
    public static String sorcerer = "Sorcerer";
    public static String assassin = "Assassin";
    public static String mercenary = "Mercenary";
    public static String powertech = "Powertech";
    public static String operative = "Operative";
    public static String sniper = "Sniper";

    // roles: 1: tank, 2: dps, 3: healer

    public static String tank = "Tank";
    public static String dps = "DPS";
    public static String heal = "Healer";


    public int charid;
    public int race;
    public String charName;
    public int lvl;
    // REP Advanced classes: 11: guardian, 12: sentinel, 13: sage, 14: shadow, 15: commando, 16: vanguard, 17: scoundrel, 18: gunslinger
    // IMP Advanced classes: 21: juggernaut, 22: marauder, 13: sorcerer, 14: assassin, 15: mercenarz, 16: powertech, 17: operative, 18: sniper
    public int advClass;
    // roles: 0: tank, 1: dps, 2: healer
    public int role;
    // spec 0: pvp, 1: pve
    public int enviroment;
    // spec 0 1 2
    public int specialization;
    // side 1: REP, 2: IMP
    public int fraction;
    //gender 0: female 1: male  ofc :)
    public int gender;
    // disciplines[skillful, masterful, heroic][points]
    public boolean[] disciplines = new boolean[21];



    public Uri avatarUri;

    public Char(int race, String charName, int lvl, int advClass, int role, int specialization, int fraction, int gender, Bitmap avatar){
        super();

        this.race = race;
        this.charName = charName;
        this.lvl = lvl;
        this.advClass = advClass;
        this.role = role;
        this.specialization = specialization;
        this.fraction = fraction;
        this.gender = gender;
        Arrays.fill(disciplines, false);

    }

    public  Char(){
        super();
        this.charid = 0;
        this.race = 0;
        this.charName = "noname";
        this.lvl = 0;
        this.advClass = 0;
        this.role = 0;
        this.specialization = 0;
        this.fraction = 0;
        this.gender = 0;
        Arrays.fill(disciplines, false);

        this.avatarUri = avatarUri;



    }

    public void setAvatarUri(Uri avatarUri) {
        this.avatarUri = avatarUri;
    }

    public Uri getAvatarUri() {
        return avatarUri;
    }

    public String getRace() {
        String sRace;
        //race 1: human, 2: twillek, 3: zabrak, 4: sith, 5: miraluka, 6:chiss, 7:cathar 8:cyborg 9: mirialan 10: rattataki
        //     0: torguta
        switch (race){
            case 0: sRace = torguta;
                break;
            case 1: sRace = human;
                break;
            case 2: sRace = twillek;
                break;
            case 3: sRace =zabrak;
                break;
            case 4: sRace = sith;
                break;
            case 5: sRace = miraluka;
                break;
            case 6: sRace = chiss;
                break;
            case 7: sRace = cathar;
                break;
            case 8: sRace = cyborg;
                break;
            case 9: sRace = mirialan;
                break;
            case 10: sRace = rattataki;
            break;
            default: sRace = torguta;
                break;


        }


        return sRace;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getAdvClass() {
        String aC = "";

        // REP Advanced classes: 11: guardian, 12: sentinel, 13: sage, 14: shadow, 15: commando, 16: vanguard, 17: scoundrel, 18: gunslinger
        // IMP Advanced classes: 21: juggernaut, 22: marauder, 13: sorcerer, 14: assassin, 15: mercenarz, 16: powertech, 17: operative, 18: sniper
        if (fraction == 0) {
            switch (advClass) {
                case 0:
                    aC = guardian;
                    break;
                case 1:
                    aC = sentinel;
                    break;
                case 2:
                    aC = sage;
                    break;
                case 3:
                    aC = shadow;
                    break;
                case 4:
                    aC = commando;
                    break;
                case 5:
                    aC = vanguard;
                    break;
                case 6:
                    aC = scoundrel;
                    break;
                case 7:
                    aC = gunslinger;
                    break;
            }
        } else {
            switch (advClass){
            case 0:
                aC = juggernaut;
                break;
            case 1:
                aC = marauder;
                break;
            case 2:
                aC = sorcerer;
                break;
            case 3:
                aC = assassin;
                break;
            case 4:
                aC = mercenary;
                break;
            case 5:
                aC = powertech;
                break;
            case 6:
                aC = operative;
                break;
            case 7:
                aC = sniper;
                break;
            default:
                aC = juggernaut;
                break;

        }
    }
        return aC;
    }

    public void setAdvClass(int advClass) {
        this.advClass = advClass;
    }

    public String getRole() {
        String mRole;

        switch (role){
            case 0: mRole = tank;
                break;
            case 1: mRole = dps;
                break;
            case 2: mRole = heal;
                break;
            default: mRole = tank;
                break;
        }

        return mRole;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getSpecialization() {
        String mSpec;

        switch (specialization){
            case 0: mSpec = "PvP";
                break;
            case 1: mSpec = "PvE";
                break;

            default: mSpec = "PVP";
                break;

        }

        return mSpec;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public String getFraction() {
        String fr;
        switch (fraction){
            case 0: fr = "Republic";
                break;
            case 1: fr = "Empire";
                break;
            default: fr = "Republic";
                break;

        }

        return fr;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean[] getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(boolean[] disciplines) {
        this.disciplines = disciplines;
    }

    public BitSet getDis(){
        BitSet dis = new BitSet(21);
        for (int i = 0; i < 21; i++){

            dis.set(i,disciplines[i]);

        }


    return dis;}

    public void setDis(BitSet dis){

        for (int i = 0; i< 21; i++) {
            disciplines[i] = dis.get(i) ;
        }
    }

    public void setEnviroment(int enviroment) {
        this.enviroment = enviroment;
    }


}
