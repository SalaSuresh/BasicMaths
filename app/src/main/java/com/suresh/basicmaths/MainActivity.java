package com.suresh.basicmaths;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button_Beginner, button_Intermediate, button_Expert;
    Typeface font, font2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        font = Typeface.createFromAsset(getAssets(), "fonts/Socialize.ttf");
        font2 = Typeface.createFromAsset(getAssets(), "fonts/roboto.thin.ttf");
        button_Beginner = (Button) findViewById(R.id.button_beginner);
        button_Beginner.setTypeface(font2);
        button_Beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fr = new ModeBeginner();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_place, fr);
                fragmentTransaction.commit();
            }
        });
        button_Intermediate = (Button) findViewById(R.id.button_intermediate);
        button_Intermediate.setTypeface(font);
    }
}
