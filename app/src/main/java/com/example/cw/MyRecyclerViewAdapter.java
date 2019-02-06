package com.example.cw;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
Context context;
ArrayList<MyDataSet> arrayList=new ArrayList<>();


    public MyRecyclerViewAdapter(Context context,ArrayList<MyDataSet> arrayList) {
        this.context = context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(context).inflate(R.layout.chats_resource,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.textView.setText(arrayList.get(i).getContact());
        myViewHolder.imageView.setImageResource(arrayList.get(i).getImage());
        myViewHolder.textView1.setText(arrayList.get(i).getTime());
        myViewHolder.textView2.setText(arrayList.get(i).getNewMessage());



    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView= itemView.findViewById(R.id.card_view);
            textView=itemView.findViewById(R.id.contact_name);
            imageView=itemView.findViewById(R.id.circleImageView);
            textView1=itemView.findViewById(R.id.textView2);
            textView2=itemView.findViewById(R.id.new_message);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent=new Intent(context,Mess_win.class);
                    intent.putExtra("postion",getAdapterPosition());
                    context.startActivity(intent);
                }
            });

        }
    }
}
