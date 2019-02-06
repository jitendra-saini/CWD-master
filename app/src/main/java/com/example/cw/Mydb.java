package com.example.cw;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mydb extends SQLiteOpenHelper {
       //table name
   public static final String TABLE_NAME="Contacts";

   //table columns
    public static final String ID="id";
    public static final String NAME="name";
    public static final String INFO="info";


    //db name
    public static final String DB_NAME="FDB";
    //db version
    public static final int DB_VERSION=1;


    //create table


    public static final String CREATE_TABLE="create table"+TABLE_NAME+"("+ID+
            "INTEGER PRIMARY KEY AUTOINCREAMENT,"+NAME+"TEXT NOT NULL,"+INFO+"TEXT);";




    public Mydb(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
