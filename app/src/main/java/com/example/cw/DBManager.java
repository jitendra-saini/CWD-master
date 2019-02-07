package com.example.cw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DBManager


{

    private Mydb mydb;
    private Context context;
    private SQLiteDatabase sqLiteDatabase;


    public DBManager(Context context) {
        this.context = context;
    }





    //open database
    public DBManager open(){
        mydb=new Mydb(context);
        sqLiteDatabase=mydb.getWritableDatabase();
        return this;


    }

    //close the database
    public void close(){

        mydb.close();
        }
        //inserting values in database
    public void insert(String name,String info){

        ContentValues contentValues=new ContentValues();
        contentValues.put(Mydb.NAME,name);
        contentValues.put(Mydb.INFO,info);
        sqLiteDatabase.insert(Mydb.TABLE_NAME,null,contentValues);
      }


      //fetch data from database
      public Cursor fetch(){

        String[] columns=new String[]{Mydb.ID,Mydb.NAME,Mydb.INFO};
             Cursor cursor=sqLiteDatabase.query(Mydb.TABLE_NAME,columns,null,
                null,null,null,Mydb.NAME);
      if(cursor!=null){




          cursor.moveToFirst();
      }

        return cursor;
       }

         //update database
       public int update(long id,String name,String info){

           ContentValues contentValues=new ContentValues();
           contentValues.put(Mydb.NAME,name);
           contentValues.put(Mydb.INFO,info);
           int i =sqLiteDatabase.update(Mydb.TABLE_NAME,contentValues,Mydb.ID+"="+id,null);
           return i;


       }

      public void delete(long id){

           sqLiteDatabase.delete(Mydb.TABLE_NAME,Mydb.ID+"="+id,null);

      }
      public void delete_by_name(String name){


          sqLiteDatabase.delete(Mydb.TABLE_NAME,Mydb.NAME+"="+name,null);

      }

}
