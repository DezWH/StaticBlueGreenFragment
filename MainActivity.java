/*
Week 5
Programmer: Dannez Hunter
Dated September 15, 2017
Purpose: Fragements Design
 */

package com.dez.staticbluegreenfragment;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Create instance of our two fragments
    private GreenFragment greenFragment = new GreenFragment();
    private BlueFragment bludFragment = new BlueFragment();

    //Used to label the currnet Fragment dissplayed
    private static final String BLUE_TAG="BLUE";
    private static final String GREEN_TAG = "GREEN";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateFragment(); //Initial update

        //add click listener to main window
        //android.R.id.conten is a built-in reference to your Activity
        View v = findViewById(android.R.id.content);
        v.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateFragment();

            }
        });
    }
    private void updateFragment(){

    }
}

private void updateFragment(){
    //Get the reference to this Activity fragmentMager
}