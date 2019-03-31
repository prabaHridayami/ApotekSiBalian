package com.example.apoteksibalian;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
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

        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_med:
                        Intent med = new Intent(MainActivity.this, MedicineFragment.class);
                        startActivity(med);
                        break;
                    case R.id.navigation_order:
                        Intent order = new Intent(MainActivity.this, OrderFragment.class);
                        startActivity(order);
                        break;
                    case R.id.navigation_profile:
                        Intent profile= new Intent(MainActivity.this, ProfileFragement.class);
                        startActivity(profile);
                        break;
                }
            }
        });
    }
}
