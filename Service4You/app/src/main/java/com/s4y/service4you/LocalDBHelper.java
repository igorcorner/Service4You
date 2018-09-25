package com.s4y.service4you;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.s4y.service4you.Entities.User;

/**
 * Created by boldi on 2018. 09. 10..
 */

public class LocalDBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";

    private static final String DATABASE_NAME = "Service4You.db";
    private static final int DATABASE_VERSION = 2;

    private static final String USER_INFO_TABLE = "User_table";
    private static final String USERNAME = "UserName";
    private static final String EMAIL = "Email";
    private static final String PASSWORD = "Password";
    private static final String USER_SURNAME = "Surname";
    private static final String USER_MIDDLENAME = "MiddleName";
    private static final String USER_POSTNUMBER = "PostNumber";
    private static final String USER_CITY = "City";
    private static final String USER_ADDRESS = "Address";
    private static final String USER_COUNTRY = "Country";
    private static final String USER_BIRTHDAY = "Birthday";
    private static final String USER_SEX = "Sex";
    private static final String USER_AVATAR = "Avatar";

    public LocalDBHelper(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + USER_INFO_TABLE+ "(UserName TEXT,Email TEXT,Password TEXT,Surname TEXT,MiddleName TEXT,PostNumber TEXT,City TEXT,Address TEXT," +
                "Country TEXT,Birthday TEXT,Sex INTEGER,FirtLogin INTEGER,Avatar INTEGER )");
    }

    public boolean addUser (User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValuesU = new ContentValues();
        contentValuesU.put(USERNAME, user.getUserName());
        contentValuesU.put(EMAIL,user.getEmail());
        contentValuesU.put(PASSWORD,user.getPassword());
        contentValuesU.put(USER_SURNAME,user.getSurName());
        contentValuesU.put(USER_MIDDLENAME,user.getMidName());
        contentValuesU.put(USER_POSTNUMBER,user.getPostNumber());
        contentValuesU.put(USER_CITY,user.getCity());
        contentValuesU.put(USER_ADDRESS,user.getAddress());
        contentValuesU.put(USER_COUNTRY, user.getCountry());
        contentValuesU.put(USER_BIRTHDAY, user.getBirthday());
        contentValuesU.put(USER_SEX, user.getSex());
        contentValuesU.put(USER_AVATAR, user.getAvatar());
        long UserResult = db.insert(USER_INFO_TABLE,null,contentValuesU);
        return UserResult !=1 ;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + USER_INFO_TABLE);
        onCreate(db);
    }
}
