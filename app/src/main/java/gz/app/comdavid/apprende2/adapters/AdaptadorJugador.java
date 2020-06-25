package gz.app.comdavid.apprende2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.clases.vo.AvatarVo;
import gz.app.comdavid.apprende2.clases.vo.JugadorVo;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

public class AdaptadorJugador extends RecyclerView.Adapter<AdaptadorJugador.ViewHolderJugador> implements View.OnClickListener {
    private View.OnClickListener listener;
    List<JugadorVo> listaJugadores;
    View vista;
    int posicionMarcada=0;

    public AdaptadorJugador(List<JugadorVo> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @NonNull
    @Override
    public ViewHolderJugador onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        vista=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_jugador,viewGroup,false);
        vista.setOnClickListener(this);

        return new ViewHolderJugador(vista);
    }

    public void onBindViewHolder(@NonNull ViewHolderJugador viewHolderJugador, int i) {
        // Traer el avatar
        viewHolderJugador.imgAvatar.setImageResource(Utilidades.listaAvatars.get(listaJugadores.get(i).getAvatar()-1).getAvatarId());
        viewHolderJugador.txtNombre.setText(listaJugadores.get(i).getNombre());

        if(listaJugadores.get(i).getGenero().equals("M")){
            viewHolderJugador.txtGenero.setText("Masculino");
        }
        else{
            viewHolderJugador.txtGenero.setText("Femenino");
        }


    }

    public int getItemCount(){
        return listaJugadores.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class ViewHolderJugador extends RecyclerView.ViewHolder {

        ImageView imgAvatar;
        TextView txtNombre;
        TextView txtGenero;
        public ViewHolderJugador(@NonNull View itemView) {
            super(itemView);
            imgAvatar=itemView.findViewById(R.id.idAvatar);
            txtNombre=itemView.findViewById(R.id.idNombre);
            txtGenero=itemView.findViewById(R.id.idGenero);
        }
    }
}
