
package gz.app.comdavid.apprende2.Silabas;
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

import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;

//Clase silabas
public class silabas extends AppCompatActivity {
    // Se realiza la declaración de los TexView de la interfaz
    TextView txtIdentificador,txtIdentificadorSubmodulo,textNickName,Modulo;
    //Se declaran los audio
    MediaPlayer mp;

    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);

    //Método onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_silabas);


        //Declaración del identificador de la categoría
        txtIdentificador=(TextView) findViewById(R.id.Categoria_silaba);
        //Declaración del identificador del submodulo
        txtIdentificadorSubmodulo=(TextView) findViewById(R.id.Submodulo_silaba);
        //Declaración del identificador del usuario
        textNickName=(TextView)findViewById(R.id.Nombre_user_silaba);
        //Declaración del modulo
        Modulo=(TextView)findViewById(R.id.Modulo_silaba);
        //Se llama el metodo ejecutar servicios
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");

        // Evento botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casa);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Sonido Avatar
        Button sonidoa = (Button)findViewById(R.id.sil_sonido);
        mp= MediaPlayer.create(this,R.raw.modulosil);
        // Evento del botón avatar
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inicia el sonido
                mp.start();
                finish();

            }
        });
        //Silaba B
        Button ba= (Button) findViewById(R.id.button);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_b.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba C
        Button ca= (Button) findViewById(R.id.button2);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_c.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba D
        Button da= (Button) findViewById(R.id.button3);
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_d.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba F
        Button fa= (Button) findViewById(R.id.button4);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_f.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba G
        Button ga= (Button) findViewById(R.id.button5);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_g.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba L
        Button la= (Button) findViewById(R.id.button7);
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_l.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba M
        Button ma= (Button) findViewById(R.id.button8);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_m.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba N
        Button na= (Button) findViewById(R.id.button17);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_n.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba P
        Button pa= (Button) findViewById(R.id.button9);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_p.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba R
        Button ra= (Button) findViewById(R.id.button10);
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_r.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba S
        Button sa= (Button) findViewById(R.id.button11);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_s.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba T
        Button ta= (Button) findViewById(R.id.button12);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silabas_t.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba V
        Button va= (Button) findViewById(R.id.button13);
        va.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_v.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba Y
        Button ya= (Button) findViewById(R.id.button14);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_y.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba Z
        Button za= (Button) findViewById(R.id.button15);
        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_z.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
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
                Toast.makeText(silabas.this,error.toString(),Toast.LENGTH_SHORT).show();

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
