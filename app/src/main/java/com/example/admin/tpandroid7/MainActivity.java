package com.example.admin.tpandroid7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("BOUTON", "Bouton2");
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("param", "Faux c'est moche le bleu");
                startActivity(intent);
            }

        });
    }

    public void bouton1 (View view){
        Log.d("Bouton", "Bouton1");
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        intent.putExtra("param","Bravo j'adore le vert aussi !");
        startActivity(intent);
    };

}
