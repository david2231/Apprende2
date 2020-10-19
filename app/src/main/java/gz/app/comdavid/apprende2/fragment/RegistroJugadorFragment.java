//Librerias
package gz.app.comdavid.apprende2.fragment;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.adapters.AdaptadorAvatar;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.interfaces.IComunicaFragments;




/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegistroJugadorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistroJugadorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    //Creamos la variable actuvidad
    Activity actividad;
    //Creamos una la variable vista para inflar el fragemnto
    View vista;
    //Comunicamos los fragmentos mediante la interfaz IComunicaFragment
    IComunicaFragments iComunicaFragments;
    // Declaracion de la vista de avatars
    RecyclerView recyclerAvatars;
    // Botón Flotante
    FloatingActionButton fabregistro;
    // Botón Microfono
    ImageButton img_btn_Usuarios;
    // Nombre de usuario
    EditText campoNick;
    // Barra de progresoEdad
    SeekBar edad;
    // Texto que trae valores ingresados por el usuario
    TextView valoredad,grabar,TxtRol;
    // Radio Button
    RadioButton radioM,radioF;
    // Nombre Usuario
    String usuario;
    // Sonido Avatar
    MediaPlayer mp;
    public static String nickName;

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;



    public RegistroJugadorFragment() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegistroJugadorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegistroJugadorFragment newInstance(String param1, String param2) {
        RegistroJugadorFragment fragment = new RegistroJugadorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // llama a la clase onCreate para completar la creación de una actividad
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Se infla el layout con el contenido del fragmento registro_jugador
        vista=inflater.inflate(R.layout.fragment_registro_jugador, container, false);
        //Se infla la lista de los avatars
        recyclerAvatars=vista.findViewById(R.id.recyclerAvatarsId);
        //Boton flotante de registro
        fabregistro=vista.findViewById(R.id.idFabRegistro);
        //Campo Nombre de usuario
        campoNick=vista.findViewById(R.id.campoNickName);
        campoNick=(EditText)vista.findViewById(R.id.campoNickName);
        TxtRol=(TextView) vista.findViewById(R.id.TxtRol);
        //Radio Button genero del usuario
        radioF=vista.findViewById(R.id.radioF);
        radioM=vista.findViewById(R.id.radioM);
        //Indicar que el recycler view es de tipo grid layout con 3 columnas
        recyclerAvatars.setLayoutManager(new GridLayoutManager(this.actividad,3));
        recyclerAvatars.setHasFixedSize(true);
        //Barra de progreso selección de edad del usuario
        edad=(SeekBar)vista.findViewById(R.id.edad);
        valoredad=(TextView) vista.findViewById(R.id.valoredad);
        // Campo de texo para almacenar  el nombre de usuario por medio de voz
        grabar = (TextView) vista.findViewById(R.id.usuariotext);
        // Botón que habilita el microfono en el dispositivo
        img_btn_Usuarios=(ImageButton)vista.findViewById(R.id.img_btn_Usuarios);
        Button sonidoavatar = (Button)vista.findViewById(R.id.Avatar_Registro);
        mp.start();
        // Llamamos el método recuperarDatos que contiene las preferencias del nombre del usuario
        recuperarDatos();


        //Se declara una variable para llamar el audio
        mp= MediaPlayer.create(getContext(),R.raw.sonidoa);
        //evento del botón avatar
        sonidoavatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar audio
                mp.start();

            }
        });
        // Creamos el evento para el boton img_btn_Usuarios
        img_btn_Usuarios.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Creamos el evento para el boton img_btn_Usuarios
                Intent intentActionRecognizeSpeech = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                // Intent del Reconocimiento de Voz
                intentActionRecognizeSpeech.putExtra(
                        // Se selecciona  el Lenguaje  (Español)
                        RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-419");
                // Se crea un try catch que permite validar si el dispositivo soporta el reconocimiento por voz
                try {
                    startActivityForResult(intentActionRecognizeSpeech,
                            RECOGNIZE_SPEECH_ACTIVITY);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(actividad.getApplicationContext(),
                            "Tú dispositivo no soporta el reconocimiento por voz",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
// Creamos el evento para la barra de progreso de la edad
edad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progess, boolean b) {
        // El campo valoredad va incrementándose cada vez que el usuario deslice el dedo sobre la barra
        valoredad.setText(progess +"");

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});
        // Creamos el evento para el botón registro
        fabregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Guardamos la preferencia del nombre usuario
                usuario=campoNick.getText().toString();
                //Llamamos el método ejecutarServicio y colocamos la url del servicio php
                ejecutarServcio("https://appprende02.000webhostapp.com/insertar_jugador.php");


            }
        });
        //Se crea un adaptador para asignarlo al adaptador grid y enviamos la lista de avatars de Utilidades
        final AdaptadorAvatar miAdaptador=new AdaptadorAvatar(Utilidades.listaAvatars);
        recyclerAvatars.setAdapter(miAdaptador);
        //Retorna la vista
        return vista;
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:

                if (resultCode==actividad.RESULT_OK && null != data) {
                    //  el Speech en un ArrayList
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    // Obtiene el reconociento de voz de la Posción 0 siendo el más Preciso
                    String strSpeech2Text = speech.get(0);
                    // Actualiza el valor del campoNick
                    grabar.setText(strSpeech2Text);
                    campoNick.setText(strSpeech2Text);

                }
                break;
            default:
                break;
        }
    }


//Metodo encargado de validar los datos ingresados, contiene un parametro de tipo string para almacenar la URL del web service
    private void ejecutarServcio(String URL){
        // Creación de una variable tipo string para vacia
        String genero="";
        // Opción Masculino marcada
        if(radioM.isChecked()==true){
            genero="M";
        }
        // Opción Femenino marcada
        else if (radioF.isChecked()==true){
            genero="F";
        }
        // Ninguna opción seleccionada
        else{
            genero="No";
        }
        // Validación que los campos no esten vacios Genero, Nombre, Edad
        if (!genero.equals("No")&&!campoNick.getText().toString().trim().equals("")&&!valoredad.getText().toString().trim().equals("Selecciona tu Edad")){

            // Almacena el valor seleccionado en el radio button
        final String finalGenero = genero;
        // Objeto stringRequest el cual tiene el parametro POST de envio de datos la URL y la clase Response
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            // En caso de  procesarse la petición al servidor
            public void onResponse(String response) {
                Log.d("Response Value: ", response);
                // Se valida que el usuario no este registrado en la base de datos
                if (response.equals("El usuario ya se encuentra registrado")) {
                    Toast.makeText(actividad.getApplicationContext(), "El usuario ya existe, por favor intenta de nuevo ", Toast.LENGTH_SHORT).show();

                }
                // En caso de que no exista se guardan los datos
                else{
                    // Ejecuta el metodo guardarPreferencias
                    guardarPreferencias();
                    //Muestra el mensaje de registro exitoso
                    Toast.makeText(actividad.getApplicationContext(), "Registro exitoso", Toast.LENGTH_SHORT).show();
                    //Abrir una nueva actividad
                    Intent intent = new Intent(getActivity(), gz.app.comdavid.apprende2.inicio.class);
                    actividad.finish();
                    startActivity(intent);

                }

            }
            // En caso de no procesarse la petición al servidor
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //Muestra el mensaje del codigo de error
                Toast.makeText(actividad.getApplicationContext(), "Error de conexión por favor intente de nuevo"+error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){

            @Override
            // Metodo getParams que contiene los parametros que el servicio necesita para devolver una respuesta
            protected Map<String, String> getParams() throws AuthFailureError {

                int avatarId=Utilidades.avatarSeleccion.getId();
                //A través del obejeto Map Se crea una instancia con el nombre parametros
                Map<String,String> parametros=new HashMap<String, String>();
                //Mediante el metodo put se ingresan los datos a enviar
                //En la primera variable se coloca la variable post que se declaro en el insertar_jugador.php
                //En la segunda variable se coloca el dato que se enviara
                parametros.put("nombre",usuario);
                String genero1 = parametros.put("genero",String.valueOf(finalGenero));
                String avatar = parametros.put("avatar", String.valueOf(avatarId));
                parametros.put("rol",TxtRol.getText().toString());
                parametros.put("edad",valoredad.getText().toString());
                SharedPreferences preferencias= actividad.getSharedPreferences("avatars",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=preferencias.edit();
                editor.putString("avatar", String.valueOf(avatarId));
                //Mediante el metodo commit se guardan todos los cambios
                editor.commit();
                //Se retornan todos los datos mediante la instancia parametros
                return parametros;


            }
        };

        // Se crea una instancia de la actividad
        RequestQueue requestQueue= Volley.newRequestQueue( actividad);
        // Se instancia el objeto stringRequest la cual ayuda a procesar las peticiones realizadas
        requestQueue.add(stringRequest);
       // stringRequest.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 2, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));


        }
        // Mensaje de error solicitando la validación de los datos ingresados
        else {
            Toast.makeText(actividad.getApplicationContext(), "Verifica los datos, no se puede dejar ningún campo vacío", Toast.LENGTH_SHORT).show();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.actividad= (Activity) context;
            iComunicaFragments= (IComunicaFragments) this.actividad;
        }
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    // Declaración de un metodo llamado guardarPreferencias
    private void guardarPreferencias(){
        // Se crea un objeto llamado preferences y se le asigna un nombre
        SharedPreferences preferences= actividad.getSharedPreferences("iniciousuario",Context.MODE_PRIVATE);
        //Se define que se quieren almacenar o actualizar datos en la preferencia
        SharedPreferences.Editor editor=preferences.edit();
        //Se agrega el campo que se almacenara en la preferencia
        editor.putString("usuario",usuario);
        editor.putBoolean("session",true);
        //Mediante el metodo commit se guardan todos los cambios
        editor.commit();
    }
    //Metodo que permite recuperar los datos
    private void recuperarDatos(){
        //Se realiza el llamado de la preferencia como se definio en el metodo guardarPreferencias
        SharedPreferences preferences= actividad.getSharedPreferences("iniciousuario",Context.MODE_PRIVATE);
        //Se asignan las preferencias guardadas en el activity
        campoNick.setText(preferences.getString("usuario", "ingrese usuario"));

    }

    public void huw(View view) {

    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

}