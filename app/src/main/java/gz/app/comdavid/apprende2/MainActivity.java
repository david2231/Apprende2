package gz.app.comdavid.apprende2;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import gz.app.comdavid.apprende2.abecedario.abc_a;
import gz.app.comdavid.apprende2.Lectura.lectura1;
import gz.app.comdavid.apprende2.Vocales.vocales;

// Clase MainActivity
public class MainActivity extends AppCompatActivity {
    // Se declaran los sonidos
    MediaPlayer mp;
    //  Se realiza el llamado al botón silencio
    ImageButton silencio;
    // Se realiza el llamado a la imagen sonido activo
    Button silbos;
    // switch que permite cambiar de español a ingles
    Switch switchingles;
    // Se crea un TextView
    TextView TxtModuloLectura;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // Se realiza el llamado a la imagen sonido activo
        silbos=(Button) findViewById(R.id.sonido);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.sonidoo);
        // Se realiza el llamado al valor del campo
        TxtModuloLectura=(TextView) findViewById(R.id.vocal);
        // sonido lectura
        mp= MediaPlayer.create(this,R.raw.lectura);
        // evento que permite silenciar el avatar
        // Se realiza el llamado al servicio
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");
        Button sonidoa = (Button)findViewById(R.id.sonido);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Try Catch que permite silenciar el avatar
                try {
                    // Detiene el sonido
                    mp.stop();
                    mp.prepare();
                    mp.seekTo(0);
                    // Quita el avatar activo de pantalla
                    silbos.setVisibility(View.INVISIBLE);
                    // Muestra el avatar silenciado
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }

            }
        });

        // evento que permite volver a reproducir el sonido del avatar
        ImageButton sonidob = (ImageButton)findViewById(R.id.sonidoo);
        sonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inicia el sonido
                mp.start();
                // Muestra el avatar activo
                silbos.setVisibility(View.VISIBLE);
                // Quita el avatar inactivo de pantalla
                silencio.setVisibility(View.INVISIBLE);


            }
        });
        // evento del botón regresar
        Button regresar= (Button) findViewById(R.id.back);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent i =new Intent(MainActivity.this, inicio.class);
                startActivity(i);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
            }
        });

        // evento que abre el modulo vocales
        Button voc= (Button) findViewById(R.id.vocal);
        voc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), vocales.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
            }
        });
        // evento que abre el modulo abecedario
        Button abce= (Button) findViewById(R.id.abc);
        abce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), abc_a.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
            }
        });
        // evento que abre el modulo juegos
        Button jue= (Button) findViewById(R.id.juego);
        jue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
            }
        });

        // evento que abre el modulo juegos
        Button sil= (Button) findViewById(R.id.silabas);
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();

            }
        });
        // evento que abre el modulo lectura
        Button pal= (Button) findViewById(R.id.palabra);
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), lectura1.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();

            }
        });
        // Switch que cambia de español a ingles
        switchingles =(Switch) findViewById(R.id.switch1);
        // Evento Onclick  del switch
        switchingles.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){

                    // validación si el botón  selaccionado
                    if(switchingles.isChecked()){
            //Abrir una nueva actividad
            Intent intent=new Intent(v.getContext(),mainactivity2.class);
            startActivityForResult(intent,0);
            //Detiene los sonidos  que puedan estar reproduciendose
            mp.stop();
            finish();

        }

}
    });
    }

    //Metodo encargado de validar los datos ingresados, contiene un parametro de tipo string para almacenar la URL del web service
    private void ejecutarServicios(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,"exito",Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show();

            }
        }){


            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("id_modulo",TxtModuloLectura.getText().toString());
                //Se retornan todos los datos mediante la instancia parametros

                return parametros;


            }
        };
        // Haciendo uso de la clase RequestQueue Se crea una instancia de la actividad
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        // Se instancia el objeto stringRequest la cual ayuda a procesar las peticiones realizadas
        requestQueue.add(stringRequest);
    }
}

