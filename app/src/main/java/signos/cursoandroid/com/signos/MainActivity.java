package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {
            "Áries","Touro","Gêmeos","Câncer","Leão",
            "Virgem","Libra","Escorpião","Sagitário",
            "Capricórnio","Aquário","Peixes"
    };
    private String[] perfis = {
            "Árianos são animados","Taurinos são positivos",
            "Geminianos são positivos","Câncer","Leão",
            "Virgem","Libra","Escorpião","Sagitário",
            "Capricórnio","Aquário","Peixes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
          getApplicationContext(),
          android.R.layout.simple_list_item_1,
          signos
        );
        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(),perfis[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
