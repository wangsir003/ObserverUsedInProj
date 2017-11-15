package com.example.wangsir.observerusedinproj;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.wangsir.observerusedinproj.adapter.MyFragmentPageAdapter;
import com.example.wangsir.observerusedinproj.fragment.FirstFragment;
import com.example.wangsir.observerusedinproj.fragment.FivethFragment;
import com.example.wangsir.observerusedinproj.fragment.ForthFragment;
import com.example.wangsir.observerusedinproj.fragment.SecondFragment;
import com.example.wangsir.observerusedinproj.fragment.SixthFragment;
import com.example.wangsir.observerusedinproj.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mContainer = (LinearLayout) findViewById(R.id.container);

//        FragmentUtils.addFragment(getSupportFragmentManager(),new FirstFragment(),R.id.container);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());
        fragments.add(new ForthFragment());
        fragments.add(new FivethFragment());
        fragments.add(new SixthFragment());

        MyFragmentPageAdapter adapter = new MyFragmentPageAdapter(getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(adapter);

//        mViewPager.setAdapter();
    }
}
