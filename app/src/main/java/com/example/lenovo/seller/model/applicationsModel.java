package com.example.lenovo.seller.model;

import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.list.applicationslist;

import java.util.ArrayList;

public class applicationsModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<applicationslist>arrayList=new ArrayList<applicationslist>();
        arrayList.add(new applicationslist("محمد اسماعيل","150","0123456789","8"));
        arrayList.add(new applicationslist("محمد اسماعيل","150","0123456789","8"));
        return arrayList;
    }
}
