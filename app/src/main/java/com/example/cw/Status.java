package com.example.cw;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Status extends Fragment {
    ArrayList<MyDataSet> arrayList =new ArrayList<MyDataSet>();
    RecyclerView recyclerView,recyclerView1;
    RecyclerView.LayoutManager layoutManager,layoutManager1;
    Status_recent_recycler_adapter adapter;
    Status_adapter adapter1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_status, container, false);


  recyclerView=view.findViewById(R.id.recent_recyclerView);
  recyclerView1=view.findViewById(R.id.viewed_recyclerView);
        //using a linear layout manager
        layoutManager=new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
      layoutManager1=new LinearLayoutManager(view.getContext());
      recyclerView1.setLayoutManager(layoutManager1);
        //specify a adapter
        adapter=new Status_recent_recycler_adapter(getContext(),arrayList);
        recyclerView.setAdapter(adapter);
        adapter1=new Status_adapter(getContext(),arrayList);
        recyclerView1.setAdapter(adapter1);



        addData();


return view;
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
