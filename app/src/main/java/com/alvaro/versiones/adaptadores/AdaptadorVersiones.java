package com.alvaro.versiones.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.alvaro.versiones.R;
import com.alvaro.versiones.utils.Versiones;

import java.util.List;

public class AdaptadorVersiones extends BaseAdapter {

    List <Versiones> listaVersiones;
    Context contexto;

    public AdaptadorVersiones(List<Versiones> listaVersiones, Context contexto) {
        this.listaVersiones = listaVersiones;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return listaVersiones.size();
    }

    @Override
    public Object getItem(int i) {
        return listaVersiones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(contexto).inflate(R.layout.lista_layout, viewGroup, false);
        }

        Versiones versiones = listaVersiones.get(i);

        TextView nombreVersion = view.findViewById(R.id.nombreVersion);
        ImageView imagenVersion = view.findViewById(R.id.imagenVersion);
        nombreVersion.setText(versiones.getNombre());
        imagenVersion.setImageResource(versiones.getLogoMain());
        return view;
    }
}
