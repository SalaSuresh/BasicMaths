package com.suresh.basicmaths;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by sures on 4/24/2016.
 */
public class MenuFragment extends Fragment {
    Button button_Beginner, button_Intermediate, button_Expert;
    Typeface font, font2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Socialize.ttf");
        font2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/roboto.thin.ttf");
        button_Beginner = (Button) rootView.findViewById(R.id.button_beginner);
        button_Beginner.setTypeface(font2);
        button_Beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new BeginnerFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(android.R.id.content, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        button_Intermediate = (Button) rootView.findViewById(R.id.button_intermediate);
        button_Intermediate.setTypeface(font);
        return rootView;
    }
}
