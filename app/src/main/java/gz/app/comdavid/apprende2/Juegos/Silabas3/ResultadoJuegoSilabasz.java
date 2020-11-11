package gz.app.comdavid.apprende2.Juegos.Silabas3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import gz.app.comdavid.apprende2.Juegos.juegos;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

public class ResultadoJuegoSilabasz extends AppCompatActivity {
    // Se realiza la declaración de los textview
    TextView txtResCorrectas,txtResIncorrectas,txtCorrectas,txtIncorrectas,txtResultados,txtPuntaje,textNickName,txtIdentificadorJuego,textId,txtId_juegos;
    // Se realiza la declaración del botón
    Button btnInicio;
    // Imagenes de los avatars
    ImageView imagenAvatar;
    // Se realiza la declaración de la variable que permite almacenar el id del avatar
    String avatar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_juego_silabasz);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado a la texto resultado
        txtResultados =findViewById(R.id.txtResultadosSilabaz);
        //Llamado al campo variables correctas
        txtCorrectas =findViewById(R.id.txtResPalabrasCorrectasJuegoSilabaz);
        //Llamado al campo variables incorrectas
        txtIncorrectas=findViewById(R.id.txtPalabrasIncorrectasSilabaz);
        //Llamado al texto Incorrectas
        txtResCorrectas =findViewById(R.id.txtResPalabrasCorrectasSilabaz);
        //Llamado al campo variables incorrectas
        txtResIncorrectas=findViewById(R.id.txtResPalabrasIncorrectasSilabaz);
        //Permite almacenar el id del avatar
        txtPuntaje =findViewById(R.id.txtPuntajeTituloSilabaz);
        //Permite almacenar el nombre del usuario
        textNickName=findViewById(R.id.textNickNameSilabaz);
        //llama la Imagen del usuario
        imagenAvatar=findViewById(R.id.avatarImageSilabaz);
        //Actualiza el campo correctas
        txtResCorrectas.setText(Utilidades.correctas+"");
        //Actualiza el campo incorrectas
        txtResIncorrectas.setText(Utilidades.incorrectas+"");
        //Declaración del identificador del submodulo
        txtIdentificadorJuego=(TextView) findViewById(R.id.IdentificadorJuegosz);
        //llamado del identificador del usuario
        textId=(TextView)findViewById(R.id.Id_user_silabaresz);
        //llamado del identificador del juego
        txtId_juegos=(TextView)findViewById(R.id.Id_juegos_silabaz);
        //Se llama el metodo ejecutar servicios
        ejecutarServcios("https://appprende02.000webhostapp.com/insertar_puntaje.php");
        //Llamado al metodo asignarValoresPreferencias
        asignarValoresPreferencias();

        //evento del botón inicio
        btnInicio=findViewById(R.id.inicioJuegoSilabaz);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                //Finaliza la actividad
                finish();
            }
        });

    }

    //Metodo que almacena las preferencias
    private void asignarValoresPreferencias() {

        //Llamado a la preferencia nombre de uusario
        SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
        //Llamado a la preferencia id de avatar
        SharedPreferences preferencias= getSharedPreferences("avatars", Context.MODE_PRIVATE);
        //Se actualiza el campo nombre usuario con la preferencia
        textNickName.setText(preferences.getString("usuario", "ingrese usuario"));
        //Se actualiza el campo con el ID del avatar
        txtPuntaje.setText(preferencias.getString("avatar", "sin avatar"));
        txtPuntaje.setVisibility(View.GONE);
        //Creación de una variable para almacenar el campo
        avatar=txtPuntaje.getText().toString();

        //Se convierte la variable a entero
        int  avatars= Integer.parseInt(avatar);

        //Switch case que actaualiza las imagenes
        switch (avatars) {
            case 1:
                imagenAvatar.setImageResource(R.drawable.avatar1);
                break;
            case 2:
                imagenAvatar.setImageResource(R.drawable.avatar2);
                break;
            case 3:
                imagenAvatar.setImageResource(R.drawable.avatar3);
                break;
            case 4:
                imagenAvatar.setImageResource(R.drawable.avatar4);
                break;
            case 5:
                imagenAvatar.setImageResource(R.drawable.avatar5);
                break;
            case 6:
                imagenAvatar.setImageResource(R.drawable.avatar6);
                break;
            case 7:
                imagenAvatar.setImageResource(R.drawable.avatar7);
                break;
            case 8:
                imagenAvatar.setImageResource(R.drawable.avatar8);
                break;
            case 9:
                imagenAvatar.setImageResource(R.drawable.avatar9);
                break;
            case 10:
                imagenAvatar.setImageResource(R.drawable.avatar10);
                break;
            case 11:
                imagenAvatar.setImageResource(R.drawable.avatar11);
                break;
            case 12:
                imagenAvatar.setImageResource(R.drawable.avatar12);
                break;
            case 13:
                imagenAvatar.setImageResource(R.drawable.avatar13);
                break;
            case 14:
                imagenAvatar.setImageResource(R.drawable.avatar14);
                break;
            case 15:
                imagenAvatar.setImageResource(R.drawable.avatar15);
                break;
            case 16:
                imagenAvatar.setImageResource(R.drawable.avatar16);
                break;
            case 17:
                imagenAvatar.setImageResource(R.drawable.avatar17);
                break;
            case 18:
                imagenAvatar.setImageResource(R.drawable.avatar18);
                break;
            case 19:
                imagenAvatar.setImageResource(R.drawable.avatar19);
                break;
            case 20:
                imagenAvatar.setImageResource(R.drawable.avatar20);
                break;
            case 21:
                imagenAvatar.setImageResource(R.drawable.avatar21);
                break;
            case 22:
                imagenAvatar.setImageResource(R.drawable.avatar22);
                break;
            case 23:
                imagenAvatar.setImageResource(R.drawable.avatar23);
                break;
            case 24:
                imagenAvatar.setImageResource(R.drawable.avatar24);
                break;
            case 25:
                imagenAvatar.setImageResource(R.drawable.avatar25);
                break;
            case 26:
                imagenAvatar.setImageResource(R.drawable.avatar26);
                break;
            case 27:
                imagenAvatar.setImageResource(R.drawable.avatar27);
                break;

        }

    }

    //Metodo encargado de validar los datos ingresados, contiene un parametro de tipo string para almacenar la URL del web service
    private void ejecutarServcios(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultadoJuegoSilabasz.this,error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){


            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                //Llamado a la preferencia nombre de usario
                SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
                //Se actualiza el campo id usuario con la preferencia
                textId.setText(preferences.getString("Id_Usuario", "ingrese usuario"));
                Map<String,String> parametros=new HashMap<String, String>();
                String Correctas = parametros.put("Correctas",String.valueOf(Utilidades.correctas));
                String Incorrectas = parametros.put("Incorrectas",String.valueOf(Utilidades.incorrectas));
                parametros.put("Id_usuario",textId.getText().toString());
                parametros.put("Id_juego",txtId_juegos.getText().toString());
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