package com.esdc.appwow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView lvEmpleados;
    private Adaptador adaptador;
    private ArrayList<Empleado> arrayEmpleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmpleados = (ListView) findViewById(R.id.lista);
        arrayEmpleados = GetArrayEmpleados();
        adaptador = new Adaptador(this,GetArrayEmpleados());
        lvEmpleados.setAdapter(adaptador);

        lvEmpleados.setOnItemClickListener((adapterView, view, posicion, l) -> {
            Intent intent = new Intent(MainActivity.this,Detalle.class);
            intent.putExtra("dato",arrayEmpleados.get(posicion));
            startActivity(intent);
        });

    }

    private ArrayList<Empleado> GetArrayEmpleados(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado(
            R.drawable.avatar1,
            "Sebas",
            "Castiblanco",
            "wow1@bextsa.com",
            "Jefe de proyecto",
            "Liderar y gestionar proyectos tecnológicos para los servicios de la empresa" +
                     " como para los servicios del negocio. Renta: $1.800.000"));

        listaEmpleados.add(new Empleado(
                R.drawable.avatar2,
                "Carolayn",
                "Castillo",
                "wow2@bextsa.com",
                "Desarollador Semi Senior",
                "Responsable de los códigos-fuente elaborados en diferentes lenguajes de programación. " +
                        "Renta: $1.300.000"));


        listaEmpleados.add(new Empleado(
                R.drawable.avatar3,
                "Pablo",
                "Daza",
                "wow3@bextsa.com",
                "Ingeniero TI",
                "Salvaguardar y proteger datos e información que poseen sus sistemas y asegurar " +
                        "la continuidad de las operaciones previniendo posibles ataques informáticos. Renta:$1.300.000"));


        listaEmpleados.add(new Empleado(
                R.drawable.avatar4,
                "Julieth",
                "Gutierrez",
                "wow4@bextsa.com",
                "Analista Programador",
                "Encargado del diseño y desarrollo de software para equipos informáticos, es decir, crea una solución informática para una determinada necesidad. " +
                        "Para ello utiliza diferentes lenguajes de programación y bases de datos. Renta: $1.100.000."));



        return  listaEmpleados;
    }
}