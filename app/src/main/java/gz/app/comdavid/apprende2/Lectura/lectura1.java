package gz.app.comdavid.apprende2.Lectura;
//Librerias
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Silabas.silabas;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

// Clase de la actividad lectura
public class lectura1 extends AppCompatActivity  implements View.OnClickListener{
    // Se realiza la declaración de los TexView de la interfaz
    TextView txtIdentificador,txtIdentificadorSubmodulo,textId,Modulo;
    // Se realiza la declaración de los TexView de la interfaz
    TextView grabar,puntajes,incorrecta,bien;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2;
    // Se realiza la declaración de la vista del video
    private VideoView azul;
    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Super clase onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribir);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado del videoview
        azul=(VideoView) findViewById(R.id.videoazul) ;
        //LLamado a la ubicadión del video en el paquete raw
        String path=("android.resource://"+getPackageName()+"/"+R.raw.casaas);
        //Obtención del video
        azul.setVideoURI(Uri.parse(path));
        //Se inicia el video automaticamente
        azul.start();
        //Llamado al sonido exitoso
        mp= MediaPlayer.create(this,R.raw.bien);
        //Llamado al sonido mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        //se establece el evento
        findViewById(R.id.videoazul).setOnClickListener(this);
        //Salida de texto en pantalla
        bien=(TextView) findViewById(R.id.textoo1);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajeLectura);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectasLectura);
        //Permite presionar en cualquier lugar del video para volver a reproducirlo
        grabar = (TextView) findViewById(R.id.txtGrabarVoz);
        //Declaración del identificador de la categoría
        txtIdentificador=(TextView) findViewById(R.id.Categoria_lectura);
        //Declaración del identificador del submodulo
        txtIdentificadorSubmodulo=(TextView) findViewById(R.id.Submodulo_lectura);
        //Declaración del identificador del usuario
        textId=(TextView)findViewById(R.id.Id_user_frases);
        //Declaración del modulo
        Modulo=(TextView)findViewById(R.id.Modulo_lectura);
        //Se llama el metodo ejecutar servicios
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");


        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_lectura);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene el video y los sonidos que puedan estar reproduciendose
                azul.stopPlayback();
                azul.seekTo(0);
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                //Finaliza la actividad
                finish();
            }
        });

        //Evento del botón siguiente
        Button sig= (Button) findViewById(R.id.siguiente_lectura);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),lectura2.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                //Detiene el video y los sonidos que puedan estar reproduciendose
                azul.stopPlayback();
                azul.seekTo(0);
                //Finaliza la actividad
                finish();
            }
        });

        //Evento del botón play
        Button azull= (Button) findViewById(R.id.botonazul);
        azull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reproduce nuevamente el video
                azul.start();

            }
        });

        //Evento del botón para presionar en cualquier parte del video para volver a reproducir
        Button omitirr= (Button) findViewById(R.id.omitir1);
        omitirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reproduce nuevamente el video
                azul.start();

            }
        });
    }
    //Se implementa el evento llamado en la clase
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.videoazul:
                azul.start();
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:
                //  Si se presiona en el botón que permite grabar
                if (resultCode == RESULT_OK && null != data) {
                    //  el Speech en un ArrayList
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    // Obtiene el reconociento de voz de la Posción 0 siendo el más Preciso
                    String strSpeech2Text = speech.get(0);
                    // Actualiza el valor del campo con la conversión voz a texto
                    grabar.setText(strSpeech2Text);

                }
                // Validación de los 2 texto iguales
                if(bien.getText().toString().equals(grabar.getText().toString())){

                // Toast que indica que fue exitosa la frase
                Toast.makeText(this,"Bien Hecho",Toast.LENGTH_LONG).show();
                // Reproduce el sonido Bien
                mp.start();
                //Se suma un punto a la opción correcta
                Utilidades.correctas++;
                //Actualiza el campo puntaje
                puntajes.setText(Integer.toString(Utilidades.correctas));

            }
            else{
                // Toast que indica que no fue bien leida la frase
                Toast.makeText(this,"Inténtalo de Nuevo",Toast.LENGTH_LONG).show();
                // Reproduce el sonido Mal
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
            }

                break;
            default:
                break;
        }
    }

    public void onClickImgBtnHablar(View v) {

        // Intent del Reconocimiento de Voz
        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        azul.pause();
        // Se selecciona  el Lenguaje  (Español)
        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-419");

        // Se crea un try catch que permite validar si el dispositivo soporta el reconocimiento por voz
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Tú dispositivo no soporta el reconocimiento por voz",
                    Toast.LENGTH_SHORT).show();
        }
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
                Toast.makeText(lectura1.this,error.toString(),Toast.LENGTH_SHORT).show();

            }
        }){


            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                //Llamado a la preferencia nombre de uusario
                SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
                //Se actualiza el campo id usuario con la preferencia
                textId.setText(preferences.getString("Id_Usuario", "ingrese usuario"));
                //Se actualiza el campo con el ID del avatar
                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("fecha_ingreso",fecha);
                parametros.put("Id_usuario",textId.getText().toString());
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



