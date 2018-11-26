package com.example.lenovo.seller.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.adapter.categoriesAdapter;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.presenter.categoriesPresenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements MVP.interfaces.View {
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView categoriesList;
    com.example.lenovo.seller.presenter.categoriesPresenter categoriesPresenter;
    View view;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        view= inflater.inflate(R.layout.fragment_home, container, false);
        categoriesPresenter=new categoriesPresenter(this);
        categoriesPresenter.getData();
        return view;
    }

    @Override
    public void element() {
        categoriesList=(RecyclerView)view.findViewById(R.id.categorieslist);
    }

    @Override
    public void setviewdata(ArrayList data) {
        layoutManager=new GridLayoutManager(getActivity(),4);
        categoriesList.setLayoutManager(layoutManager);
        adapter=new categoriesAdapter(getActivity(),data);
        categoriesList.setAdapter(adapter);
    }
}
