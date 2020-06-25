package gz.app.comdavid.apprende2.fragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.adapters.AdaptadorAvatar;
import gz.app.comdavid.apprende2.adapters.AdaptadorJugador;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.interfaces.IComunicaFragments;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GestionJugadorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GestionJugadorFragment extends Fragment {

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

    RecyclerView recycleAvatars,recyclerJugadores;

    ImageButton btnAtras,btanAyuda;
    EditText campoNick;
    RadioButton radioM,radioF;

    public GestionJugadorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GestionJugadorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GestionJugadorFragment newInstance(String param1, String param2) {
        GestionJugadorFragment fragment = new GestionJugadorFragment();
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
        // Inflate the layout for this fragment
        vista=inflater.inflate(R.layout.fragment_gestion_jugador,container,false);

        recycleAvatars=vista.findViewById(R.id.recyclerAvatarsId);
        recyclerJugadores=vista.findViewById(R.id.recyclerJugadoresId);

        campoNick=vista.findViewById(R.id.campoNickName);
        radioF=vista.findViewById(R.id.radioF);
        radioM=vista.findViewById(R.id.radioM);
        recyclerJugadores.setLayoutManager(new LinearLayoutManager(this.actividad));
        recyclerJugadores.setHasFixedSize(true);

        recycleAvatars.setLayoutManager(new GridLayoutManager(this.actividad,3 ));
        recycleAvatars.setHasFixedSize(true);
        llenarAdaptadorAvatars();
        llenarAdaptadorJugadores();
        return vista;
    }

    private void llenarAdaptadorJugadores() {
        AdaptadorJugador miadaptadorJugadores=new AdaptadorJugador(Utilidades.listaJugadores);
        recyclerJugadores.setAdapter(miadaptadorJugadores);
    }

    private void llenarAdaptadorAvatars() {
        AdaptadorAvatar miadaptadorAvatars=new AdaptadorAvatar(Utilidades.listaAvatars);
        recycleAvatars.setAdapter(miadaptadorAvatars);
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
    // TODO: Update argument type and name
    void onFragmentInteraction(Uri uri);
}
}