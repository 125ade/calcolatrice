package com.example.admin.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText in, in1;
    Button som, div, mol, sot, can;
    TextView ris;

    double z,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //operazioni
        som = findViewById(R.id.som);
        div = findViewById(R.id.div);
        mol = findViewById(R.id.mol);
        sot = findViewById(R.id.sot);
        can = findViewById(R.id.can);
        // inserimento
        in = findViewById(R.id.in);
        in1 = findViewById(R.id.in1);
        // risultato
        ris = findViewById(R.id.ris);

        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText("");
                in1.setText("");

            }
        });

        sot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z =Double.parseDouble(in.getText().toString());
                b =Double.parseDouble(in1.getText().toString());
                ris.setText(String.valueOf(z-b));
            }
        });

        mol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z =Double.parseDouble(in.getText().toString());
                b =Double.parseDouble(in1.getText().toString());
                ris.setText(String.valueOf(z*b));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z =Double.parseDouble(in.getText().toString());
                b =Double.parseDouble(in1.getText().toString());
                ris.setText(String.valueOf(z/b));
            }
        });

        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z =Double.parseDouble(in.getText().toString());
                b =Double.parseDouble(in1.getText().toString());
                ris.setText(String.valueOf(z+b));
            }
        });


    }


}
