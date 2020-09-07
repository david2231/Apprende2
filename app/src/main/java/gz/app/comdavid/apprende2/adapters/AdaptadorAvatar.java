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
//El adaptador realiza el llamado  a la clase ViewHolderAvatar
public class AdaptadorAvatar extends RecyclerView.Adapter<AdaptadorAvatar.ViewHolderAvatar> implements View.OnClickListener{
    private View.OnClickListener listener;
    //Lista de los avatars
    List<AvatarVo> listaAvatars;
    //Se Crea una la variable vista para inflar el fragemnto
    View vista;
    // variable global que almacene la posición marcada
    int posicionMarcada=0;
    // Creación de un constructor que reciba la información desde el fragment que permita alimentar a listaAvatars
    public AdaptadorAvatar(List<AvatarVo> listaAvatars) {
        this.listaAvatars = listaAvatars;
    }

    @NonNull
    @Override
    //En el metodo onCreateViewHolder se infla el layout item_grid_avatar
    public ViewHolderAvatar onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        vista=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_avatar,viewGroup,false);
        vista.setOnClickListener(this);
        //Retorna la clase ViewHolderAvatar y se envia la vista
        return new ViewHolderAvatar(vista);
    }

    public void onBindViewHolder(@NonNull ViewHolderAvatar viewHolderAvatar, int i) {
        //Obtiene el ID de cada elemento avatar
        viewHolderAvatar.imgAvatar.setImageResource(listaAvatars.get(i).getAvatarId());
        // variable posicion del avatar
        final int pos=i;
        // Evento que reconoce cada avatar seleccionado
        viewHolderAvatar.cardAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //capturar la posicion actual del avatar
                posicionMarcada=pos;
                Utilidades.avatarSeleccion=listaAvatars.get(pos);
                Utilidades.avatarIdSeleccion=pos+1;
                //Notifica al adaptador el cambio que se esta realizando
                notifyDataSetChanged();
            }
        });

        //Encontrar la posicion marcada en el avatar
        if(posicionMarcada==i){
            // Cambio de color a la barra cuando este seleccionado
            viewHolderAvatar.barraSeleccion.setBackgroundColor(vista.getResources().getColor(R.color.colorPrimaryDark));

        }

        else{
            // Cambio de color a la barra  cuando no este seleccionado
            viewHolderAvatar.barraSeleccion.setBackgroundColor(vista.getResources().getColor(R.color.colorBlanco));

        }
    }
    //Retona el tamaño de la lista avatars
    public int getItemCount(){
        return listaAvatars.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class ViewHolderAvatar extends RecyclerView.ViewHolder {
        //Se llaman los items  del xml item_grid_avatar
        CardView cardAvatar;
        ImageView imgAvatar;
        TextView barraSeleccion;
        public ViewHolderAvatar(@NonNull View itemView) {
            super(itemView);
            //Se instancian los elementos del xml item_grid_avatar
            cardAvatar=itemView.findViewById(R.id.cardAvatar);
            imgAvatar=itemView.findViewById(R.id.idAvatar);
            barraSeleccion=itemView.findViewById(R.id.barraSeleccionId);
        }
    }
}
