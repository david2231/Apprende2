package gz.app.comdavid.apprende2.Juegos.Silabas3;

//Librerias
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Silabas.silabas;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

//Clase Juegossilaba
public class juegosil16 extends AppCompatActivity implements View.OnClickListener  {
    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes,incorrecta,txtIdentificador,txtIdentificadorSubmodulo,textId,Modulo;
    //Se declaran los image view
    ImageView silba,silbas,silbe,err;
    //Se declaran los sonidos
    MediaPlayer mp,mp2,mp3,mp4;
    //Se declara la vista principal
    RelativeLayout casss;
    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil16);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionafa);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegofa2);
        silbas=(ImageView) findViewById(R.id.siljuegofe);
        silbe=(ImageView) findViewById(R.id.siljuegofi);
        err=(ImageView) findViewById(R.id.silerror16);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista16);
        //Audio Mal
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido faro
        mp3= MediaPlayer.create(this,R.raw.faro);
        // se llaman las Imagenes
        findViewById(R.id.siljuegofa2).setOnClickListener(this);
        findViewById(R.id.siljuegofi).setOnClickListener(this);
        findViewById(R.id.siljuegofe).setOnClickListener(this);
        findViewById(R.id.siljuegofa).setOnClickListener(this);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabasf1);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbasf1);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Declaración del identificador de la categoría
        txtIdentificador=(TextView) findViewById(R.id.Categoria_F);
        //Declaración del identificador del submodulo
        txtIdentificadorSubmodulo=(TextView) findViewById(R.id.SubmoduloF);
        //Declaración del identificador del usuario
        textId=(TextView)findViewById(R.id.Id_user_silabaF);
        //Declaración del modulo
        Modulo=(TextView)findViewById(R.id.Modulo_LecturaF);
        //Se llama el metodo ejecutar servicios
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");

        // sonido de la silaba 16
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas16);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill16);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abre una actividad
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                // transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                // detiene los sonidos
                mp4.stop();
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                // finaliza la actividad
                finish();
            }
        });
    }

    // Metodo onClick
    @Override
    public void onClick(View view) {
        // Switch Case dependiendo de la opción del usuario
        switch (view.getId()) {
            // caso 1
            case R.id.siljuegofe:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            // caso 2
            case R.id.siljuegofa2:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;
            // Caso 3
            case R.id.siljuegofi:
                // Elimina el resto de imagenes que puedan estar en pantalla
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // Reproduce el audio exitoso
                mp3.start();
                Utilidades.correctas++;
                //Actualiza el campo puntaje
                puntajes.setText(Integer.toString(Utilidades.correctas));
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil16.this,juegosil17.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();

                    }
                },3000);

                break;
            // Caso 4
            case R.id.siljuegofa:
                break;
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
                Toast.makeText(juegosil16.this,error.toString(),Toast.LENGTH_SHORT).show();

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





