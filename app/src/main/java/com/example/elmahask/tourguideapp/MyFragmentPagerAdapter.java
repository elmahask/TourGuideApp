package com.example.elmahask.tourguideapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    final int Number_Of_Fragment = 4;

    public MyFragmentPagerAdapter(Context ctxt, FragmentManager fm) {
        super(fm);
        context = ctxt;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlacesFragment();
            case 1:
                return new BeachesFragment();
            case 2:
                return new RestaurantFragment();
            case 3:
                return new InformationFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return Number_Of_Fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.places);
            case 1:
                return context.getString(R.string.beaches);
            case 2:
                return context.getString(R.string.restaurants);
            case 3:
                return context.getString(R.string.information);
        }
        return null;
    }
}
