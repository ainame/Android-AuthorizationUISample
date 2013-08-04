package jp.ainame.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import jp.ainame.fragment.WalkthroguhFragment;

public class WalkthroughFragmentAdapter extends FragmentPagerAdapter {
    public static final int PAGE_COUNT = 2;

    public WalkthroughFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    
    @Override
    public Fragment getItem(int position) {
        if (position == PAGE_COUNT -1) {
            return WalkthroguhFragment.createConfirmFragment();            
        }
        else {
            return WalkthroguhFragment.createDescriptionFragment(position);            
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
