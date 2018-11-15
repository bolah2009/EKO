package com.bolaah.eko;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    final int PAGE_COUNT = 4;

    android.content.res.Resources  r;

    private String[] tabTitles;
private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, android.content.res.Resources  r) {
        super(fm);
        this.context = context;
        tabTitles = new String[] { r.getString(R.string.eko), r.getString(R.string.mall), r.getString(R.string.hotels), r.getString(R.string.museum) };

            }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EkoFragment();
        } else if (position == 1){
            return new MallFragment();
        } else if (position == 2){
            return new HotelsFragment();
        } else {
            return new MuseumFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
