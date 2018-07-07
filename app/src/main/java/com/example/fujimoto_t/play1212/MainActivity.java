package com.example.fujimoto_t.play1212;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.IdRes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import it.sephiroth.android.library.bottomnavigation.BottomNavigation;

public class MainActivity extends AppCompatActivity {

    private BottomNavigation BottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView = (BottomNavigation) findViewById(R.id.navigation);
        BottomNavigationView.setOnMenuItemClickListener(new BottomNavigation.OnMenuItemSelectionListener() {
            @Override
            public void onMenuItemSelect(@IdRes int i, int i1, boolean b) {
                switch (i1) {
                    case 0:
                        replaceFragment(Navigation_Home.newInstance());//Fragmentを入れ替える
                        break;
                    case 1:
                        replaceFragment(Navigation_Search.newInstance());//Fragmentを入れ替える
                        break;
                    case 2:
                        replaceFragment(Navigation_Mypage.newInstance());//Fragmentを入れ替える
                        break;
                }
            }
            @Override
            public void onMenuItemReselect(@IdRes int i, int i1, boolean b) {
            }
        });

        addFragment(Navigation_Home.newInstance());//最初はadd

    }

    private void addFragment(Fragment newFragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, newFragment).commit();
    }

    private void replaceFragment(Fragment newFragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, newFragment).commit();//R.id.fragment_containerのを代える
    }
}
