package com.master.henda.mes_etudes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inscrit_Etudiant extends AppCompatActivity {


    private Button btnRegister;
    private Button btnLinkToLoginScreen;
    private EditText inputCIN;
    private EditText inputNumTel;
    private EditText inputpassword;
    private EditText inputconfirm_mdp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrit__etudiant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inputCIN = (EditText) findViewById(R.id.CIN);
        inputNumTel = (EditText) findViewById(R.id.NumTel);
        inputpassword = (EditText) findViewById(R.id.password);
        inputconfirm_mdp = (EditText) findViewById(R.id.confirm_mdp);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnLinkToLoginScreen = (Button) findViewById(R.id.btnLinkToLoginScreen);


        // Link to Login Screen
        btnLinkToLoginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Authentification_Etudiant.class);
                startActivity(i);
                finish();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_inscrit_etudiant, menu);


        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {

            // Respond to the action bar's Up/Home button
            //case android.R.id.home:
            //  NavUtils.navigateUpFromSameTask(this);
            //return true;

            case R.id.action_authentifier:
                authentifier();
                return true;

            case R.id.action_deconnexion:
                // action_deconnexion
                deconnexion();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Launching new activity
     * */
    private void authentifier() {

        Intent i=new Intent(Inscrit_Etudiant.this, Authentification_Etudiant.class);

        startActivity(i);

    }



    private void deconnexion() {

        Toast.makeText(getApplicationContext(),
                "AUrevoir", Toast.LENGTH_LONG)
                .show();

        Inscrit_Etudiant.this.finish();



    }


}