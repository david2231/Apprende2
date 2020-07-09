package gz.app.comdavid.apprende2.fragment;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

import java.util.HashMap;
import java.util.Map;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.adapters.AdaptadorAvatar;
import gz.app.comdavid.apprende2.clases.vo.ConexionSQLiteHelper;
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
    Activity actividad;
    View vista;
    IComunicaFragments iComunicaFragments;
    RecyclerView recyclerAvatars;

    FloatingActionButton fabregistro;
    EditText campoNick;
    SeekBar edad;
    TextView valoredad;
    RadioButton radioM,radioF;

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
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista=inflater.inflate(R.layout.fragment_registro_jugador, container, false);
        recyclerAvatars=vista.findViewById(R.id.recyclerAvatarsId);
        fabregistro=vista.findViewById(R.id.idFabRegistro);
        campoNick=vista.findViewById(R.id.campoNickName);
        radioF=vista.findViewById(R.id.radioF);
        radioM=vista.findViewById(R.id.radioM);
        recyclerAvatars.setLayoutManager(new GridLayoutManager(this.actividad,3));
        recyclerAvatars.setHasFixedSize(true);
        campoNick=(EditText)vista.findViewById(R.id.campoNickName);
        edad=(SeekBar)vista.findViewById(R.id.edad);
        valoredad=(TextView) vista.findViewById(R.id.valoredad);
edad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progess, boolean b) {
        valoredad.setText(progess +"");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});
        fabregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejecutarServcio("http://192.168.0.9/BD_Apprende/insertar_jugador.php");
                //registrarJugador();
            }
        });

        final AdaptadorAvatar miAdaptador=new AdaptadorAvatar(Utilidades.listaAvatars);
        recyclerAvatars.setAdapter(miAdaptador);
        return vista;
    }


    private void registrarJugador() {
        System.out.println("Registrar");

        String genero1="";

        if(radioM.isChecked()==true){
            genero1="M";
        }
        else if (radioF.isChecked()==true){
            genero1="F";
        }
        else{
            genero1="No seleccionado";
        }

        if (!genero1.equals("No seleccionado") && campoNick.getText().toString()!=null && !campoNick.getText().toString().trim().equals("")){

            int avatarId=Utilidades.avatarSeleccion.getId();
            String nickname=campoNick.getText().toString();


            String registro="Nombre: "+campoNick.getText().toString()+"\n";
            registro+="Genero:" +genero1+"\n";
            registro+="Avatar Id:" +Utilidades.avatarSeleccion.getId();

            ConexionSQLiteHelper conn=new ConexionSQLiteHelper(actividad,Utilidades.NOMBRE_BD, null, 1 );

            SQLiteDatabase db=conn.getWritableDatabase();

            ContentValues values=new ContentValues();
            values.put(Utilidades.CAMPO_NOMBRE,nickname);
            values.put(Utilidades.CAMPO_GENERO,genero1);
            values.put(Utilidades.CAMPO_AVATAR,avatarId);


            Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);

            if(idResultante!=-1){

                System.out.println("Registrar:" +registro);
                Toast.makeText(actividad,"El Usuario fue registrado con exito \n"+idResultante+" - "+registro,Toast.LENGTH_SHORT).show();
                campoNick.setText("");
            }
            else{

                Toast.makeText(actividad,"No se pudo registar ",Toast.LENGTH_SHORT).show();
            }
            db.close();
        }

        else
        {

            Toast.makeText(actividad,"Verificar los datos! ",Toast.LENGTH_SHORT).show();
        }
    }

    private void ejecutarServcio(String URL){
        String genero="";

        if(radioM.isChecked()==true){
            genero="M";
        }
        else if (radioF.isChecked()==true){
            genero="F";
        }
        else{
            genero="No";
        }
        if (!genero.equals("No")&&!campoNick.getText().toString().trim().equals("")&&!valoredad.getText().toString().trim().equals("Selecciona tu Edad")){

        final String finalGenero = genero;
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Toast.makeText(actividad.getApplicationContext(), "Registro exitoso", Toast.LENGTH_SHORT).show();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(actividad.getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                int avatarId=Utilidades.avatarSeleccion.getId();
                Map<String,String> parametros=new HashMap<String, String>();
                parametros.put("nombre",campoNick.getText().toString());
                String genero1 = parametros.put("genero",String.valueOf(finalGenero));
                String avatar = parametros.put("avatar", String.valueOf(avatarId));
                parametros.put("edad",valoredad.getText().toString());
                return parametros;


            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue( actividad);
        requestQueue.add(stringRequest);

        }

        else {
            Toast.makeText(actividad.getApplicationContext(), "Verifica los datos", Toast.LENGTH_SHORT).show();
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


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}