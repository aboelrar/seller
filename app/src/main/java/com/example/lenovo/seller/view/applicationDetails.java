package com.example.lenovo.seller.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.adapter.applicationsDetailsAdapter;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.presenter.applicationDetailsPresenter;

import java.util.ArrayList;

public class applicationDetails extends AppCompatActivity implements MVP.interfaces.View {
RecyclerView applicationDetailsList;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
    applicationDetailsPresenter applicationDetailsPresenter;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_details);
    applicationDetailsPresenter=new applicationDetailsPresenter(this);
    applicationDetailsPresenter.getData();
    }

    @Override
    public void element() {
        applicationDetailsList=(RecyclerView)findViewById(R.id.applicationsdetailslist);
    }

    @Override
    public void setviewdata(ArrayList data) {
layoutManager=new LinearLayoutManager(this);
applicationDetailsList.setLayoutManager(layoutManager);
adapter=new applicationsDetailsAdapter(this,data);
applicationDetailsList.setAdapter(adapter);

    }
}
