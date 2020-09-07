package gz.app.comdavid.apprende2.ui.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.fragment.Instruccion1Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion2Fragment;
import gz.app.comdavid.apprende2.fragment.Instruccion3Fragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    // Genera una nueva instancia de Fragment cuando el usuario deslice su dedo sobre la pantalla
    public static Fragment newInstance(int sectionNumber) {
        Fragment fragment = null;
        //Se crea un switch case con las diferentes fragmentos creados
        switch (sectionNumber){

            case 1: fragment=new Instruccion1Fragment(); break;
            case 2: fragment=new Instruccion2Fragment(); break;
            case 3: fragment=new Instruccion3Fragment(); break;

        }

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_contenedor_instrucciones, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}