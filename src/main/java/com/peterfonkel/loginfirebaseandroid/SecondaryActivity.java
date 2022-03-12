package com.peterfonkel.loginfirebaseandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    TextView tituloToken, tokenFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        tokenFirebase = findViewById(R.id.tokenFirebase);
        Bundle datos = getIntent().getExtras();
        tokenFirebase.setText(datos.getString("tokenFirebase"));

    }
}