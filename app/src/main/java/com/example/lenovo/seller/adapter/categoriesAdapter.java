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
import com.example.lenovo.seller.list.categoriesList;
import com.example.lenovo.seller.view.home;
import com.example.lenovo.seller.view.products;

import java.util.ArrayList;

public class categoriesAdapter extends RecyclerView.Adapter<categoriesAdapter.categoriesHolder> {
    Context context;
    ArrayList<categoriesList>mylist;


    public categoriesAdapter(Context context, ArrayList<categoriesList> mylist) {
        this.context = context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public categoriesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.categoryitem,viewGroup,false);
        categoriesHolder categoriesHolder=new categoriesHolder(view);
        return categoriesHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull categoriesHolder viewHolder, int i) {
        viewHolder.categoryImg.setImageResource(mylist.get(i).getImg());
        viewHolder.title.setText(mylist.get(i).getTitle().toString());
        viewHolder.goToProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               v.getContext().startActivity(new Intent(context,products.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class categoriesHolder extends RecyclerView.ViewHolder {
        ImageView categoryImg;
        LinearLayout goToProducts;
        TextView title;
        public categoriesHolder(@NonNull View itemView) {
            super(itemView);
            categoryImg=(ImageView)itemView.findViewById(R.id.catimg);
            title=(TextView) itemView.findViewById(R.id.catttle);
            goToProducts=(LinearLayout)itemView.findViewById(R.id.goToProducts);
        }
    }
}
