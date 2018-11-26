package com.example.lenovo.seller.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.adapter.productAdapter;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.presenter.backPresenter;
import com.example.lenovo.seller.presenter.productPresenter;
import com.example.lenovo.seller.view.products;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class back extends Fragment implements MVP.interfaces.View {
    RecyclerView backlist;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    com.example.lenovo.seller.presenter.backPresenter backPresenter;
    View view;

    public back() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_back, container, false);
        backPresenter=new backPresenter(this);
        backPresenter.getData();
        return view;
    }
    @Override
    public void element() {
        backlist=(RecyclerView)view.findViewById(R.id.backlist);
    }

    @Override
    public void setviewdata(ArrayList data) {
        layoutManager=new LinearLayoutManager(getActivity());
        backlist.setLayoutManager(layoutManager);
        adapter=new productAdapter(getActivity(),data);
        backlist.setAdapter(adapter);
    }
}
