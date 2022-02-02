package com.alpesh.swipetablayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar tol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tol=(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(tol);

       tabLayout=(TabLayout) findViewById(R.id.MyTablayout);
        viewPager=(ViewPager) findViewById(R.id.MyViewPager);
        tabLayout.setupWithViewPager(viewPager);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentAdapter.addFragment(new Fragment1(),"PAGE 1");
        fragmentAdapter.addFragment(new Fragment2(),"PAGE 2");
        fragmentAdapter.addFragment(new Fragment3(),"PAGE 3");
        viewPager.setAdapter(fragmentAdapter);


    }


}