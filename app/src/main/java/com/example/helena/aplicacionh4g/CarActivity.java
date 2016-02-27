package com.example.helena.aplicacionh4g;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class CarActivity extends ActionBarActivity {

    private static String ERROR_CAR_ACTIVITY = "Error actividad Car";
    TextView eficiencia;
    int eValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        eficiencia = (TextView) findViewById(R.id.eficienciaView);


    }

    public void finalizar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}