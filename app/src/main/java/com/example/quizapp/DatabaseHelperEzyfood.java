package com.example.quizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelperEzyfood extends SQLiteOpenHelper{

    private static final String DB_NAME = "EzyFood"; // nama databasenya
    private static final int DB_VERSION = 2; // versi databasenya

    DatabaseHelperEzyfood(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private static void insertItem(SQLiteDatabase db, String name, int quantity, int resID){
        ContentValues itemValues = new ContentValues();
        itemValues.put("Nama",name);
        itemValues.put("Quantity",quantity);
        itemValues.put("ResID",resID);
        db.insert("Item", null, itemValues);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion < 1){
            db.execSQL("CREATE TABLE Item ( _id INTEGER PRIMARY KEY AUTOINCREMENT, "+ "Nama TEXT, "+ "Quantity INTEGER, "+ "ResID INTEGER);");

        insertItem(db, "Air Mineral", 10, 1);
        insertItem(db, "Jus Apel", 10,1);
        insertItem(db, "Jus Mangga", 10,1);
        insertItem(db, "Jus Alpukat", 10,1);

        insertItem(db, "Indomie", 10,1);
        insertItem(db, "Salad Apel", 10,1);
        insertItem(db, "Salad Mangga", 10,1);
        insertItem(db, "Salad Alpukat", 10,1);

        insertItem(db, "Taro", 10,1);
        insertItem(db, "Cheetos", 10,1);
        insertItem(db, "Pringles", 10,1);
        insertItem(db, "Leo", 10,1);


            insertItem(db, "Air Mineral", 20, 2);
            insertItem(db, "Jus Apel", 20,2);
            insertItem(db, "Jus Mangga", 20,2);
            insertItem(db, "Jus Alpukat", 20,2);

            insertItem(db, "Indomie", 20,2);
            insertItem(db, "Salad Apel", 20,2);
            insertItem(db, "Salad Mangga", 20,2);
            insertItem(db, "Salad Alpukat", 20,2);

            insertItem(db, "Taro", 20,2);
            insertItem(db, "Cheetos", 20,2);
            insertItem(db, "Pringles", 20,2);
            insertItem(db, "Leo", 20,2);

        }
    }



}
