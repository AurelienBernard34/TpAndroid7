package com.example.admin.tpandroid7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by admin on 12/06/2017.
 */

public class Activity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        //recuperation du param
        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText = ((TextView) findViewById(R.id.editText));
        editText.setText(texte);
    }
}
