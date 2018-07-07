package com.example.fujimoto_t.play1212;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Navigation_Mypage extends Fragment {

    public static Navigation_Mypage newInstance() {
        Navigation_Mypage fragment = new Navigation_Mypage();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_mypage, container, false);
    }
}
