package com.example.apoteksibalian;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import FragementProfile.ProfileFragement;
import FragmentMedicine.MedicineFragment;
import FragmentOrder.OrderFragment;

public class MainActivity extends AppCompatActivity{

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,new MedicineFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.navigation_med:
                            selectFragment = new MedicineFragment();
                            break;
                        case R.id.navigation_order:
                            selectFragment = new OrderFragment();
                            break;
                        case R.id.navigation_profile:
                            selectFragment = new ProfileFragement();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,selectFragment).commit();
                    return true;
                }
            };
}
