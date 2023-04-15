package me.stickitdept.diycakedesign.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Instance extends SQLiteOpenHelper {

    public static final String DB_NAME = "Cakes.db";
    public static final int SCHEMA_VERSION = 1;

    public Instance(@Nullable Context context) {
        super(context, DB_NAME, null, SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Execute sql queries for creating tables
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Execute sql queries for dropping tables
    }
}
