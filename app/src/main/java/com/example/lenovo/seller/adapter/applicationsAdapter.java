package com.example.lenovo.seller.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.list.applicationslist;
import com.example.lenovo.seller.view.applicationDetails;

import java.util.ArrayList;

public class applicationsAdapter extends RecyclerView.Adapter<applicationsAdapter.applicationHolder> {
    Context context;
    ArrayList<applicationslist>mylist;
    String phone;

    public applicationsAdapter(Context context, ArrayList<applicationslist> mylist) {
        this.context = context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public applicationHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.applicationitem,viewGroup,false);
        applicationHolder applicationHolder=new applicationHolder(view);
        return applicationHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull applicationHolder viewHolder, int i) {
     viewHolder.name.setText(mylist.get(i).getName().toString());
     viewHolder.phoneNum.setText(mylist.get(i).getPhone().toString());
     viewHolder.price.setText(mylist.get(i).getPrice().toString());
     viewHolder.time.setText(mylist.get(i).getTime().toString());
     phone=viewHolder.phoneNum.getText().toString();
     viewHolder.phoneNum.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(Intent.ACTION_DIAL);
             intent.setData(Uri.parse("tel:"+phone));
             v.getContext().startActivity(intent);
         }
     });
        viewHolder.goToApplicationDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(context,applicationDetails.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
    public class applicationHolder extends RecyclerView.ViewHolder {
        TextView name,price,time,phoneNum;
        LinearLayout goToApplicationDetails;
        public applicationHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            price=(TextView)itemView.findViewById(R.id.price);
            time=(TextView)itemView.findViewById(R.id.time);
            phoneNum=(TextView)itemView.findViewById(R.id.phone);
            goToApplicationDetails=(LinearLayout)itemView.findViewById(R.id.applications);

        }
    }
}
