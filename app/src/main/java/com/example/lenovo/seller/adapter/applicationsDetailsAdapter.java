package com.example.lenovo.seller.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.list.applicationDetailsList;

import java.util.ArrayList;

public class applicationsDetailsAdapter extends RecyclerView.Adapter<applicationsDetailsAdapter.applicationDetailsHolder>{
    Context context;
    ArrayList<applicationDetailsList>mylist;

    public applicationsDetailsAdapter(Context context, ArrayList<applicationDetailsList> mylist) {
        this.context = context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public applicationDetailsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.applicationdetailsitem,viewGroup,false);
        applicationDetailsHolder applicationDetailsHolder=new applicationDetailsHolder(view);
        return applicationDetailsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull applicationDetailsHolder viewHolder, int i) {
     viewHolder.productTitle.setText(mylist.get(i).getTitle().toString());
     viewHolder.productImage.setImageResource(mylist.get(i).getImg());
     viewHolder.productPrice.setText(mylist.get(i).getPrice().toString());
     viewHolder.Quantity.setText(mylist.get(i).getQuantity().toString());

    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class applicationDetailsHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productTitle,productPrice,Quantity;
        public applicationDetailsHolder(@NonNull View itemView) {
            super(itemView);
            productImage=(ImageView)itemView.findViewById(R.id.productimg);
            productTitle=(TextView)itemView.findViewById(R.id.productttle);
            productPrice=(TextView)itemView.findViewById(R.id.productprice);
            Quantity=(TextView)itemView.findViewById(R.id.quantity);
        }
    }
}
