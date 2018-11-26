package com.example.lenovo.seller.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.list.productList;

import java.util.ArrayList;

public class productAdapter extends RecyclerView.Adapter<productAdapter.productHolder> {
    Context context;
    ArrayList<productList>mylist;

    public productAdapter(Context context, ArrayList<productList> mylist) {
        this.context = context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public productHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.productitem,viewGroup,false);
        productHolder productHolder=new productHolder(view);
        return productHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productHolder viewHolder, int i) {
     viewHolder.productImage.setImageResource(mylist.get(i).getImg());
     viewHolder.productTitle.setText(mylist.get(i).getTitle().toString());
     viewHolder.productPrice.setText(mylist.get(i).getPrice().toString());
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
    public class productHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productTitle,productPrice;
        public productHolder(@NonNull View itemView) {
            super(itemView);
            productImage=(ImageView)itemView.findViewById(R.id.productimg);
            productTitle=(TextView)itemView.findViewById(R.id.productttle);
            productPrice=(TextView)itemView.findViewById(R.id.productprice);
        }
    }
}
