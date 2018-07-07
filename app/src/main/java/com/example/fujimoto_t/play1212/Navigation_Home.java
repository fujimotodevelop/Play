package com.example.fujimoto_t.play1212;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Navigation_Home extends Fragment {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    public static Navigation_Home newInstance() {
        Navigation_Home fragment = new Navigation_Home();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_home, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        return view;
    }


    public static class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private static final int NUM_ITEMS = 3;

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return Fragment_New.newInstance();
            }
            else if(position == 1){
                return Fragment_Ranking.newInstance();
            }
            else {
                return Fragment_Pickup.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position == 0){
                return "New!";
            }
            else if(position == 1){
                return "Ranking";
            }
            else {
                return "Pickup!";
            }
        }
    }
}