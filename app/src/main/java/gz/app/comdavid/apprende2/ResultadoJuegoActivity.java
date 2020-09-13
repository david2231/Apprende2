package gz.app.comdavid.apprende2;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

import java.util.HashMap;
import java.util.Map;

import gz.app.comdavid.apprende2.clases.vo.Preferencias;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.fragment.RegistroJugadorFragment;

public class ResultadoJuegoActivity extends AppCompatActivity {

    TextView txtResCorrectas,txtResIncorrectas,txtCorrectas,txtIncorrectas,txtResultados,txtPuntaje,txtResPuntaje;
    FloatingActionButton btnInicio;
    RelativeLayout layoutFondo;
    TextView textNickName;
    ImageView imagenAvatar;
    String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_juego);

        txtResultados =findViewById(R.id.txtResultados);
        txtCorrectas =findViewById(R.id.txtPalabrasCorrectas);
        txtIncorrectas=findViewById(R.id.txtPalabrasIncorrectas);
        txtResCorrectas =findViewById(R.id.txtResPalabrasCorrectas);
        txtResIncorrectas=findViewById(R.id.txtResPalabrasIncorrectas);
        txtPuntaje =findViewById(R.id.txtPuntajeTitulo);
        txtResPuntaje=findViewById(R.id.txtPuntaje);
        layoutFondo=findViewById(R.id.idLayoutFondo);
        textNickName=findViewById(R.id.textNickName);
        imagenAvatar=findViewById(R.id.avatarImage);
        txtResCorrectas.setText(Utilidades.correctas+"");
        txtResIncorrectas.setText(Utilidades.incorrectas+"");
        txtResPuntaje.setText(Utilidades.puntaje+"");

        ejecutarServcios("https://appprende02.000webhostapp.com/insertar_puntaje.php");
        asignarValoresPreferencias();
        btnInicio=findViewById(R.id.btnHome);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }


    private void asignarValoresPreferencias() {

        SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
        SharedPreferences preferencia= getSharedPreferences("avatar", Context.MODE_PRIVATE);
        textNickName.setText(preferences.getString("usuario", "ingrese usuario"));
        txtPuntaje.setText(preferencia.getString("avatar", "ingrese usuario"));
        usuario=textNickName.getText().toString();

    }

    private void registrarResultados() {

        int puntos=Utilidades.puntaje;
        String nivel;

        int correctas=Utilidades.correctas;
        int incorrectas=Utilidades.incorrectas;

    }

    //Metodo encargado de validar los datos ingresados, contiene un parametro de tipo string para almacenar la URL del web service
    private void ejecutarServcios(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
            Toast.makeText(ResultadoJuegoActivity.this,"exito",Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ResultadoJuegoActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){


                // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String,String> parametros=new HashMap<String, String>();
                    String Correctas = parametros.put("Correctas",String.valueOf(Utilidades.correctas));
                    String Incorrectas = parametros.put("Incorrectas",String.valueOf(Utilidades.incorrectas));
                    parametros.put("nombre_usuario",textNickName.getText().toString());
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