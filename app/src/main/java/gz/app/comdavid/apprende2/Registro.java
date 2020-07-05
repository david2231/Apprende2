package gz.app.comdavid.apprende2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Registro extends AppCompatActivity {
EditText campoNickName1,campoNickName2,campoNickName3;
FloatingActionButton idFabRegistro1;
Button busca,modifica,elimina;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        campoNickName1=(EditText)findViewById(R.id.campoNickName1);
        campoNickName2=(EditText)findViewById(R.id.campoNickName2);
        campoNickName3=(EditText)findViewById(R.id.campoNickName3);
        idFabRegistro1= (FloatingActionButton) findViewById(R.id.idFabRegistro1);
        busca=(Button)findViewById(R.id.btnBuscar);
        modifica=(Button)findViewById(R.id.btnEdita);
        elimina=(Button)findViewById(R.id.btnEliminar);
        busca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscarProducto("http://192.168.0.7/BD_Apprende/buscar_jugador.php?documento="+campoNickName1.getText()+"");
            }
        });
        modifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServcio("http://192.168.0.7/BD_Apprende/editar_usuario.php");
            }
        });
        elimina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eliminarServcio("http://192.168.0.7/BD_Apprende/eliminar_usuario.php");
            }
        });
        idFabRegistro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServcio("http://192.168.0.7/BD_Apprende/insertar_usuario.php");
            }
        });
    }

    private void ejecutarServcio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Registro exitoso", Toast.LENGTH_SHORT).show();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("documento",campoNickName1.getText().toString());
                parametros.put("nombre",campoNickName2.getText().toString());
                parametros.put("profesion",campoNickName3.getText().toString());
                return parametros;
            }
        };
        requestQueue= Volley.newRequestQueue( this);
        requestQueue.add(stringRequest);
    }

    private void buscarProducto (String URL){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {

                        jsonObject = response.getJSONObject(i);
                        campoNickName2.setText(jsonObject.getString("nombre"));
                        campoNickName3.setText(jsonObject.getString("profesion"));
                    } catch (JSONException e) {

                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void eliminarServcio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Borrado Exitoso", Toast.LENGTH_SHORT).show();
                limpiar();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("documento",campoNickName1.getText().toString());
                return parametros;
            }
        };
        requestQueue= Volley.newRequestQueue( this);
        requestQueue.add(stringRequest);
    }

private void limpiar(){
        campoNickName1.setText("");
        campoNickName2.setText("");
        campoNickName3.setText("");
}
}