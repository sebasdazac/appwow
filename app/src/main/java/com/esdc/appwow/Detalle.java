package com.esdc.appwow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {
    private Empleado empleado;
    private ImageView imgAvatar;
    private TextView tvNombreCompleto,tvCargo, tvCorreo, tvDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        empleado = (Empleado) getIntent().getSerializableExtra("dato");
        tvNombreCompleto = (TextView) findViewById(R.id.tvDetalleNombre);
        tvNombreCompleto.setText(new StringBuilder().append(empleado.getNombres()).append(" ").append(empleado.getApellidos()).toString());

        imgAvatar = (ImageView) findViewById(R.id.imgDetalleAvatar);
        imgAvatar.setImageResource(empleado.getAvatar());

        tvCargo = (TextView) findViewById(R.id.tvDetalleCargo);
        tvCargo.setText(empleado.getCargo());

        tvCorreo = (TextView) findViewById(R.id.tvDetalleCorreo);
        tvCorreo.setText(empleado.getCorreo());

        tvDescripcion = (TextView) findViewById(R.id.tvDetalleInfo);
        tvDescripcion.setText(empleado.getDescripcion());

    }
}