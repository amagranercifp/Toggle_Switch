package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleBtn;
    private Switch switch1;
    private ConstraintLayout idLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        idLayout = (ConstraintLayout) findViewById(R.id.idLayout);

        //Definimos los colores
        int black = ContextCompat.getColor(this, R.color.black);
        int white = ContextCompat.getColor(this, R.color.white);
        int encendido = ContextCompat.getColor(this, R.color.encendido);
        int apagado = ContextCompat.getColor(this, R.color.apagado);

        //Recuperamos el toggleButton
        toggleBtn = (ToggleButton) findViewById(R.id.btnToggle);
        // on below line we are setting text view by
        // checking toggle button status.
        if (toggleBtn.isChecked()) {
            // if button is checked we are setting
            // text as Toggle Button is On
            idLayout.setBackgroundColor(black);
            toggleBtn.setTextColor(encendido);
        } else {
            // if button is unchecked we are setting
            // text as Toggle Button is Off
            idLayout.setBackgroundColor(white);
            toggleBtn.setTextColor(apagado);
        }

        //Recuperamos el switch
        switch1 = findViewById(R.id.switch1);

        // on below line we are checking
        // the status of switch
        if (switch1.isChecked()) {
            // on below line we are setting text
            // if switch is checked.
            idLayout.setBackgroundColor(black);
        } else {
            // on below line we are setting the text
            // if switch is un checked
            idLayout.setBackgroundColor(white);
        }

        // on below line we are adding check change listener for our switch.
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // on below line we are checking
                // if switch is checked or not.
                if (isChecked) {
                    // on below line we are setting text
                    // if switch is checked.
                    idLayout.setBackgroundColor(black);

                } else {
                    // on below line we are setting text
                    // if switch is unchecked.
                    idLayout.setBackgroundColor(white);
                }
            }
        });


        // on below line we are adding click listener for our toggle button
        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are checking if
                // toggle button is checked or not.
                if (toggleBtn.isChecked()) {
                    // on below line we are setting message
                    // for status text view if toggle button is checked.
                    idLayout.setBackgroundColor(black);
                    toggleBtn.setTextColor(encendido);
                    //toggleBtn.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    // on below line we are setting message for
                    // status text view if toggle button is un checked.
                    idLayout.setBackgroundColor(white);
                    toggleBtn.setTextColor(apagado);
                }
            }
        });
    }
}