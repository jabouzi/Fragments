package com.skanderjabouzi.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sjabouzi on 22/09/16.
 */

public class TopFragment extends Fragment {

    private EditText inputTopImageText;
    private EditText inputBottomImageText;

    private MainActivity mainActivity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        // Read xml file and return View object.

        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        View view = inflater.inflate(R.layout.activity_top, container, false);

        inputTopImageText = (EditText) view.findViewById(R.id.input_top_image_text);
        inputBottomImageText = (EditText) view.findViewById(R.id.input_bottom_image_text);

        Button applyButton = (Button) view.findViewById(R.id.button_apply);

        applyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                applyText();
            }
        });

        return view;
    }



    // Called when a fragment is first attached to its context.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }


    private void applyText() {
        String topText = this.inputTopImageText.getText().toString();
        String bottomText = this.inputBottomImageText.getText().toString();

        this.mainActivity.showText(topText, bottomText);
    }
}