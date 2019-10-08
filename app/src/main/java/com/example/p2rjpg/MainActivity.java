package com.example.p2rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsiguiente=(Button) findViewById(R.id.button);
        btnsiguiente.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent frm2=new Intent(this, FrmActivity2.class);
        startActivity(frm2);
        finish();

    }
}
