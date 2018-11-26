package com.example.lenovo.seller.interfaces;

import java.util.ArrayList;

public interface MVP {
    public interface interfaces {
        interface  View
        {
            void element();
            void setviewdata(ArrayList data);
        }
        interface Model{
            ArrayList getdata();
        }
        interface presenter{
            void getData();
        }

    }
}
