package com.rudolfhladik.rd.disciplines;



import java.util.Arrays;

/**
 * Created by RD on 14.1.2015.
 */
public class Char {
    //race 1: human, 2: twillek, 3: zabrak, 4: sith, 5: mirluka, 6:chiss, 7:cathar 8:cyborg 9: mirialan 10: rattataki
    //     0: torguta
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
    public static String sorcerer = "orcerer";
    public static String assassin = "Assassin";
    public static String mercenary = "Mercenary";
    public static String powertech = "Powertech";
    public static String operative = "Operative";
    public static String sniper = "Sniper";

    // roles: 1: tank, 2: dps, 3: healer

    public static String tank = "Tank";
    public static String dps = "DPS";
    public static String heal = "Healer";



    protected int race;
    public String charName;
    protected int lvl;
    // REP Advanced classes: 11: guardian, 12: sentinel, 13: sage, 14: shadow, 15: commando, 16: vanguard, 17: scoundrel, 18: gunslinger
    // IMP Advanced classes: 21: juggernaut, 22: marauder, 13: sorcerer, 14: assassin, 15: mercenarz, 16: powertech, 17: operative, 18: sniper
    protected int advClass;
    // roles: 1: tank, 2: dps, 3: healer
    protected int role;
    // spec 1: pvp, 2: pve
    protected int specialization;
    // side 1: REP, 2: IMP
    protected int fraction;
    //gender 0: female 1: male  ofc :)
    protected int gender;
    // disciplines[skillful, masterful, heroic][points]
    protected boolean[] disciplines = new boolean[21];

    public Char(int race, String charName, int lvl, int advClass, int role, int specialization, int fraction, int gender){
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

        this.race = 0;
        this.charName = "noname";
        this.lvl = 0;
        this.advClass = 0;
        this.role = 0;
        this.specialization = 0;
        this.fraction = 0;
        this.gender = 0;
        Arrays.fill(disciplines, false);

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
        String aC;

        // REP Advanced classes: 11: guardian, 12: sentinel, 13: sage, 14: shadow, 15: commando, 16: vanguard, 17: scoundrel, 18: gunslinger
        // IMP Advanced classes: 21: juggernaut, 22: marauder, 13: sorcerer, 14: assassin, 15: mercenarz, 16: powertech, 17: operative, 18: sniper

        switch(advClass){
            case 11: aC = guardian;
                    break;
            case 12: aC = sentinel;
                break;
            case 13: aC = sage;
                break;
            case 14: aC = shadow;
                break;
            case 15: aC = commando;
                break;
            case 16: aC = vanguard;
                break;
            case 17: aC = scoundrel;
                break;
            case 18: aC = gunslinger;
                break;
            case 21: aC = juggernaut;
                break;
            case 22: aC = marauder;
                break;
            case 23: aC = sorcerer;
                break;
            case 24: aC = assassin;
                break;
            case 25: aC = mercenary;
                break;
            case 26: aC = powertech;
                break;
            case 27: aC = operative;
                break;
            case 28: aC = sniper;
                break;
            default: aC = human;
                break;

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
            default: mSpec = "PvP";
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
}
