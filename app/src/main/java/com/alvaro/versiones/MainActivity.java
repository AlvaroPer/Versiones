package com.alvaro.versiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.alvaro.versiones.adaptadores.AdaptadorVersiones;
import com.alvaro.versiones.utils.Versiones;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
        ListView listaVersiones;
        Context contexto;
        Versiones[] versiones;
        ArrayList arrayVersiones;
        ArrayAdapter arrayAdapter;
        AdaptadorVersiones adaptadorVersiones;
        final static String TAG_1="Objeto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        rellenarVersiones();
    }

    private void rellenarVersiones() {
        listaVersiones.setAdapter(adaptadorVersiones);
        arrayVersiones.add(new Versiones("Beta", getResources().getString(R.string.Beta),
                "Septiembre 2008","1.0/1.1", R.drawable.beta, R.drawable.beta));
        arrayVersiones.add(new Versiones("Cupcake", getResources().getString(R.string.Cupcake),
                "Abril 2009","1.5", R.drawable.cupcake, R.drawable.cupcake_det));
        arrayVersiones.add(new Versiones("Donut", getResources().getString(R.string.Donut),
                "Septiembre 2009","1.6", R.drawable.donut, R.drawable.donut_det));
        arrayVersiones.add(new Versiones("Eclair", getResources().getString(R.string.Eclair),
                "Octubre 2009","2.0/2.1", R.drawable.eclair, R.drawable.eclair_det));
        arrayVersiones.add(new Versiones("Froyo", getResources().getString(R.string.Froyo),
                "Mayo 2010","2.2", R.drawable.froyo, R.drawable.froyo_det));
        arrayVersiones.add(new Versiones("Gingerbread", getResources().getString(R.string.Gingerbread),
                "Diciembre 2010","2.3", R.drawable.gingerbread, R.drawable.gige_det));
        arrayVersiones.add(new Versiones("Honeycomb", getResources().getString(R.string.Honeycomb),
                "Febrero 2011","3.0", R.drawable.honeycomb, R.drawable.honey_det));
        arrayVersiones.add(new Versiones("Ice Cream Sandwich", getResources().getString(R.string.IceCreamSandwich),
                "Octubre 2011","4.0", R.drawable.icecream, R.drawable.ice_det));
        arrayVersiones.add(new Versiones("Jelly Bean", getResources().getString(R.string.JellyBean),
                "Agosto 2012","4.1/4.2/4.3", R.drawable.jelly_bean, R.drawable.jelly_det));
        arrayVersiones.add(new Versiones("KitKat", getResources().getString(R.string.KitKat),
                "Octubre 2013","4.4", R.drawable.kitkat, R.drawable.kit_det));
        arrayVersiones.add(new Versiones("Lollipop", getResources().getString(R.string.Lollipop),
                "Diciembre 2014","5.0", R.drawable.lolli_det, R.drawable.lolli_det));
        arrayVersiones.add(new Versiones("Marshmallow", getResources().getString(R.string.Marshmallow),
                "2015","6.0", R.drawable.android_6, R.drawable.android_6_det));
        arrayVersiones.add(new Versiones("Nougat", getResources().getString(R.string.Nougat),
                "2016","7.0", R.drawable.nougat, R.drawable.nougat));
        arrayVersiones.add(new Versiones("Oreo", getResources().getString(R.string.Oreo),
                "2017","8.0", R.drawable.android_oreo, R.drawable.android_oreo));
        arrayVersiones.add(new Versiones("Pie", getResources().getString(R.string.Pie),
                "2018","9.0", R.drawable.apple_pie, R.drawable.apple_det));
        arrayVersiones.add(new Versiones("Android 10", getResources().getString(R.string.Android10),
                "2019","10.0", R.drawable.android10, R.drawable.android10));
        adaptadorVersiones.notifyDataSetChanged();
    }

    private void acciones() {
        listaVersiones.setOnItemClickListener(this);
    }

    private void instancias() {
        listaVersiones = findViewById(R.id.listaVersiones);
        arrayVersiones = new ArrayList();
        adaptadorVersiones = new AdaptadorVersiones(arrayVersiones,getApplicationContext());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.listaVersiones:
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra(TAG_1, (Versiones)adaptadorVersiones.getItem(position));
                startActivity(intent);
                break;
        }

    }
}
