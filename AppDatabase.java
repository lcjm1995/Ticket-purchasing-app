package net.androidbootcamp.finalappdesign;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by laure on 10/04/2017.
 */

public class AppDatabase extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "app.db";

    public AppDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //table columns and names
    String CREATE_TABLE_TICKETS = "CREATE TABLE" + tickets.TABLE + "("
            + tickets.KEY_REGION + "STRING PRIMARY KEY AUTOINCREMENT ,"
            + tickets.KEY_TICKET_TYPE + "STRING )";

            db.execSQL(CREATE_TABLE_TICKETS);

}
    String CREATE_TABLE_USERS = "CREATE TABLE" + User.TABLE + "("
            + User.KEY_EMAIL + "TEXT PRIMAY KEY AUTOINCREMENET, "
            + User.KEY_PASSWORD + " TEXT,"
            + User.KEY_NAME + "TEXT )";

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

            db.execSQL(CREATE_TABLE_USERS);


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_TICKETS);
        //creating more tables
        onCreate(db);
    }
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "UserCredentials"
    private static final String USER_CREDNTIALS = "users"
    //table columns and names
    private static final String KEY_NAME = "name";
    private static final String KEY_USEREMAIL = "email";
    private static final String KEY_PASSWORD = "password";
    public AppDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
