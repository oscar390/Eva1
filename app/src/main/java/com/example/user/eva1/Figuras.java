package com.example.user.eva1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Figuras extends AppCompatActivity {


    public double cuadrado1, cuadrado2, cuadrado3, cuadrado4;
    public EditText valor_cuadrado1, valor_cuadrado2, valor_cuadrado3, valor_cuadrado4;
    public TextView Resultado_cuadrado;

    public double rectangulo1, rectangulo2, rectangulo3, rectangulo4;
    public EditText valor_rectangulo1, valor_rectangulo2, valor_rectangulo3, valor_rectangulo4;
    public TextView Resultado_rectangulo;

    public double equilatero1, equilatero2, equilatero3;
    public EditText valor_equilatero1, valor_equilatero2, valor_equilatero3;
    public TextView Resultado_equilatero;

    public double isoceles1, isoceles2, isoceles3;
    public EditText valor_isoceles1, valor_isoceles2, valor_isoceles3;
    public TextView Resultado_isoceles;

    public double escaleno1, escaleno2, escaleno3;
    public EditText valor_escaleno1, valor_escaleno2, valor_escaleno3;
    public TextView Resultado_escaleno;

    public double circulo1;
    public EditText valor_circulo1;
    public TextView Resultado_circulo;

    public double rombo1, rombo2, rombo3, rombo4;
    public EditText valor_rombo1, valor_rombo2, valor_rombo3, valor_rombo4;
    public TextView Resultado_rombo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras);

        Toast.makeText(this, "Area de Figuras", Toast.LENGTH_LONG).show();

        valor_cuadrado1 = (EditText) findViewById(R.id.valorcuadrado1);
        valor_cuadrado2 = (EditText) findViewById(R.id.valorcuadrado2);
        valor_cuadrado3 = (EditText) findViewById(R.id.valorcuadrado3);
        valor_cuadrado4 = (EditText) findViewById(R.id.valorcuadrado4);
        Resultado_cuadrado = (TextView) findViewById(R.id.textView1);

        valor_rectangulo1 = (EditText) findViewById(R.id.valorrectangulo1);
        valor_rectangulo2 = (EditText) findViewById(R.id.valorrectangulo2);
        valor_rectangulo3 = (EditText) findViewById(R.id.valorrectangulo3);
        valor_rectangulo4 = (EditText) findViewById(R.id.valorrectangulo4);
        Resultado_rectangulo = (TextView) findViewById(R.id.textView58);


        valor_equilatero1 = (EditText) findViewById(R.id.valorequilatero1);
        valor_equilatero2 = (EditText) findViewById(R.id.valorequilatero2);
        valor_equilatero3 = (EditText) findViewById(R.id.valorequilatero3);
        Resultado_equilatero = (TextView) findViewById(R.id.textView23);


        valor_isoceles1 = (EditText) findViewById(R.id.valorisoceles1);
        valor_isoceles2 = (EditText) findViewById(R.id.valorisoceles2);
        valor_isoceles3 = (EditText) findViewById(R.id.valorisoceles3);
        Resultado_isoceles = (TextView) findViewById(R.id.textView25);


        valor_escaleno1 = (EditText) findViewById(R.id.valorescaleno1);
        valor_escaleno2 = (EditText) findViewById(R.id.valorescaleno2);
        valor_escaleno3 = (EditText) findViewById(R.id.valorescaleno3);
        Resultado_escaleno = (TextView) findViewById(R.id.textView27);


        valor_circulo1 = (EditText) findViewById(R.id.editText16);
        Resultado_circulo = (TextView) findViewById(R.id.editText3);

        valor_rombo1 = (EditText) findViewById(R.id.valorrombo1);
        valor_rombo2 = (EditText) findViewById(R.id.valorrombo2);
        valor_rombo3 = (EditText) findViewById(R.id.valorrombo3);
        valor_rombo4 = (EditText) findViewById(R.id.valorrombo4);
        Resultado_rombo = (TextView) findViewById(R.id.editText77);
    }

    public void Calcular_area(View view) {

        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());
        cuadrado2 = Double.parseDouble(valor_cuadrado2.getText().toString());
        Resultado_cuadrado.setText(Double.toString(cuadrado1 * cuadrado2));

    }

    public void Calcular_perimetro(View view) {

        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());
        cuadrado2 = Double.parseDouble(valor_cuadrado2.getText().toString());
        cuadrado3 = Double.parseDouble(valor_cuadrado3.getText().toString());
        cuadrado4 = Double.parseDouble(valor_cuadrado4.getText().toString());
        Resultado_cuadrado.setText(Double.toString(cuadrado1 + cuadrado2 + cuadrado3 + cuadrado4));

    }


    public void Calcular_diagonal(View view) {

        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());
        cuadrado2 = Double.parseDouble(valor_cuadrado2.getText().toString());
        cuadrado3 = Double.parseDouble(valor_cuadrado3.getText().toString());
        cuadrado4 = Double.parseDouble(valor_cuadrado4.getText().toString());
        Resultado_cuadrado.setText(Double.toString(Math.pow(cuadrado1, 2) + Math.pow(cuadrado2, 2)));

        //math.pow para eleva una potencia//

    }


    public void Calcular_area_rectangulo(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        Resultado_rectangulo.setText(Double.toString(rectangulo1 * rectangulo2));

    }

    public void Calcular_perimetro_rectangulo(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        rectangulo3 = Double.parseDouble(valor_rectangulo3.getText().toString());
        rectangulo4 = Double.parseDouble(valor_rectangulo4.getText().toString());
        Resultado_rectangulo.setText(Double.toString(rectangulo1 + rectangulo2 + rectangulo3 + rectangulo4));

    }

    public void Calcular_diagonal_rectangulo(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        rectangulo3 = Double.parseDouble(valor_rectangulo3.getText().toString());
        rectangulo4 = Double.parseDouble(valor_rectangulo4.getText().toString());
        Resultado_rectangulo.setText(Double.toString(Math.pow(rectangulo1, 2) + Math.pow(rectangulo2, 2)));

    }

    public void Calcular_perimetro_diagonal(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        rectangulo3 = Double.parseDouble(valor_rectangulo3.getText().toString());
        rectangulo4 = Double.parseDouble(valor_rectangulo4.getText().toString());
        Resultado_rectangulo.setText(Double.toString(rectangulo1 + rectangulo2 + rectangulo3 + rectangulo4));

    }


    public void Calcular_area_equilatero(View view) {
        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());
        equilatero2 = Double.parseDouble(valor_equilatero2.getText().toString());
        Resultado_equilatero.setText(Double.toString(equilatero1 * equilatero2 / 4));

    }


    public void Calcular_perimetro_equilatero(View view) {

        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());
        equilatero2 = Double.parseDouble(valor_equilatero2.getText().toString());
        equilatero3 = Double.parseDouble(valor_equilatero3.getText().toString());
        Resultado_equilatero.setText(Double.toString(equilatero1 + equilatero2 + equilatero3));

    }

    public void Calcular_perimetro_semiequilatero(View view) {
        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());
        equilatero2 = Double.parseDouble(valor_equilatero2.getText().toString());
        equilatero3 = Double.parseDouble(valor_equilatero3.getText().toString());
        Resultado_equilatero.setText(Double.toString((equilatero1 + equilatero2 + equilatero3) / 2));
    }

    public void Calcular_area_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());
        Resultado_isoceles.setText(Double.toString(isoceles1 * isoceles2));

    }

    public void Calcular_perimetro_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());
        isoceles3 = Double.parseDouble(valor_isoceles3.getText().toString());
        Resultado_isoceles.setText(Double.toString(isoceles1 + isoceles2 + isoceles3));


    }


    public void Calcular_semiperimetro_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());
        isoceles3 = Double.parseDouble(valor_isoceles3.getText().toString());
        Resultado_isoceles.setText(Double.toString(isoceles1 + isoceles2 + isoceles3 / 2));


    }

    public void Calcular_area_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        Resultado_escaleno.setText(Double.toString(escaleno1 * escaleno2));

    }

    public void Calcular_perimetro_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        escaleno3 = Double.parseDouble(valor_escaleno3.getText().toString());
        Resultado_escaleno.setText(Double.toString(escaleno1 + escaleno2 + escaleno3));

    }

    public void Calcular_semiperimetro_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        escaleno3 = Double.parseDouble(valor_escaleno3.getText().toString());
        Resultado_escaleno.setText(Double.toString(escaleno1 + escaleno2 + escaleno3 / 2));

    }

    public void Calcular_area_circulo(View view) {

        circulo1 = Double.parseDouble(valor_circulo1.getText().toString());
        Resultado_circulo.setText(Double.toString(circulo1 * circulo1));

    }

    public void Calcular_area_rombo(View view) {

        rombo1 = Double.parseDouble(valor_rombo1.getText().toString());
        rombo2 = Double.parseDouble(valor_rombo2.getText().toString());
        Resultado_rombo.setText(Double.toString(rombo1 * rombo2));

    }

    public void Calcular_perimetro_rombo(View view) {

        rombo1 = Double.parseDouble(valor_rombo1.getText().toString());
        rombo2 = Double.parseDouble(valor_rombo2.getText().toString());
        rombo3 = Double.parseDouble(valor_rombo3.getText().toString());
        rombo4 = Double.parseDouble(valor_rombo4.getText().toString());
        Resultado_rombo.setText(Double.toString(rombo1 + rombo2 + rombo3 + rombo4));
    }

    //Metodo boton anterior
    public void Anterior(View view) {
        Intent anterior = new Intent(this, Eva1.class);
        startActivity(anterior);

    }
}