package com.master.henda.mes_etudes;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;




public class Navegar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    // action bar
  //  private ActionBar actionBar;
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegar);
        NavigationView nv=(NavigationView)findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(this);




        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        // get the action bar
      //  ActionBar actionBar = getActionBar();



       // getActionBar().setIcon(null);

        // Changing the action bar icon
     //  actionBar.setIcon(null);


     // actionBar = getActionBar();
       // actionBar.setTitle("Acceuil");
        //actionBar.setDisplayUseLogoEnabled(false);
        //actionBar.setIcon(null);
      //  actionBar.setHomeButtonEnabled(false);
        //actionBar.setDisplayHomeAsUpEnabled(true);
       //actionBar.setDisplayShowHomeEnabled(true);
        //actionBar.setDisplayShowTitleEnabled(true);


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_navegar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.Notes) {
            chercher();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void chercher() {

        Intent i=new Intent(Navegar.this, Notes.class);

        startActivity(i);


    }

}
