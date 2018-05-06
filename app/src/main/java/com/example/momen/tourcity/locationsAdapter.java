package com.example.momen.tourcity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class locationsAdapter extends FragmentPagerAdapter {

    public locationsAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        }
        else if (position == 1){
            return new ResturantFragment();
        }
        else if (position == 2){
            return new PlacesFragment();
        }
        else return new ServicesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
