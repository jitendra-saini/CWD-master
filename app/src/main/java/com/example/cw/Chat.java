package com.example.cw;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Chat extends Fragment {

    RecyclerView mrecyclerView;
    DBManager dbManager;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    SharedPreferences shared;
    ArrayList<MyDataSet> arrayList =new ArrayList<MyDataSet>();
    private ArrayList<Contact_Details> listStudent = new ArrayList<Contact_Details>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view=inflater.inflate(R.layout.fragment_chat, container, false);

            //add temp data for Application
          //addData();
        addD();
        mrecyclerView=view.findViewById(R.id.chat_recycler_view);

        //using a linear layout manager
        layoutManager=new LinearLayoutManager(view.getContext());
        mrecyclerView.setLayoutManager(layoutManager);

        //specify a adapter



       dbManager=new DBManager(getContext());
       dbManager.open();
       dbManager.insert("jitendra","hey");
       dbManager.insert("manoj","hey");
       dbManager.insert("surya","hey");
       dbManager.insert("kali","hey");
       dbManager.insert("mahesh","hey");
       dbManager.insert("rahul","hey");
       dbManager.insert("jitendra","hey");
        adapter=new MyRecyclerViewAdapter(getContext(),listStudent);
        mrecyclerView.setAdapter(adapter);
        return view;
    }
    public  ArrayList<Contact_Details> addD(){


        dbManager=new DBManager(getContext());
        dbManager.open();

        Cursor D = dbManager.fetch();


        D.moveToFirst();

        while (!D.isAfterLast()) {

           String  Name = D.getString(1);
           String  Info =D.getString(2);
           Log.e("name",Name+Info);
            listStudent.add(new Contact_Details(Name,Info));
            D.moveToNext();

        }
        return listStudent;
    }



public ArrayList<MyDataSet> addData(){





    arrayList.add(new MyDataSet("mahesh","today","2",R.drawable.thor));
    arrayList.add(new MyDataSet("Raju","today","1",R.drawable.thor));
    arrayList.add(new MyDataSet("Sunita","2 days ago","3",R.drawable.thor));
    arrayList.add(new MyDataSet("mangal","today","6",R.drawable.thor));
    arrayList.add(new MyDataSet("jamuna","today","0",R.drawable.thor));
    arrayList.add(new MyDataSet("mangesh","today","2",R.drawable.thor));
    arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.thor));
    arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.ic_launcher_background));
    arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.ic_launcher_background));
    arrayList.add(new MyDataSet("mahesh","today","0",R.drawable.ic_launcher_background));
    arrayList.add(new MyDataSet("mahesh","today","0",R.drawable.ic_launcher_background));
    return  arrayList;

}



}
