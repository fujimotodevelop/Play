package com.example.fujimoto_t.play1212;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fujimoto_t on 2018/07/07.
 */

public class Fragment_Pickup extends Fragment{
    public static Fragment_Pickup newInstance() {
        Fragment_Pickup fragment = new Fragment_Pickup();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pickup, container, false);
    }
}
