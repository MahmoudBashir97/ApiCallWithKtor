package com.ultimate_solution.viewpagerwithdotsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    DotsIndicator dot1;
    SpringDotsIndicator dot2;
    WormDotsIndicator dot3;
    ViewAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager=findViewById(R.id.view_pager);
        dot1=findViewById(R.id.dot1);
        dot2=findViewById(R.id.dot2);
        dot3=findViewById(R.id.dot3);

        viewAdapter=new ViewAdapter(this);
        viewPager.setAdapter(viewAdapter);
        dot1.setViewPager(viewPager);
        dot2.setViewPager(viewPager);
        dot3.setViewPager(viewPager);
    }
}