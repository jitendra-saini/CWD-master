package com.example.cw;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Status_adapter extends RecyclerView.Adapter<Status_adapter.MyViewHolder> {
    Context context;
    ArrayList<MyDataSet> arrayList=new ArrayList<>();


    public Status_adapter(Context context, ArrayList<MyDataSet> arrayList) {
        this.context = context;
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public Status_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.status_view_resource,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Status_adapter.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
