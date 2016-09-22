package com.skanderjabouzi.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sjabouzi on 22/09/16.
 */

public class BottomFragment extends Fragment {

    private TextView topText;
    private TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Read xml file and return View object.

        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        View view = inflater.inflate(R.layout.activity_bottom, container, false);

        topText = (TextView) view.findViewById(R.id.top_image_text);
        bottomText = (TextView) view.findViewById(R.id.bottom_image_text);

        return view;
    }


    public void showText(String topImageText, String bottomImageText) {
        topText.setText(topImageText);
        bottomText.setText(bottomImageText);
    }
}