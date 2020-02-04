package com.mubeen.adapterlistfirst;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Multan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multan);
    }
    public void Back(View view) {


        startActivity(new Intent(this, MainActivity.class));
        finish();

    }

}
