package com.ultimate_solution.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements sharingDataListener{

    sharingDataListener sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sh = this;
        sh.userInfo("Mahmoud", "Mobile Development Department");
    }

    @Override
    public void userInfo(String name, String department) {
        Toast.makeText(this, "name : "+name + " dept : "+department, Toast.LENGTH_SHORT).show();
    }
}