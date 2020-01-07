package mx.edu.isc.tesoem.karm.gridviewtexto;



import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);
        String [] arreglo = new  String[]{
                "num1","num2","num3","num4",
                "num5","num6","num7","num8",
                "num9","num10","num11","num12",
                "num13","num14","num15","num16",
                "num17","num18","num19","num20",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        gvdatos.setAdapter(adapter);
    }
}
