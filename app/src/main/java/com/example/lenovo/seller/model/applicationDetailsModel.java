package com.example.lenovo.seller.model;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.list.applicationDetailsList;
import com.example.lenovo.seller.list.productList;

import java.util.ArrayList;

public class applicationDetailsModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<applicationDetailsList>arrayList=new ArrayList<applicationDetailsList>();
        arrayList.add(new applicationDetailsList(R.drawable.shoess,"حزاء اديداس","14 ريال","5"));
        arrayList.add(new applicationDetailsList(R.drawable.shoess,"حزاء اديداس","14 ريال","5"));
        arrayList.add(new applicationDetailsList(R.drawable.shoess,"حزاء اديداس","14 ريال","5"));


        return arrayList;
    }
}