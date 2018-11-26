package com.example.lenovo.seller.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.adapter.applicationsAdapter;
import com.example.lenovo.seller.interfaces.MVP;
import com.example.lenovo.seller.presenter.applicationsPresenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Applications extends Fragment implements MVP.interfaces.View {
    View view;
    RecyclerView ApplicationsList;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    applicationsPresenter applicationsPresenter;
    public Applications() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_applications, container, false);
        applicationsPresenter=new applicationsPresenter(this);
        applicationsPresenter.getData();
        return view;
    }

    @Override
    public void element() {
        ApplicationsList=(RecyclerView)view.findViewById(R.id.applicationslist);
    }

    @Override
    public void setviewdata(ArrayList data) {
       layoutManager=new LinearLayoutManager(getActivity());
       ApplicationsList.setLayoutManager(layoutManager);
       adapter=new applicationsAdapter(getActivity(),data);
       ApplicationsList.setAdapter(adapter);
    }
}
