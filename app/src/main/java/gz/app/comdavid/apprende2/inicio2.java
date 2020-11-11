package gz.app.comdavid.apprende2;
//Librerias
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

// Clase inicio
public class inicio2 extends AppCompatActivity {
    TextView Videos;
    String Videoss;
    // Se realiza el llamado de los sonidos
    MediaPlayer mp;
    ImageButton silencio;
    // Se realiza el llamado a la imagen sonido activo
    Button silbos;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);
        //llamado al metodo que permite ocultar la barra de navegación
        showOrHideNavBar();
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //llamado al botón  siguiente
        Button inicio= (Button) findViewById(R.id.inicio2);
        // Se realiza el llamado a la imagen sonido activo
        silbos = (Button) findViewById(R.id.SonidoAvatactivo);
        // Se realiza el llamado a la imagen sonido inactivo
        silencio = (ImageButton) findViewById(R.id.SonidoAvataraudiosil);
        // sonido juegos
        mp = MediaPlayer.create(this, R.raw.audifonos);
        //Almacena un valor de 1
        Videos=(TextView) findViewById(R.id.Id_videos) ;
        Videoss=Videos.getText().toString();
        SharedPreferences preferences= getSharedPreferences("registros", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("registro","1");

        editor.commit();
        //evento Botón siguiente
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),inicio.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                //Finaliza la actividad
                finish();

            }
        });

        // evento que permite silenciar el avatar
        Button sonidoa = (Button)findViewById(R.id.SonidoAvatactivo);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Try Catch que permite silenciar el avatar
                try {
                    // Detiene el sonido
                    mp.stop();
                    mp.prepare();
                    mp.seekTo(0);
                    // Quita el avatar activo de pantalla
                    silbos.setVisibility(View.INVISIBLE);
                    // Muestra el avatar silenciado
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }

            }
        });

        // evento que permite volver a reproducir el sonido del avatar
        ImageButton sonidob = (ImageButton)findViewById(R.id.SonidoAvataraudiosil);
        sonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inicia el sonido
                mp.start();
                // Muestra el avatar activo
                silbos.setVisibility(View.VISIBLE);
                // Quita el avatar inactivo de pantalla
                silencio.setVisibility(View.INVISIBLE);


            }
        });
    }
    //Evento que permite ocualtar la barra de navegación y botones
    private void showOrHideNavBar() {

        View decorView = getWindow().getDecorView();
        // oculta la barra de estado.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
               | View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_IMMERSIVE;
        decorView.setSystemUiVisibility(uiOptions);

    }

}
