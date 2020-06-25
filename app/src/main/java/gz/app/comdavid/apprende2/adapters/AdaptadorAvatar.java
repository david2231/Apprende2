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
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

public class AdaptadorAvatar extends RecyclerView.Adapter<AdaptadorAvatar.ViewHolderAvatar> implements View.OnClickListener{
    private View.OnClickListener listener;
    List<AvatarVo> listaAvatars;
    View vista;
    int posicionMarcada=0;

    public AdaptadorAvatar(List<AvatarVo> listaAvatars) {
        this.listaAvatars = listaAvatars;
    }

    @NonNull
    @Override
    public ViewHolderAvatar onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        vista=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_avatar,viewGroup,false);
        vista.setOnClickListener(this);

        return new ViewHolderAvatar(vista);
    }

    public void onBindViewHolder(@NonNull ViewHolderAvatar viewHolderAvatar, int i) {
        viewHolderAvatar.imgAvatar.setImageResource(listaAvatars.get(i).getAvatarId());
        //posicion del avatar
        final int pos=i;

        viewHolderAvatar.cardAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //capturar la posicion actual del avatar
                posicionMarcada=pos;
                Utilidades.avatarSeleccion=listaAvatars.get(pos);
                Utilidades.avatarIdSeleccion=pos+1;
                notifyDataSetChanged();
            }
        });

        //Encontrar la posicion marcada en el avatar
        if(posicionMarcada==i){

            viewHolderAvatar.barraSeleccion.setBackgroundColor(vista.getResources().getColor(R.color.colorPrimaryDark));

        }

        else{

            viewHolderAvatar.barraSeleccion.setBackgroundColor(vista.getResources().getColor(R.color.colorBlanco));

        }
    }

    public int getItemCount(){
        return listaAvatars.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class ViewHolderAvatar extends RecyclerView.ViewHolder {
        CardView cardAvatar;
        ImageView imgAvatar;
        TextView barraSeleccion;
        public ViewHolderAvatar(@NonNull View itemView) {
            super(itemView);
            cardAvatar=itemView.findViewById(R.id.cardAvatar);
            imgAvatar=itemView.findViewById(R.id.idAvatar);
            barraSeleccion=itemView.findViewById(R.id.barraSeleccionId);
        }
    }
}
