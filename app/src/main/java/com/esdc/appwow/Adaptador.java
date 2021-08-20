package com.esdc.appwow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Empleado> listaEmpleados;

    public Adaptador(Context context, ArrayList<Empleado> listaEmpleados) {
        this.context = context;
        this.listaEmpleados = listaEmpleados;
    }

    // datos a pasar y tamaño de la lista
    @Override
    public int getCount() {
        return listaEmpleados.size();
    }

    // devuelve de la lista la posición del item
    @Override
    public Object getItem(int posicion) {
        return listaEmpleados.get(posicion);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // se crea la vista de cada empleado
    @Override
    public View getView(int posicion, View vista, ViewGroup viewGroup) {
        Empleado empleado = (Empleado) getItem(posicion);
        vista = LayoutInflater.from(context).inflate(R.layout.activity_info, null);
        ImageView imgAvatar = (ImageView) vista.findViewById(R.id.imgAvatar);
        TextView tvNombre = (TextView) vista.findViewById(R.id.tvNombres);
        TextView tvApellido = (TextView) vista.findViewById(R.id.tvApellidos);
        TextView tvCorreo = (TextView) vista.findViewById(R.id.tvCorreo);

        imgAvatar.setImageResource(empleado.getAvatar());
        tvNombre.setText(empleado.getNombres());
        tvApellido.setText(empleado.getApellidos());
        tvCorreo.setText(empleado.getCorreo());
        return vista;
    }
}
