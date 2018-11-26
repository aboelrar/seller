package com.example.lenovo.seller.model;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.list.categoriesList;

import java.util.ArrayList;

public class categoriesModel implements MVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<categoriesList>arrayList=new ArrayList<categoriesList>();
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        arrayList.add(new categoriesList(R.drawable.shoess,"احزيه"));
        return arrayList;
    }
}
