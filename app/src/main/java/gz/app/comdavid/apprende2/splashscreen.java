package gz.app.comdavid.apprende2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class splashscreen extends AppCompatActivity {
    private VideoView azul;
    public static final String AVATAR_ID="avatarId";
    public static int jugadorId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        azul=(VideoView) findViewById(R.id.intros) ;
        String path=("android.resource://"+getPackageName()+"/"+R.raw.introporfin);
        azul.setVideoURI(Uri.parse(path));
        azul.start();
        //A través de la clase Handler y luego de 2 segundos se pasara a una actividad
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // Se recuperan las preferencias declaradas en RegistroJugadorFragment
                //con el fin de determinar si hay una sesión guarda
                SharedPreferences preferences= getSharedPreferences("iniciousuario", Context.MODE_PRIVATE);
                boolean session=preferences.getBoolean("session",false);
                //Mediante un if se valida si la session es verdadera  muestre el la actividad de inicio
                if(session==true){
                Intent intent=new Intent(splashscreen.this,inicio2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    finish();
                }
                 //Si es falsa  muestre la actividad con el fragment de registro
                else{


                    Intent intent2=new Intent(splashscreen.this,ContenedorInstrucciones.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    finish();
                }

                finish();


            }
        },1000);


    }

}
