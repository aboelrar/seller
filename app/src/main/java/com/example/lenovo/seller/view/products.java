package com.example.lenovo.seller.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.adapter.productAdapter;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.presenter.productPresenter;

import java.util.ArrayList;

public class products extends AppCompatActivity implements MVP.interfaces.View {
RecyclerView productList;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
    productPresenter productPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_products);
        productPresenter=new productPresenter(this);
        productPresenter.getData();
    }

    @Override
    public void element() {
productList=(RecyclerView)findViewById(R.id.productList);
    }

    @Override
    public void setviewdata(ArrayList data) {
   layoutManager=new LinearLayoutManager(products.this);
   productList.setLayoutManager(layoutManager);
   adapter=new productAdapter(this,data);
   productList.setAdapter(adapter);
    }
}
