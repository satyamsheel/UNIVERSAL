package com.example.universal.helperClass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.universal.UploadDocFrags.UploadDocFragmentFive;
import com.example.universal.UploadDocFrags.UploadDocFragmentFour;
import com.example.universal.UploadDocFrags.UploadDocFragmentOne;
import com.example.universal.UploadDocFrags.UploadDocFragmentThree;
import com.example.universal.UploadDocFrags.UploadDocFragmentTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                UploadDocFragmentOne uploadDocFragmentOne = new UploadDocFragmentOne();
                return uploadDocFragmentOne;
            case 1:
                UploadDocFragmentTwo uploadDocFragmentTwo = new UploadDocFragmentTwo();
                return  uploadDocFragmentTwo;
            case 2:
                UploadDocFragmentThree uploadDocFragmentThree = new UploadDocFragmentThree();
                return  uploadDocFragmentThree;
            case 3:
                UploadDocFragmentFour uploadDocFragmentFour = new UploadDocFragmentFour();
                return  uploadDocFragmentFour;
            case 4:
                UploadDocFragmentFive uploadDocFragmentFive = new UploadDocFragmentFive();
                return  uploadDocFragmentFive;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

