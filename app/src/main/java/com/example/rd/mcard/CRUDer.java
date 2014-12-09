package com.example.rd.mcard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RD on 1.10.2014.
 */
public class CRUDer {
    UserDBHelper helper;
    public CRUDer(Context context){
        helper = new UserDBHelper(context);
    }

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
        private static final String DATABASE_NAME = "mcard.db";
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

        public UserDBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CREATE_TABLE);
            } catch (android.database.SQLException e) {

            }


        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

        }
    }
}
