
package com.bolaah.eko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bolaah.eko.R;


public class MuseumActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MuseumFragment())
                .commit();
    }

}