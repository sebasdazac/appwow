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

        lvEmpleados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                Intent intent = new Intent(MainActivity.this,Detalle.class);
                intent.putExtra("dato",arrayEmpleados.get(posicion));
                startActivity(intent);
            }
        });

    }

    private ArrayList<Empleado> GetArrayEmpleados(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado(R.drawable.avatar1,"Sebas", "Castiblanco", "wow1@bextsa.com","Programador"));
        listaEmpleados.add(new Empleado(R.drawable.avatar2,"Carolayn", "Castillo", "wow2@bextsa.com","Programador"));
        listaEmpleados.add(new Empleado(R.drawable.avatar3,"Pablo", "Daza", "wow3@bextsa.com","Programador"));
        listaEmpleados.add(new Empleado(R.drawable.avatar4,"Julieth", "Gutierrez", "wow4@bextsa.com","Programador"));
        return listaEmpleados;
    }
}