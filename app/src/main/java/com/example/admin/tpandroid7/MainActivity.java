package com.example.admin.tpandroid7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Création du questionnaire
    private VraiFaux[] questions = new VraiFaux[]{
            new VraiFaux("Quel est la capitale de l'Australie", "Canberra", "Sydney",true), //1
            new VraiFaux("10+5","5", "15", false), //2
            new VraiFaux("Quel est la capitale de la Nouvelle-Zelande","Nelson", "Wellington", false), //3
            new VraiFaux("Où peut-on trouver le panda ?","En Asie", "En Afrique", true), //4
            new VraiFaux("Quel animal est le roi de la jungle ?","La Gazelle", "Le Lion", false), //5
            new VraiFaux("À quelle température, l'eau se change-t-elle en gaz ?","90°", "100°", false), //6
            new VraiFaux("La Terre tourne autour du Soleil en 24 heures?","Faux", "Vrai", true), //7
            new VraiFaux("L'âne est un herbivore?","Oui", "Non", true), //8
            new VraiFaux("Le hérisson n'a pas de piquants sur le ventre.","Faux", "Vrai", false), //9
            new VraiFaux("Le cochon d'Inde est un rongeur.","Vrai", "Faux", true), //10

    };

    private int index = 0;
    private int resultat = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On recupère textview + bouttons

        final TextView questionTest = ((TextView) findViewById(R.id.textView2));
        final Button reponse1 = (Button) findViewById(R.id.button1);
        final Button reponse2 = (Button) findViewById(R.id.button2);

        questionTest.setText(questions[index].getQuestion());
        reponse1.setText(questions[index].getQuestion1());
        reponse2.setText(questions[index].getQuestion2());


        //Code executé si bouton 1 cliqué
        reponse1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(questions[index].isReponse())
                {
                    resultat++;
                }

                index++;

                if (index<questions.length) {

                    questionTest.setText(questions[index].getQuestion());
                    reponse1.setText(questions[index].getQuestion1());
                    reponse2.setText(questions[index].getQuestion2());
                }
                else //Boucle terminé on envoie le résultat a la deuxieme activité
                {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;
                    intent.putExtra("total", index);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

                }
            });



        //Code executé si bouton 2 cliqué
        reponse2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(!questions[index].isReponse())
                {
                    resultat++;
                }

                index++;

                if (index<questions.length) {

                    questionTest.setText(questions[index].getQuestion());
                    reponse1.setText(questions[index].getQuestion1());
                    reponse2.setText(questions[index].getQuestion2());
                }
                else //Boucle terminé on envoie le résultat a la deuxieme activité
                {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;
                    intent.putExtra("total", index);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

                }
        });


    }
}



