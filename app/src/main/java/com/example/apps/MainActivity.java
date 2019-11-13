package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
