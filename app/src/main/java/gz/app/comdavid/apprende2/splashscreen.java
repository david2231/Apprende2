package gz.app.comdavid.apprende2;
// Librerias
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import gz.app.comdavid.apprende2.ui.ContenedorInstrucciones;

// Clase splashscreen
public class splashscreen extends AppCompatActivity {
    // Declaración de la vista del video
    private VideoView azul;

    @Override
    // Metodo onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        // Llamado al video declarado en la vista
        azul=(VideoView) findViewById(R.id.intros) ;
        // Llamado al video en la carpeta de recuros
        String path=("android.resource://"+getPackageName()+"/"+R.raw.splash);
        azul.setVideoURI(Uri.parse(path));
        // Reproduce el video
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
                    Intent intent2=new Intent(splashscreen.this, ContenedorInstrucciones.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    finish();
                }

                finish();

            }
        },6000);

    }

}
