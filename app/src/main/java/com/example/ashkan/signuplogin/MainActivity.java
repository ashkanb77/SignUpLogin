 package com.example.ashkan.signuplogin;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

 public class MainActivity extends AppCompatActivity {

     private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);


        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);

        ViewPager viewPager=(ViewPager)findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(viewPager);

        adapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
