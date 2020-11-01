package gz.app.comdavid.apprende2.ABC_Drawable;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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

public class Drawable_letter_aa extends AppCompatActivity implements Main_drawable.DrawFinishListener {
    // Se realiza la declaración de los TexView de la interfaz
    TextView txtIdentificador,txtIdentificadorSubmodulo,textNickName,Modulo;
    MediaPlayer mp,mp2;
    Button button;
    // Se obtiene la fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    Date date = new Date();
    String fecha = dateFormat.format(date);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribirr2);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        //Declaración del identificador de la categoría
        txtIdentificador=(TextView) findViewById(R.id.Categoria_escribir);
        //Declaración del identificador del submodulo
        txtIdentificadorSubmodulo=(TextView) findViewById(R.id.Submodulo_escribir);
        //Declaración del identificador del usuario
        textNickName=(TextView)findViewById(R.id.Nombre_user_escribir);
        //Declaración del modulo
        Modulo=(TextView)findViewById(R.id.Modulo_escribir);
        //Se llama el metodo ejecutar servicios
        ejecutarServicios("https://appprende02.000webhostapp.com/Administradora.php");

        //evento Botón incio
        Button inicio= (Button) findViewById(R.id.botoncasaesc);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),escribirinicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        });
        button = (Button)findViewById(R.id.botonreset);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(Drawable_letter_aa.this, Drawable_letter_aa.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);



                    }
                },10);

            }
        });

        LinearLayout llMain = (LinearLayout) findViewById(R.id.llMain);


        int drawable = R.drawable.letraaa;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), drawable);
        Main_drawable image = new Main_drawable(this, bitmap);
        image.setImageBitmap(bitmap);
        llMain.addView(image);
    }





    @Override
    public void onDrawFinish() {
        Toast.makeText(getApplicationContext(), "Finalizado", Toast.LENGTH_LONG).show();
        mp.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(Drawable_letter_aa.this, Drawable_letter_bb.class);
                startActivity(intent);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);

                finish();

            }
        },1000);
    }

    @Override
    public void onDrawStop() {
        Log.i("Action: ", "Draw stop");
    }

    @Override
    public void onDrawStart() {
        Log.i("Action: ", "Draw start");
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
                Toast.makeText(Drawable_letter_aa.this,error.toString(),Toast.LENGTH_SHORT).show();

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

