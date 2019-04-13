package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProfilActivity extends AppCompatActivity {
    private Button btn_orta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        findViewById(R.id.orta_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ortaIntent= new Intent(getApplicationContext(),OrtaActivity.class);
                startActivity(ortaIntent);
                finish();
            }
        });
    }


}
