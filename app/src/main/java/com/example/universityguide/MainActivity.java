package com.example.universityguide;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManagerNonConfig;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.universityguide.AccountFragment;
import com.example.universityguide.HomeFragment;
import com.example.universityguide.NotificationFragment;
import com.example.universityguide.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar =(Toolbar) findViewById(R.id.toolBar);
//        setSupportActionBar(toolbar);
//        TextView tvtitle = toolbar.findViewById(R.id.tv_head);
//        tvtitle.setText("University Guide");


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        Fragment android = new HomeFragment();
        this.setDefaulFragment(android);

        //I added this if statement to keep the selected fragment when rotating the device
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                    new HomeFragment()).commit();
//        }
    }

    private void setDefaulFragment(Fragment fragment){
        this.loadFragment(fragment);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            //getActionBar().setTitle("Hello world App");

                            break;
                        case R.id.nav_account:
                            selectedFragment = new AccountFragment();
                            break;
                        case R.id.nav_notification:
                            selectedFragment = new NotificationFragment();break;
                        case R.id.nav_setting:
                            selectedFragment = new Settings_Fragment();break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
      //  transaction.addToBackStack(null);
        transaction.commit();
    }
}