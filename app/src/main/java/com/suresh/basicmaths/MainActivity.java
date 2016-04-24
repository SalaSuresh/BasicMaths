package com.suresh.basicmaths;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button_Beginner, button_Intermediate, button_Expert;
    Typeface font, font2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MenuFragment menu_fragment = new MenuFragment();
        fragmentTransaction.replace(android.R.id.content, menu_fragment);
        fragmentTransaction.commit();
    }
}
