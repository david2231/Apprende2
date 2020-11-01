package gz.app.comdavid.apprende2.Juegos;
//Librerias
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import gz.app.comdavid.apprende2.Juegos.Vocales.juego;
import gz.app.comdavid.apprende2.Juegos.Silabas1.juegosilabas1;
import gz.app.comdavid.apprende2.Juegos.Silabas2.juegosilabas6;
import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;

// Clase juegos
public class juegos extends AppCompatActivity {

    // Se realiza la declaración de los TexView de la interfaz
    TextView txtIdentificador,txtIdentificadorSubmodulo,textNickName,Modulo;
    // Se realiza el llamado de los sonidos
    MediaPlayer mp;
    ImageButton silencio;
    // Se realiza el llamado a la imagen sonido activo
    Button silbos;
    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // Se realiza el llamado a la imagen sonido activo
        silbos = (Button) findViewById(R.id.SonidoAvatarJuego);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio = (ImageButton) findViewById(R.id.SonidoAvatarJuegoSilencio);
        // sonido juegos
        mp = MediaPlayer.create(this, R.raw.lectura);
        //Declaración del identificador de la categoría
        txtIdentificador=(TextView) findViewById(R.id.Categoria_juegos);
        //Declaración del identificador del submodulo
        txtIdentificadorSubmodulo=(TextView) findViewById(R.id.Submodulo_juegos);
        //Declaración del identificador del usuario
        textNickName=(TextView)findViewById(R.id.Nombre_user_juegos);
        //Declaración del modulo
        Modulo=(TextView)findViewById(R.id.Modulo_juegos);
        //Se llama el metodo ejecutar servicios
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");

        //evento Botón incio
        Button inicio= (Button) findViewById(R.id.casa_juego);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                //Transiciones
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Finaliza la actividad
                finish();
            }
        });

        //evento Juegos silabas 1
        Button juegosil1= (Button) findViewById(R.id.juegosilabas1);
        juegosil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosilabas1.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        //evento Juegos silabas 2
        Button juegosil2= (Button) findViewById(R.id.juegosilabas2);
        juegosil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosilabas6.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        //evento Juego vocales
        Button vocales= (Button) findViewById(R.id.juegosvocales);
        vocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juego.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
            }
        });

        // evento que permite silenciar el avatar
        Button sonidoa = (Button)findViewById(R.id.SonidoAvatarJuego);
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
        ImageButton sonidob = (ImageButton)findViewById(R.id.SonidoAvatarJuegoSilencio);
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
                Toast.makeText(juegos.this,error.toString(),Toast.LENGTH_SHORT).show();

            }
        }){


            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                //Llamado a la preferencia nombre de uusario
                SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
                //Se actualiza el campo nombre usuario con la preferencia
                textNickName.setText(preferences.getString("usuario", "ingrese usuario"));
                //Se actualiza el campo con el ID del avatar
                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("fecha_ingreso",fecha);
                parametros.put("Nombre_Usuario",textNickName.getText().toString());
                parametros.put("id_Modulo",Modulo.getText().toString());
                parametros.put("id_categoria",txtIdentificador.getText().toString());
                parametros.put("id_categoria_submodulo",txtIdentificadorSubmodulo.getText().toString());
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
