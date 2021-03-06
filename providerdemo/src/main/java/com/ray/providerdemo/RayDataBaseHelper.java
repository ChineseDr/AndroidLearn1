package com.ray.providerdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class RayDataBaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "RayDataBaseHelper";
    static final String DATABASE_NAME = "book.db";
    public static final String TABLE_BOOK = "book";
    public static final String TABLE_CATEGORY = "category";
    private Context mContext;
    public static final String CREATE_BOOK = "create table book(_id integer primary key autoincrement," +
            "name text, author text, page integer, price integer)";
    public static final String CREATE_CATEGORY = "create table category(_id integer primary key autoincrement,"
            + "name text, code integer)";

    RayDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    public RayDataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK);
        db.execSQL(CREATE_CATEGORY);
        //Toast.makeText(mContext, TAG + "succeed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists book");
        db.execSQL("drop table if exists category");
        onCreate(db);
    }
}
