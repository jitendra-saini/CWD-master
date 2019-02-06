package com.example.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Mess_win extends AppCompatActivity {
 TextView textView;

    ArrayList<MyDataSet> arayList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess_win);

          textView=findViewById(R.id.textView4);





        Intent intent=getIntent();
         int Hname= intent.getIntExtra("postion",0);
          Log.e("name","name"+Hname);


          textView.setText(""+Hname);


    }
}
