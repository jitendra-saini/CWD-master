package com.example.cw;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBManager


{

    private Mydb mydb;
    private Context context;
    private SQLiteDatabase sqLiteDatabase;


    public DBManager(Context context) {
        this.context = context;
    }




    public DBManager open(){
        mydb=new Mydb(context);
        sqLiteDatabase=mydb.getWritableDatabase();
        return this;


    }
    public void close(){

        mydb.close();
        }

    public void insert(String name,String info){

        ContentValues contentValues=new ContentValues();
        contentValues.put(Mydb.NAME,name);
        contentValues.put(Mydb.INFO,info);
        sqLiteDatabase.insert(Mydb.TABLE_NAME,null,contentValues);
      }
     
}
