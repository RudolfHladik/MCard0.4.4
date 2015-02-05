package com.rudolfhladik.rd.disciplines;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/**
 * Created by RD on 1.10.2014.
 */
public class CRUDer {
    UserDBHelper helper;
    public CRUDer(Context context){
        helper = new UserDBHelper(context);
    }

    public long saveCharToDB(Char character){


        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserDBHelper.COLUMN_CHAR_NAME, character.charName);
        contentValues.put(UserDBHelper.COLUMN_CHAR_RACE, character.race);
        contentValues.put(UserDBHelper.COLUMN_CHAR_LEVEL, character.lvl);
        contentValues.put(UserDBHelper.COLUMN_CHAR_AC, character.advClass);
        contentValues.put(UserDBHelper.COLUMN_CHAR_ROLE, character.role);
        contentValues.put(UserDBHelper.COLUMN_CHAR_SPEC, character.specialization);
        contentValues.put(UserDBHelper.COLUMN_CHAR_FRACTION, character.fraction);
        contentValues.put(UserDBHelper.COLUMN_CHAR_GENDER, character.gender);
        contentValues.put(UserDBHelper.COLUMN_CHAR_AVATAR_URI, character.avatarUri.toString());
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS0, character.disciplines[0]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS1, character.disciplines[1]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS2, character.disciplines[2]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS3, character.disciplines[3]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS4, character.disciplines[4]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS5, character.disciplines[5]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS6, character.disciplines[6]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS7, character.disciplines[7]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS8, character.disciplines[8]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS9, character.disciplines[9]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS10, character.disciplines[10]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS11, character.disciplines[11]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS12, character.disciplines[12]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS13, character.disciplines[13]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS14, character.disciplines[14]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS15, character.disciplines[15]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS16, character.disciplines[16]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS17, character.disciplines[17]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS18, character.disciplines[18]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS19, character.disciplines[19]);
        contentValues.put(UserDBHelper.COLUMN_CHAR_DIS20, character.disciplines[20]);

        long r = database.insert(UserDBHelper.CHAR_TABLE_NAME, null, contentValues);



        return r;}

    public long saveUserToDB(User user){

        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserDBHelper.COLUMN_NAME_USER_ID, user.getUserID());
        contentValues.put(UserDBHelper.COLUMN_NAME_FIRST_NAME, user.getName());
        contentValues.put(UserDBHelper.COLUMN_NAME_SURNAME, user.getSurname());
        contentValues.put(UserDBHelper.COLUMN_NAME_EMAIL, user.getEmail());
        contentValues.put(UserDBHelper.COLUMN_NAME_PHONE, user.getPhone());
        contentValues.put(UserDBHelper.COLUMN_NAME_GID, user.getGoogleid());
        long id = db.insert(UserDBHelper.USER_TABLE_NAME, null, contentValues);
        db.close();
        return id;
    }
    public Char[] getCharFromDB(int fraction){
        SQLiteDatabase database = helper.getReadableDatabase();


        String rawQuery = "";

        if (fraction == 0){
             rawQuery = "Select *  from chars where fraction = 0;";
        }else {
             rawQuery = "Select *  from chars where fraction = 1;";
        }
        Cursor cursor = database.rawQuery(rawQuery, null);

        Char[] chars = null;
        int count = cursor.getCount();

        if ( count > 0 ){




//            Char char0 = new Char();
//            char0.charid = cursor.getInt(0);
//            char0.charName = cursor.getString(1);
//            char0.race = cursor.getInt(2);
//            char0.lvl = cursor.getInt(3);
//            char0.advClass = cursor.getInt(4);
//            char0.role = cursor.getInt(5);
//            char0.specialization = cursor.getInt(6);
//            char0.fraction = cursor.getInt(7);
//            char0.gender = cursor.getInt(8);
//
//            boolean[] disc = new boolean[21];
//            int bool;
//
//
//            for (int d =10; d < 30; d++){
//
//                bool = cursor.getInt(d);
//                if(bool == 0) {
//                    disc[d-10] = false;
//                }else {
//                    disc[d-10] = true;
//
//                }
//            }
//
//            char0.disciplines = disc;



            chars= new Char[count];




            for (int c = 0; c< count; c++){

                if (c== 0){
                    cursor.moveToFirst();

                }else {
                    cursor.moveToNext();
                }
                Char charn = new Char();
                charn.charid = cursor.getInt(0);
                charn.charName = cursor.getString(1);
                charn.race = cursor.getInt(2);
                charn.lvl = cursor.getInt(3);
                charn.advClass = cursor.getInt(4);
                charn.role = cursor.getInt(5);
                charn.specialization = cursor.getInt(6);
                charn.fraction = cursor.getInt(7);
                charn.gender = cursor.getInt(8);
                charn.avatarUri = Uri.parse(cursor.getString(9));

                boolean[] discn = new boolean[21];
                int booln;
                for (int n =10; n < 31; n++){

                    booln = cursor.getInt(n);
                    if(booln == 0) {
                        discn[n-10] = false;
                    }else {
                        discn[n-10] = true;

                    }
                }

                charn.disciplines = discn;

                chars[c] = charn;


            }


        }

        cursor.close();
     return chars;}

    public User getUserfromDB(){
        SQLiteDatabase db = helper.getReadableDatabase();
        User user = new User();
        String rawQuery = "Select *  from user;";
        Cursor cursor = db.rawQuery(rawQuery, null);
//        Cursor cursor = db.query(UserDBHelper.USER_TABLE_NAME, UserDBHelper.COLUMNS,
//                " userID = ?",
//                new String[] {"*"},null, null, null);
        if (cursor != null){
            cursor.moveToFirst();


            user.setUserID(cursor.getString(1));
            user.setName(cursor.getString(2));
            user.setSurname(cursor.getString(3));
            user.setEmail(cursor.getString(4));
            user.setPhone(cursor.getString(5));
            user.setGoogleid(cursor.getLong(6));
            cursor.close();
        }




        return user;
    }




    static class UserDBHelper extends SQLiteOpenHelper {


        private Context context;
        private static final String DATABASE_NAME = "swtor.db";
        private static final int DATABASE_VERSION = 1;
        private static final String USER_TABLE_NAME = "user";
        private static final String COLUMN_NAME_ID = "_ID";
        private static final String COLUMN_NAME_USER_ID = "userID";
        private static final String COLUMN_NAME_FIRST_NAME = "name";
        private static final String COLUMN_NAME_SURNAME = "surname";
        private static final String COLUMN_NAME_EMAIL = "email";
        private static final String COLUMN_NAME_PHONE = "phone";
        private static final String COLUMN_NAME_GID = "googleid";
        private static final String[] COLUMNS = {COLUMN_NAME_ID, COLUMN_NAME_USER_ID, COLUMN_NAME_FIRST_NAME, COLUMN_NAME_SURNAME, COLUMN_NAME_EMAIL, COLUMN_NAME_PHONE, COLUMN_NAME_GID};

        private static final String CREATE_TABLE = "CREATE TABLE " + USER_TABLE_NAME
                + " (" + COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                + COLUMN_NAME_USER_ID + " VARCHAR(15), "
                + COLUMN_NAME_FIRST_NAME + " VARCHAR(50), "
                + COLUMN_NAME_SURNAME + " VARCHAR(50), "
                + COLUMN_NAME_EMAIL + " VARCHAR(50), "
                + COLUMN_NAME_PHONE + " VARCHAR(50), "
                + COLUMN_NAME_GID + " BIGINT );";

        private static final String CHAR_TABLE_NAME = "chars";
        private static final String COLUMN_CHAR_ID = "charid";
        private static final String COLUMN_CHAR_NAME = "name";
        private static final String COLUMN_CHAR_RACE = "race";
        private static final String COLUMN_CHAR_LEVEL = "level";
        private static final String COLUMN_CHAR_AC = "ac";
        private static final String COLUMN_CHAR_ROLE = "role";
        private static final String COLUMN_CHAR_SPEC = "spec";
        private static final String COLUMN_CHAR_FRACTION = "fraction";
        private static final String COLUMN_CHAR_GENDER = "gender";
        private static final String COLUMN_CHAR_AVATAR_URI = "avataruri";
        private static final String COLUMN_CHAR_DIS0 = "dis0";
        private static final String COLUMN_CHAR_DIS1 = "dis1";
        private static final String COLUMN_CHAR_DIS2 = "dis2";
        private static final String COLUMN_CHAR_DIS3 = "dis3";
        private static final String COLUMN_CHAR_DIS4 = "dis4";
        private static final String COLUMN_CHAR_DIS5 = "dis5";
        private static final String COLUMN_CHAR_DIS6 = "dis6";
        private static final String COLUMN_CHAR_DIS7 = "dis7";
        private static final String COLUMN_CHAR_DIS8 = "dis8";
        private static final String COLUMN_CHAR_DIS9 = "dis9";
        private static final String COLUMN_CHAR_DIS10 = "dis10";
        private static final String COLUMN_CHAR_DIS11 = "dis11";
        private static final String COLUMN_CHAR_DIS12 = "dis12";
        private static final String COLUMN_CHAR_DIS13 = "dis13";
        private static final String COLUMN_CHAR_DIS14 = "dis14";
        private static final String COLUMN_CHAR_DIS15 = "dis15";
        private static final String COLUMN_CHAR_DIS16 = "dis16";
        private static final String COLUMN_CHAR_DIS17 = "dis17";
        private static final String COLUMN_CHAR_DIS18 = "dis18";
        private static final String COLUMN_CHAR_DIS19 = "dis19";
        private static final String COLUMN_CHAR_DIS20 = "dis20";




        private static final String CREATE_CHARS_TABLE =

                "CREATE TABLE " + CHAR_TABLE_NAME + " ("
                + COLUMN_CHAR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                + COLUMN_CHAR_NAME + " VARCHAR(20), "
                + COLUMN_CHAR_RACE + " INT(11), "
                + COLUMN_CHAR_LEVEL + " INT(11), "
                + COLUMN_CHAR_AC + " INT(11), "
                + COLUMN_CHAR_ROLE + " INT(11), "
                + COLUMN_CHAR_SPEC + " INT(11), "
                + COLUMN_CHAR_FRACTION + " INT(11), "
                + COLUMN_CHAR_GENDER + " INT(11), "
                + COLUMN_CHAR_AVATAR_URI + " VARCHAR(1000), "
                + COLUMN_CHAR_DIS0 + " INT(1), "
                + COLUMN_CHAR_DIS1 + " INT(1), "
                + COLUMN_CHAR_DIS2 + " INT(1), "
                + COLUMN_CHAR_DIS3 + " INT(1), "
                + COLUMN_CHAR_DIS4 + " INT(1), "
                + COLUMN_CHAR_DIS5 + " INT(1), "
                + COLUMN_CHAR_DIS6 + " INT(1), "
                + COLUMN_CHAR_DIS7 + " INT(1), "
                + COLUMN_CHAR_DIS8 + " INT(1), "
                + COLUMN_CHAR_DIS9 + " INT(1), "
                + COLUMN_CHAR_DIS10 + " INT(1), "
                + COLUMN_CHAR_DIS11 + " INT(1), "
                + COLUMN_CHAR_DIS12 + " INT(1), "
                + COLUMN_CHAR_DIS13 + " INT(1), "
                + COLUMN_CHAR_DIS14 + " INT(1), "
                + COLUMN_CHAR_DIS15 + " INT(1), "
                + COLUMN_CHAR_DIS16 + " INT(1), "
                + COLUMN_CHAR_DIS17 + " INT(1), "
                + COLUMN_CHAR_DIS18 + " INT(1), "
                + COLUMN_CHAR_DIS19 + " INT(1), "
                + COLUMN_CHAR_DIS20 + " INT(1) );";


        public UserDBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CREATE_TABLE);
                db.execSQL(CREATE_CHARS_TABLE);
            } catch (android.database.SQLException e) {

            }


        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i2) {
            db.execSQL("DROP TABLE IF EXISTS " + CHAR_TABLE_NAME );
            onCreate(db);
        }
    }
}
