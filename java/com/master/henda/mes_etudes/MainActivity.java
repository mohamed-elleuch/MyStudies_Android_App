package com.master.henda.mes_etudes;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_enseignant;
    private ImageButton btn_etudiant;
    // action bar
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_enseignant = (ImageButton) findViewById(R.id.btn_enseignant);
        btn_etudiant=(ImageButton)findViewById(R.id.btn_etudiant);


        // get the action bar
       // ActionBar actionBar = getActionBar();


        // Hide the action bar title
      //  actionBar.setDisplayShowTitleEnabled(true);


       // getActionBar().setIcon(null);

        // Changing the action bar icon
     //   actionBar.setIcon(null);


       // actionBar = getActionBar();
       // actionBar.setTitle("Acceuil");
      //  actionBar.setDisplayUseLogoEnabled(false);
       // actionBar.setIcon(null);
        //actionBar.setHomeButtonEnabled(false);
        //actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.setDisplayShowHomeEnabled(true);
       // actionBar.setDisplayShowTitleEnabled(true);





        btn_enseignant.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Authentification_Enseignant.class);
                startActivity(i);
                finish();
            }
        });



        btn_etudiant.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Authentification_Etudiant.class);
                startActivity(i);
                finish();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Recherche) {
            chercher();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void chercher() {

        Intent i=new Intent(MainActivity.this, Recherche.class);

        startActivity(i);


    }
}
