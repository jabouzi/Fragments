package com.skanderjabouzi.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText, String bottomImageText) {
        BottomFragment bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottom_fragment);
        bottomFragment.showText(topImageText, bottomImageText);
    }
}
