package gz.app.comdavid.apprende2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.fragment.GestionJugadorFragment;
import gz.app.comdavid.apprende2.fragment.IncioFragment;
import gz.app.comdavid.apprende2.fragment.RegistroJugadorFragment;
import gz.app.comdavid.apprende2.interfaces.IComunicaFragments;
import gz.app.comdavid.apprende2.ui.ContenedorInstrucciones;

//Desde el Api 15 en adelante es necesario agregar en el implements la referencia al fragmento instanciado
public class MainActivity3 extends AppCompatActivity implements IComunicaFragments,IncioFragment.OnFragmentInteractionListener,RegistroJugadorFragment.OnFragmentInteractionListener,GestionJugadorFragment.OnFragmentInteractionListener{
    //Se crean las referencias a las instancias de los fragmentos
    Fragment fragmentInicio,registroJugadorFragment,gestionJugadorFragment,getRegistroUsuario,fragment_consultar_lista_usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Se realiza el llamado a Utilidades con el fin de llenar la lista de avatars
        Utilidades.obtenerListaAvatars();
        //Se genera la instancia del fragmento IncioFragment
        fragmentInicio= new IncioFragment();
        //Se genera la instancia del fragmento RegistroJugadorFragment
        registroJugadorFragment=new RegistroJugadorFragment();
        gestionJugadorFragment=new GestionJugadorFragment();
        //Se ubica el  IncioFragment en el contenedorFragments
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,registroJugadorFragment).commit();
    }

    public AlertDialog dialogoGestionUsuarios(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3.this);

        builder.setTitle("GESTIONAR JUGADOR")
                .setMessage("Indique si desea registrar un nuevo jugador o si desea seleccionar uno ya existente.\n\n" +
                        "También podrá modificar un Jugador desde la opción SELECCIONAR")
                .setNegativeButton("REGISTRAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Toast.makeText(getApplicationContext(),"Registrar Jugador: ",Toast.LENGTH_SHORT).show();
                                //Remplaza el fragment de inicio por registroJugadorFragment
                                getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,registroJugadorFragment).commit();

                            }
                        })
                .setPositiveButton("SELECCIONAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragment_consultar_lista_usuario).commit();
                            }
                        });

        return builder.create();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    //Importar los metodos de la intefaz IcomunicaFragments
    @Override
    public void mostrarMenu() {
        Toast.makeText(getApplicationContext(), "menu main",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarJuego() {
        Toast.makeText(getApplicationContext(), "Iniciar Juego main",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void llamarAjustes() {

        //getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,RegistroUsuario).commit();
    }

    @Override
    public void consultarRanking() {
        Toast.makeText(getApplicationContext(), "consultar main",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void consultarInstrucciones() {
        // Se realizaz el llamado de la actividad ContenedorIntrucciones
        Intent intent=new Intent(this, ContenedorInstrucciones.class);
        startActivity(intent);
    }

    @Override
    public void gestionarUsuario() {
        dialogoGestionUsuarios().show();
    }

    @Override
    public void consultarInformacion() {
        Toast.makeText(getApplicationContext(), "informacion main",Toast.LENGTH_SHORT).show();
    }



}