package com.example.cw;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.List;

public class Add extends AppCompatActivity {
    DBManager dbManager;
    Button btn;
    List<Contact_Details> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final String[] from = new String[] {Mydb.ID,
                Mydb.NAME, Mydb.INFO };


        dbManager = new DBManager(this);
          btn=findViewById(R.id.button);
        dbManager.open();
        //Cursor cursor = dbManager.fetch();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //dbManager.delete(1);
               //    dbManager.delete_by_name("surya");
                dbManager.insert("jitendra","hey");
                dbManager.insert("manoj","hey");
                dbManager.insert("surya","hey");
                dbManager.insert("kali","hey");
                dbManager.insert("mahesh","hey");
                dbManager.insert("rahul","hey");
                dbManager.insert("jitendra","hey");
            }
        });

        Cursor D = dbManager.fetch();

       D.moveToFirst();

        while (!D.isAfterLast()) {
     // list.add(new Contact_Details(D.getString(1),D.getString(2)));
           String  Name = D.getString(1);
           String  Info =D.getString(2);
           Log.e("name",Name+"  "+ Info);

            D.moveToNext();

        }








    }
}
