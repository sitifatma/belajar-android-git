package com.amikom.simpleapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Main2Activityfragment extends Fragment {

    private Button buttonDua;



//title bar atau action bar

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_main2_activityfragment, container, false);
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setTitle("Fragment");
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setSubtitle("First Fragment");
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //tombol back
        setHasOptionsMenu(true);
        buttonDua = (Button) view.findViewById(R.id.button1);
        return view;

    }

    @Override
    //tombol back
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);



    }

    //end of title bar atau action bar




}
