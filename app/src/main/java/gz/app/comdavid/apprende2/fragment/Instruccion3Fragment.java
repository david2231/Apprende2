package gz.app.comdavid.apprende2.fragment;
//Librerias
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Registro.MainActivity3;

import android.net.Uri;
import android.view.WindowManager;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Instruccion3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Instruccion3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    // Se declara el video view
    private VideoView fragment3;
    // Se declara la vista de la actividad
    View vista;


    public Instruccion3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Instruccion3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Instruccion3Fragment newInstance(String param1, String param2) {
        Instruccion3Fragment fragment = new Instruccion3Fragment();
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
        // Se infla el layout fragment_instruccion 2
        vista=inflater.inflate(R.layout.fragment_instruccion3,container, false);
        // permite que no se bloquee el dispositivo //
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se llama  el video view ubicado en la vista
        fragment3=(VideoView) vista.findViewById(R.id.Fragment3) ;
        // Se añade el video de instrucción 3
        String path=("android.resource://"+getActivity().getPackageName()+"/"+R.raw.fragment3);
        fragment3.setVideoURI(Uri.parse(path));

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editor=preferences.edit();

        int bandera=Integer.parseInt(preferences.getString("bandera","0"));

        if (bandera==1){
            //Llamar el boton
            Button btnLanzarActivity = (Button) vista.findViewById(R.id.botoninicio);
            //Evento Onclick
            btnLanzarActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Abrir una nueva actividad
                    Intent intent = new Intent(getActivity(), gz.app.comdavid.apprende2.inicio.class);
                    startActivity(intent);

                }
            });
        }else{
            editor.putString("bandera","1");
            editor.commit();

            //Llamar el boton
            Button btnLanzarActivity2 = (Button) vista.findViewById(R.id.botoninicio2);
            btnLanzarActivity2.setVisibility(View.VISIBLE);
            //Evento Onclick
            btnLanzarActivity2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Abrir una nueva actividad
                    Intent intent = new Intent(getActivity(), MainActivity3.class);
                    startActivity(intent);

                }
            });
        }


        // Retorna la vista
        return vista;
    }

    // Metodo que permite obtener si el usuario tiene o no activo un fragmento
    public void setUserVisibleHint(boolean isVisibleToUser)
    {
        super.setUserVisibleHint(isVisibleToUser);
        if (this.isVisible())
        {
            if (!isVisibleToUser) // If el usuario tiene activo el fragmento
            {
                // Pausa el video
                fragment3.pause();
            }

            if (isVisibleToUser) // If el usuario no tiene activo el fragmento
            {
                // Reproduce nuevamente el video
                fragment3.start();
            }
        }
    }

    public interface OnFragmentInteractionListener {
    }
}