package mx.edu.ittepic.ejercicio_1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] values = new String[]{"Resumed: Reactiva la actividad","Paused: Pausa la actividad para su uso posterior","Stopped: Detiene la actividad y la cierra","Inactive: Inactiva la actividad","Create:crea una nueva la actividad","Start: comienza la actividad","Destroy:Destruye la actividad"};


        final ListView milista = (ListView)findViewById(R.id.milista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);

        milista.setAdapter(adapter);

        milista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int item = position;
                String valor = (String)milista.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position: "+ item+" - Valor: "+valor, Toast.LENGTH_LONG).show();
            }

        });
    }
}
