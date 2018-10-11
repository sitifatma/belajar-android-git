package com.amikom.simpleapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class WithFragmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Fragment");
        setContentView(R.layout.activity_with_fragment_actovity);
        FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        FirstFragment FirstFragment = new FirstFragment();

        transaction.add(R.id.framelayout, FirstFragment);


        transaction.commit();


    }
}

