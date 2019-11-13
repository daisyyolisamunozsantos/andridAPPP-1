package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent sirve para cambiar de panatalla
             //   Log.i(Settings.INFO, "Products");
                Intent i = new Intent(MainActivity.this, Productos.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
              //  Log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this, Abouts.class);
                startActivity(i);
            }
        });


    }
    @Override
    protected void onResume () {
        super.onResume();//esto codigo se ejecuta antes de todos ok.
        //en este punto la apicacion ya cargo.
        Toast.makeText(this,
                //THIS::: Es.. THIS EN UN ACTIVITY: ES LA ESCENCIA DE UNA PANTALLA
                //THIS ES DE TIPO CONTEXTO:
                "Ya estoy aki mami",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "apliiii ahahahhaha", Toast.LENGTH_SHORT).show();
    }
}
