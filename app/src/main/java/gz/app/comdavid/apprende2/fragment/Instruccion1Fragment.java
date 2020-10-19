package gz.app.comdavid.apprende2.fragment;

//librerias
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import android.view.WindowManager;
import gz.app.comdavid.apprende2.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Instruccion1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Instruccion1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // Se declara el video view
    private VideoView fragment1;
    // Se declara la vista de la actividad
    View vista;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Instruccion1Fragment() {

        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Instruccion1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Instruccion1Fragment newInstance(String param1, String param2) {
        Instruccion1Fragment fragment = new Instruccion1Fragment();
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
        // Se infla el layout fragment_instruccion
        vista=inflater.inflate(R.layout.fragment_instruccion1,container, false);
        // permite que no se bloquee el dispositivo
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        fragment1=(VideoView) vista.findViewById(R.id.Fragment1) ;
        // Se añade el video de instrucción 1
        String path=("android.resource://"+getActivity().getPackageName()+"/"+R.raw.fragment1);
        fragment1.setVideoURI(Uri.parse(path));
        fragment1.start();



       return vista;
        // Retorna la vista

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
                fragment1.pause();
            }

            if (isVisibleToUser) // If el usuario no tiene activo el fragmento
            {
                // Reproduce nuevamente el video
                fragment1.start();
            }
        }
    }



    public interface OnFragmentInteractionListener {
    }
}