package com.master.henda.mes_etudes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerificationCode extends AppCompatActivity {
    private EditText code;
    private Button btn_valider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);

        code = (EditText)findViewById(R.id.code);
        btn_valider =(Button)findViewById(R.id.btn_valider);


        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
