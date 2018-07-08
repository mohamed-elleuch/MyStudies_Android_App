package com.master.henda.mes_etudes;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class Details extends Activity {



    private TextView nom_fac;
    private TextView adr_fac;

    private TextView mail_fac;
    private TextView tel_fac;
    private TextView description;
    private TextView desc_fac;

    private ImageView photo_fac;
    private ImageView photo_adresse;
    private ImageView photo_mail;
    private ImageView photo_tel;
    private Button btn_reserver;
    private View view;
    private View  view1;



    private HashMap<String, String> data;

    // action bar
    private ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);




        nom_fac = (TextView) findViewById(R.id.nom_fac);
        adr_fac = (TextView) findViewById(R.id.adr_fac);
        mail_fac = (TextView) findViewById(R.id.mail_fac);
        tel_fac = (TextView) findViewById(R.id.tel_fac);
        description = (TextView) findViewById(R.id.description);
        desc_fac = (TextView) findViewById(R.id.desc_fac);
        photo_fac = (ImageView) findViewById(R.id.photo_fac);

        view = (View) findViewById(R.id.view);
        view1 = (View) findViewById(R.id.view1);


        // get the action bar
        ActionBar actionBar = getActionBar();


        // Enabling Back navigation on Action Bar icon
        actionBar.setDisplayHomeAsUpEnabled(true);


        // Hide the action bar title
        actionBar.setDisplayShowTitleEnabled(true);

        getActionBar().setIcon(null);

        // Changing the action bar icon
        actionBar.setIcon(null);

        // Changing the action bar icon
        // actionBar.setIcon(R.drawable.ico_actionbar);

        actionBar = getActionBar();
        actionBar.setTitle("Detail");
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setIcon(null);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);


        data = (HashMap<String, String>) getIntent().getExtras().get("data");


        nom_fac.setText(data.get("nom_fac"));
        adr_fac.setText(data.get("adr_fac"));
        mail_fac.setText(data.get("mail_fac"));
        tel_fac.setText(data.get("tel_fac"));
        desc_fac.setText(data.get("desc_fac"));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.details, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {
          //  case R.id.item_map:
          //  {
             //   Intent i=new Intent(Details.this, Map.class);
              //  i.putExtra("depart", data.get("depart"));
              //  i.putExtra("arrivee", data.get("arrivee"));
             //   startActivity(i);
               // break;
           // }
            case R.id.item_contact:
            {
                Intent i=new Intent(Details.this, Inscrit_Enseignant.class);
                startActivity(i);
                break;
            }
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;


            default:
                break;
        }
        return super.onMenuItemSelected(featureId, item);
    }

}










