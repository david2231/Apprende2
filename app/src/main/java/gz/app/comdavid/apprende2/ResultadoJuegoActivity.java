package gz.app.comdavid.apprende2;
//Librerias
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

import java.util.HashMap;
import java.util.Map;

import gz.app.comdavid.apprende2.clases.vo.Preferencias;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.fragment.RegistroJugadorFragment;

public class ResultadoJuegoActivity extends AppCompatActivity {

    TextView txtResCorrectas,txtResIncorrectas,txtCorrectas,txtIncorrectas,txtResultados,txtPuntaje;
    Button btnInicio;
    RelativeLayout layoutFondo;
    TextView textNickName;
    ImageView imagenAvatar;
    String avatar;

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
        layoutFondo=findViewById(R.id.idLayoutFondo);
        textNickName=findViewById(R.id.textNickName);
        imagenAvatar=findViewById(R.id.avatarImage);
        txtResCorrectas.setText(Utilidades.correctas+"");
        txtResIncorrectas.setText(Utilidades.incorrectas+"");


        ejecutarServcios("https://appprende02.000webhostapp.com/insertar_puntaje.php");
        asignarValoresPreferencias();
        btnInicio=findViewById(R.id.inicioJuego1);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Finaliza la actividad
                finish();
            }
        });

    }


    private void asignarValoresPreferencias() {

        SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
        SharedPreferences preferencias= getSharedPreferences("avatars", Context.MODE_PRIVATE);
        textNickName.setText(preferences.getString("usuario", "ingrese usuario"));
        txtPuntaje.setText(preferencias.getString("avatar", "sin avatar"));
        txtPuntaje.setVisibility(View.GONE);
        avatar=txtPuntaje.getText().toString();

        if(avatar=="1"){
            imagenAvatar.setImageResource(R.drawable.logofin);
}
        if(avatar=="2"){
            imagenAvatar.setImageResource(R.drawable.avatar2);
        }

        if(avatar=="3"){
            imagenAvatar.setImageResource(R.drawable.avatar3);
        }

        if(avatar=="4"){
            imagenAvatar.setImageResource(R.drawable.avatar4);
        }
        if(avatar=="5"){
            imagenAvatar.setImageResource(R.drawable.avatar5);
        }
        if(avatar=="6"){
            imagenAvatar.setImageResource(R.drawable.avatar6);
        }
        if(avatar=="7"){
            imagenAvatar.setImageResource(R.drawable.avatar7);
        }
        if(avatar=="8"){
            imagenAvatar.setImageResource(R.drawable.avatar8);
        }
        if(avatar=="9"){
            imagenAvatar.setImageResource(R.drawable.avatar9);
        }

        if(avatar=="10"){
            imagenAvatar.setImageResource(R.drawable.avatar10);
        }
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