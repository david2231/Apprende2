package gz.app.comdavid.apprende2.ABC_Drawable;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
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

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Paint.paint2;

public class escribirinicio extends AppCompatActivity {
    // Se crea un TextView
    TextView TxtModuloEscritura;
    // Se realiza el llamado al los botones
    ImageButton silbos,silencio;
    // Se realiza el llamado de los sonidos
    MediaPlayer mp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribirinicio);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // Se realiza el llamado al valor del campo
        TxtModuloEscritura=(TextView) findViewById(R.id.escribirvocales);
        // Se realiza el llamado a la imagen sonido activo
        silbos=(ImageButton) findViewById(R.id.SonidoAvatactivoescribir);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.SonidoAvataraudiosilescribir);
        // sonido inicio
        mp2= MediaPlayer.create(this,R.raw.moduloescritura);
        // se inicia el sonido
        mp2.start();
        // Se realiza el llamado al servicio
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");
        Button inicio= (Button) findViewById(R.id.casa_escribe);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), gz.app.comdavid.apprende2.inicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp2.stop();
                finish();
            }
        });

        // evento que permite silenciar el avatar
        ImageButton boton = (ImageButton)findViewById(R.id.SonidoAvatactivoescribir);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Try Catch que permite silenciar el avatar
                try {
                    // Detiene el sonido
                    mp2.stop();
                    mp2.prepare();
                    mp2.seekTo(0);
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
        ImageButton botonsil = (ImageButton)findViewById(R.id.SonidoAvataraudiosilescribir);
        botonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inicia el sonido
                mp2.start();
                // Muestra el avatar activo
                silbos.setVisibility(View.VISIBLE);
                // Quita el avatar inactivo de pantalla
                silencio.setVisibility(View.INVISIBLE);
            }
        });

        Button juegosil1= (Button) findViewById(R.id.escribirvocales);
        juegosil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), Drawable_letter_aa.class);
                startActivityForResult(intent,0);
                mp2.stop();
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        Button juegosil2= (Button) findViewById(R.id.paints);
        juegosil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), paint2.class);
                startActivityForResult(intent,0);
                mp2.stop();
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });

    }

    //Metodo encargado de validar los datos ingresados, contiene un parametro de tipo string para almacenar la URL del web service
    private void ejecutarServicios(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(escribirinicio.this,error.toString(),Toast.LENGTH_SHORT).show();

            }
        }){


            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("id_modulo",TxtModuloEscritura.getText().toString());
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
