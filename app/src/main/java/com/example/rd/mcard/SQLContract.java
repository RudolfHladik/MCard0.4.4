package com.example.rd.mcard;

import android.provider.BaseColumns;

/**
 * Created by RD-Ultra on 3.9.2014.
 */
public class SQLContract {
        // To prevent someone from accidentally instantiating the contract class,
        // give it an empty constructor.
        public SQLContract() {}

        /* Inner class that defines the table contents */
        public static abstract class FeedEntry implements BaseColumns {
            public static final String TABLE_NAME = "user";
            public static final String COLUMN_NAME_USER_ID = "userid";
            public static final String COLUMN_NAME_FIRST_NAME = "name";
            public static final String COLUMN_NAME_SURNAME = "surname";
            public static final String COLUMN_NAME_EMAIL = "email";
            public static final String COLUMN_NAME_PHONE = "phone";
            public static final String COLUMN_NAME_GID = "googleid";

        }
    }

