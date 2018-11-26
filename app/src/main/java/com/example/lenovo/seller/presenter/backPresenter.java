package com.example.lenovo.seller.presenter;

import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.model.backModel;
import com.example.lenovo.seller.model.productsModel;

import java.util.ArrayList;

public class backPresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public backPresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new backModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }}