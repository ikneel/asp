package com.example.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    public void onCreate(Bundle si){
        super.onCreate(si);
        setContentView(R.layout.menu);
    }

    public void llamarcalculadora(View w){
        Intent i = new Intent(this, calculadora.class);
        startActivity(i);
    }

    public void llamargaleria(View w){
        Intent i = new Intent(this, galeria.class);
        startActivity(i);
    }

    public void llamarbolita(View w){
        Intent i = new Intent(this, bolita.class);
        startActivity(i);
    }
}
