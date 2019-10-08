package com.example.p2rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmActivity2 extends AppCompatActivity implements View.OnClickListener {
Button btnsiguiente1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        btnsiguiente1=(Button) findViewById(R.id.button2);
        btnsiguiente1.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent frm3=new Intent(this,Frm3Activity.class);
        startActivity(frm3);
        finish();
    }
}
