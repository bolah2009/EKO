
package com.bolaah.eko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MallActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MallFragment())
                .commit();


    }




}