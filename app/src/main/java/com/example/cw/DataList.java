package com.example.cw;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DataList extends AppCompatActivity {
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);



        dbManager =new DBManager(this);
        Cursor cursor=dbManager.fetch();
    }
}
