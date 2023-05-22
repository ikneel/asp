package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class galeria extends Activity implements View.OnClickListener{

    Button b1, b2;
    ImageView pantalla;
    TextView td;
    int [] img = {R.drawable.smile, R.drawable.bicolor, R.drawable.bite, R.drawable.fight, R.drawable.mask,
            R.drawable.pka, R.drawable.pkp, R.drawable.pose};

    int contador = 0;

    int tam;

    String [] texto = {"1", "2", "3", "4", "5", "6", "7", "8"};

    @Override
    protected void onCreate(Bundle si) {
        super.onCreate(si);
        setContentView(R.layout.galeria);

        b1 = findViewById(R.id.botonatras);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.botonadelante);
        b2.setOnClickListener(this);

        pantalla = findViewById(R.id.iv);
        td = findViewById(R.id.tdescription);
        td.setText("1");
        tam = img.length;

    }
    @Override
    public void onClick(View v) {

        if(b1.equals(v)){
            contador--;
            if(contador < 0 ) contador = tam - 1;
        }
        if(b2.equals(v)){
            contador++;
            if(contador > tam - 1) contador = 0;
        }
        pantalla.setImageResource(img[contador]);
        td.setText(texto[contador]);


    }
}
