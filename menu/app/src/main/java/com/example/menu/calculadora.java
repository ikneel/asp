package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class calculadora extends Activity  {
    EditText et1, et2;
    TextView tv1;
    Spinner sp1;


    public void onCreate(Bundle si){
        super.onCreate(si);
        setContentView(R.layout.calculadora);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        sp1 = findViewById(R.id.sp);
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);
    }

    public void operar(View v){
        int valor1 = Integer.parseInt(et1.getText() + "");
        int valor2 = Integer.parseInt(et2.getText() + "");
        String select = sp1.getSelectedItem().toString();

        if(select.equals("sumar")) {
            int op = valor1 + valor2;
            String resultado = "La suma es: " + op;
            tv1.setText(resultado);
        }
        if(select.equals("restar")) {
            int op = valor1 - valor2;
            String resultado = "La resta es: " + op;
            tv1.setText(resultado);
        }
        if(select.equals("multiplicar")) {
            int op = valor1 * valor2;
            String resultado = "La multiplicacion es: " + op;
            tv1.setText(resultado);
        }
        if(select.equals("dividir")) {
            int op = valor1 / valor2;
            String resultado = "La division es: " + op;
            tv1.setText(resultado);
        }
    }
}
