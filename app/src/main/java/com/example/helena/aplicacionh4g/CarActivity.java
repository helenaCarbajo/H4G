package com.example.helena.aplicacionh4g;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
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


    public void onResume() {
        super.onResume();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TextView vista = new TextView(getApplicationContext());
                for (int i = 0; i < 100; i++) {
                    final int value;
                    working();

                    vista.setText(String.valueOf(i));

                }
            }
        };
        new Thread(runnable).start();

        /*
        //CharSequence cadena;
        for (eValor = 0; eValor < 100; eValor++) {
            try {
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        eficiencia.setText(String.valueOf(eValor));
                    }
                }, 2000);

                // Thread.sleep(100);
            } catch (Exception e) {
                Log.e(ERROR_CAR_ACTIVITY, e.toString());

            }

        }

    }
    */


    }

    private void working() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}