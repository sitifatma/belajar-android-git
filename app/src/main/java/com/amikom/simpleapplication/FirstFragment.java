package com.amikom.simpleapplication;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FirstFragment extends Fragment {
    //deklarasi tombol berfragment
    private Button buttonSatu;




    //  titlebar/actionbar
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setTitle("Fragment");
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setSubtitle("First Fragment");
        ((WithFragmentActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        buttonSatu = (Button) view.findViewById(R.id.button1);



        return view;


    }

    //end of  titlebar/actionbar


    //proses fragment
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            //Second Fragment
            public void onClick(View view) {
               Main2Activityfragment main2Activityfragment = new Main2Activityfragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.framelayout,main2Activityfragment)
                        //ganti fragment
                        .addToBackStack(null)
                        //simpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();

            }
        });

    }


}