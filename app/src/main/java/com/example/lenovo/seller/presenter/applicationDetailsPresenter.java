package com.example.lenovo.seller.presenter;

import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.model.applicationDetailsModel;
import com.example.lenovo.seller.model.applicationsModel;

import java.util.ArrayList;

public class applicationDetailsPresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public applicationDetailsPresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new applicationDetailsModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }}