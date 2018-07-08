package com.master.henda.mes_etudes;


import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Recherche extends Activity {


    private EditText nom_fac;
    private EditText ville_fac;

    private Button chercher;

    private Spinner specialite_fac;

    static final int DATE_DIALOG_ID = 0;


    private ProgressDialog pDialog;
    private ArrayList<HashMap<String, String>> facultes ;
    private ListView faculteList;
    private LinearLayout faculteLayout;
    // action bar
    private ActionBar actionBar;

    // Navigation adapter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);


        nom_fac = (EditText) findViewById(R.id.nom);
        ville_fac = (EditText) findViewById(R.id.ville);
        specialite_fac = (Spinner) findViewById(R.id.specialite);
        faculteList = (ListView) findViewById(R.id.listViewfaculte);
        faculteLayout = (LinearLayout) findViewById(R.id.layoutFacultes);


        chercher = (Button) findViewById(R.id.chercher);

        //  String text = specialite_fac.getSelectedItem().toString();



    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_recherche, menu);


        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {

            // Respond to the action bar's Up/Home button


            case R.id.action_authentification:
                authentification();
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
    private void authentification() {

        Intent i=new Intent(Recherche.this,MainActivity.class);

        startActivity(i);

    }



    private void deconnexion() {

        Toast.makeText(getApplicationContext(),
                "Au revoir", Toast.LENGTH_LONG)
                .show();

        Recherche.this.finish();



    }

    // Actionbar navigation item select listener

    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        // Action to be taken after selecting a spinner item
        return false;
    }
    //return super.onMenuItemSelected(featureId, item);




}

