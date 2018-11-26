package com.example.lenovo.seller.presenter;

import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.model.categoriesModel;

import java.util.ArrayList;

public class categoriesPresenter implements MVP.interfaces.presenter {
    private MVP.interfaces.Model model;
    private MVP.interfaces.View views;


    public categoriesPresenter(MVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new categoriesModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }
}
