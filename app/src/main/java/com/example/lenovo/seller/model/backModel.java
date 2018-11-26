package com.example.lenovo.seller.model;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.list.productList;

import java.util.ArrayList;

public class backModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<productList>arrayList=new ArrayList<productList>();
        arrayList.add(new productList(R.drawable.shoess,"حزاء اديداس","14 ريال"));
        arrayList.add(new productList(R.drawable.shoess,"حزاء اديداس","14 ريال"));
        return arrayList;
    }
}