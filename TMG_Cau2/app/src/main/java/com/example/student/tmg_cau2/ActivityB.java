package com.example.student.tmg_cau2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }

    public void OpenA(View v)
    {
        Intent intent = new Intent(this, ActivityA.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
