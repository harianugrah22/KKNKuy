package com.example.user.kknkuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by user on 06/04/2018.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    String[] titles=new String[]{"Home","Pengumuman","Oprec"};

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle(int position){
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                FragmentHome home = new FragmentHome();
                return home;
            case 1:
                FragmentPengumuman pengumuman = new FragmentPengumuman();
                return pengumuman;
            case 2:
                FragmenOprec oprec = new FragmenOprec();
                return oprec;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
