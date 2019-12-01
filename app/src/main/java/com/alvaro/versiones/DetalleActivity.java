package com.alvaro.versiones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.alvaro.versiones.utils.Versiones;

public class DetalleActivity extends AppCompatActivity {

    TextView nombreVersion, fechaVersion, version, detalle;
    ImageView fotoDetalle;
    Versiones versiones;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        instacias();
    }

    private void instacias() {
        versiones = (Versiones)getIntent().getExtras().get(MainActivity.TAG_1);
        fotoDetalle = findViewById(R.id.imagenDetalle);
        nombreVersion = findViewById(R.id.nombreVersion);
        fechaVersion = findViewById(R.id.fechaVersion);
        version = findViewById(R.id.version);
        detalle = findViewById(R.id.detalle);
        fotoDetalle.setImageResource(versiones.getLogoDetalle());
        nombreVersion.setText(versiones.getNombre());
        fechaVersion.setText(String.valueOf(versiones.getFecha()));
        version.setText(String.valueOf(versiones.getNro_version()));
        detalle.setText(versiones.getDetalle());
        scrollView = findViewById(R.id.scroll);

    }
}
