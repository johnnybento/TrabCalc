package br.edu.impacta.trabcalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
      TextView textView;
      String currentString = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();

        String resultado = intent.getStringExtra("resultado");
        setCurrentString(resultado);
    }


    void setCurrentString(String s) {
        currentString = s;
        textView.setText(s);
    }

}
