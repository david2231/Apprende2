package gz.app.comdavid.apprende2;
//Librerias
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
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
import gz.app.comdavid.apprende2.ABC_Drawable.escribirinicio;
import gz.app.comdavid.apprende2.ui.ContenedorInstrucciones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Clase inicio
public class inicio extends AppCompatActivity {

    Button imageButton4;
    // // Se realiza el llamado al los botones
    ImageButton silbos,silencio;
    // Se realiza el llamado de los sonidos
    MediaPlayer mp2;
    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);
    // Se realiza la declaración del textview para el nombre de usuario
    TextView textNickName;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Permite almacenar el nombre del usuario
        textNickName=findViewById(R.id.Nombre_user);
        // Se realiza el llamado a la imagen sonido activo
        silbos=(ImageButton) findViewById(R.id.imageButton4);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio=(ImageButton) findViewById(R.id.imageButton5);
        // sonido inicio
        mp2= MediaPlayer.create(this,R.raw.bienvenido);
        // se inicia el sonido
        mp2.start();
        // Se realiza el llamado al servicio
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");

        // evento que permite silenciar el avatar
        ImageButton btn=(ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad
                finish();


            }
        });

        // evento que permite abrir el modulo escribir
        ImageButton btnn2=(ImageButton) findViewById(R.id.imageButton2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), escribirinicio.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad

                finish();
            }
        });

        // evento que permite abrir la opción de ayuda
        Button credito=(Button) findViewById(R.id.button18);
        credito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), ContenedorInstrucciones.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp2.stop();
                //finaliza la actividad
                finish();
            }
        });
        // evento que permite silenciar el avatar
        ImageButton boton = (ImageButton)findViewById(R.id.imageButton4);
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
        ImageButton botonsil = (ImageButton)findViewById(R.id.imageButton5);
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

        // evento del botón salir
        ImageButton salir =(ImageButton) findViewById(R.id.imageButton3);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // alert dialog que muestra 2 opciones
                AlertDialog.Builder builder=new AlertDialog.Builder(inicio.this);
                builder.setMessage("¿Quiere salir de la aplicación?").setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    // cierra la aplicación
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent (Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        mp2.stop();
                        finish();

                    }
                })
                        // cierra el aletrt dialog
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                builder.show();

            }
        });



    }



    // evento del botón atras
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // si se presiona el botón atras
        if(keyCode==event.KEYCODE_BACK){
            // alert dialog que muestra 2 opciones
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setMessage("¿Quiere salir de la aplicación?").setPositiveButton("Si", new DialogInterface.OnClickListener() {
        // cierra la aplicación
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent=new Intent (Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        mp2.stop();
        finish();
    }
})
            // cierra el aletrt dialog
        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
        }

        return super.onKeyDown(keyCode, event);
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
                Toast.makeText(inicio.this,error.toString(),Toast.LENGTH_SHORT).show();

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

                //Se retornan todos los datos mediante la instancia parametros
                return parametros;

            }
        };
        // Haciendo uso de la clase RequestQueue Se crea una instancia de la actividad
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        // Se instancia el objeto stringRequest la cual ayuda a procesar las peticiones realizadas
        requestQueue.add(stringRequest);
    }

    public void horaSalida(){


    }

}
