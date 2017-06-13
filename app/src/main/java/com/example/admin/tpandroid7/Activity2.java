package com.example.admin.tpandroid7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 12/06/2017.
 */

public class Activity2 extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        final Button reco = (Button) findViewById(R.id.button3);

        //recuperation de l'intent
        Intent intent = getIntent();
        int index = intent.getIntExtra("score",0);
        int total = intent.getIntExtra("total", 0);
        TextView editText = ((TextView) findViewById(R.id.editText));
        editText.setText("votre score "+index+"/"+total);

        reco.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }

}
