package com.example.lenovo.seller.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.lenovo.seller.R;
import com.example.lenovo.seller.fragments.Applications;
import com.example.lenovo.seller.fragments.Home;
import com.example.lenovo.seller.fragments.back;
import com.example.lenovo.seller.fragments.settings;
import com.example.lenovo.seller.presenter.categoriesPresenter;

public class home extends AppCompatActivity  {
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
RecyclerView categoriesList;
    categoriesPresenter categoriesPresenter;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AddFragment();
        replace();

    }

public void AddFragment()
{
    Fragment main = new Home();
    getSupportFragmentManager().beginTransaction()
            .add(R.id.frag, main ).commit();
}
public void replace()
{
    bottomNavigationView=findViewById(R.id.nav);
    bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);

    bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            if(item.getItemId()==R.id.home)
            {

                Fragment Home = new Home();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, Home ).commit();
            }else if(item.getItemId()==R.id.settings)
            {
                Fragment settings = new settings();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, settings ).commit();
            }else if(item.getItemId()==R.id.applicationss)
            {
                Fragment Applications = new Applications();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, Applications ).commit();
            }else if(item.getItemId()==R.id.back)
            {
                Fragment back = new back();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag, back ).commit();
            }
            return true;
        }
    });
}



}
