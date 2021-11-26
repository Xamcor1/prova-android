package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    TextView txtSaluta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        txtSaluta = findViewById(R.id.txtSaluta);
    }

    public void saluta(View v) {
        txtSaluta.setText("Ciao " +edtNome.getText());
    }

}